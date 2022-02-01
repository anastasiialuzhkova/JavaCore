import java.io.*;
import java.util.ArrayList;

public class AppData {
    private String[] header;
    private int[][] data;

    AppData() {
        header = new String[]{};
        data = new int[][]{};
    }

    void save(String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

            writer.write(String.join(";", header));
            writer.newLine();
            for (int[] line: data) {
                StringBuilder str = new StringBuilder();
                for (int value: line) {
                    str.append(value).append(";");
                }
                str.deleteCharAt(str.length()-1);
                writer.write(str.toString());
                writer.newLine();
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void load(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            this.header = reader.readLine().split(";");

            ArrayList<String> dataList = new ArrayList<>();
            while (reader.ready()) {
                dataList.add(reader.readLine());
            }

            data = new int[dataList.size()][];
            for (int i = 0; i < dataList.size(); i++) {
                String[] values = dataList.get(i).split(";");
                data[i] = new int[values.length];
                for (int j = 0; j < values.length; j++){
                    data[i][j] = Integer.parseInt(values[j]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

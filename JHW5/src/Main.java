public class Main {

    public static void main(String[] args) {
        AppData data = new AppData();
        data.load("appdata.csv");
        data.save("appdatanew.csv");
    }
}

import java.util.ArrayList;

public class Box<T extends Fruit> {
    ArrayList<T> arr;

    Box () {
        arr = new ArrayList<T>();
    }

    public void add(T fruit){
        arr.add(fruit);
    }

    public void addAll(ArrayList<T> arrAdd){
        arr.addAll(arrAdd);
    }

    public void move(Box<T> destination) {
        destination.addAll(arr);
        arr.clear();
    }

    public int getCount(){
        return arr.size();
    }

    public String toString(){
        return arr.toString();
    }

    public float getWeight(){
        // Future-proof for unique-weighted fruits
        float weight = 0f;
        for (T fruit: arr) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare (Box<?> box){
        return this.getWeight() == box.getWeight();
    }
}

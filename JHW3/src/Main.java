import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        String[] arr = new String[] {"aaa", "bbb", "ccc"};
        System.out.println("Before swapping: " + Arrays.toString(arr));
        swap(arr, 0, 2);
        System.out.println("After swapping 0 and 2 elements: " + Arrays.toString(arr));

        // Task 2
        System.out.println("Task 2");
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        System.out.println("The box of " + orangeBox.toString() + " weights " + orangeBox.getWeight());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        System.out.println("The box of " + appleBox.toString() + " weights " + appleBox.getWeight());

        System.out.println("Does the box of " + appleBox.toString() +  " weights the same as the box of " + orangeBox.toString() + " ? " + appleBox.compare(orangeBox));

        appleBox.add(new Apple());
        System.out.println("Added one apple to the box of apples");
        System.out.println("The box of " + appleBox.toString() + " weights " + appleBox.getWeight());

        System.out.println("Does the box of " + appleBox.toString() +  " weights the same as the box of " + orangeBox.toString() + " ? " + appleBox.compare(orangeBox));

        Box<Apple> appleBoxNew = new Box<>();
        appleBox.move(appleBoxNew);
        System.out.println("Moved all apples to the new box");

        System.out.println("The old box of " + appleBox.toString() + " weights " + appleBox.getWeight());
        System.out.println("The new box of " + appleBoxNew.toString() + " weights " + appleBoxNew.getWeight());
    }

    private static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

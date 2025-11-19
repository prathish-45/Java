import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");
        fruits.add("Orange");

        // Printing elements using their position (index)
        System.out.println("Elements of the ArrayList:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Element at index " + i + ": " + fruits.get(i));
        }
    }
}

/* Elements of the ArrayList:
Element at index 0: Apple
Element at index 1: Banana
Element at index 2: Cherry
Element at index 3: Mango
Element at index 4: Orange
 */
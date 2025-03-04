public class StringVsStringBuilder {
    public static void main(String[] args) {
        // *** String Example (Immutable) ***
        String str = "Hello"; 
        System.out.println("Original String: " + str);

        // String modification (creates a new object)
        str = str + " World"; 
        System.out.println("Modified String: " + str);  // New object "Hello World" created

        // String replace() (creates a new object)
        String newStr = str.replace("World", "Java");
        System.out.println("Replaced String: " + newStr); // "Hello Java"

        // *** StringBuilder Example (Mutable) ***
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("\nOriginal StringBuilder: " + sb);

        // Modifying the same object
        sb.append(" World");
        System.out.println("After Append: " + sb);

        sb.insert(6, "Java ");
        System.out.println("After Insert: " + sb);

        sb.replace(6, 10, "C++");
        System.out.println("After Replace: " + sb);

        sb.delete(6, 9);
        System.out.println("After Delete: " + sb);

        sb.reverse();
        System.out.println("After Reverse: " + sb);
    }
}

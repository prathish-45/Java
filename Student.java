public class Student {
    private String name;
    private int age;
    private char grade;

    // Constructor accepting name and age
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 'N'; // Default grade
    }

    // Constructor accepting name, age, and grade
    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }

    public static void main(String[] args) {
        // Creating student objects with different constructors
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22, 'A');

        // Displaying student information
        System.out.println("Student 1 Details:");
        student1.displayInfo();
        
        System.out.println("Student 2 Details:");
        student2.displayInfo();
    }
}

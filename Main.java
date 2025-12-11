class Student {
    // Data members
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object
        Student s = new Student("Atharv", 21);

        // Using getters
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());

        // Using setters
        s.setName("Avi");
        s.setAge(22);

        System.out.println("Updated Name: " + s.getName());
        System.out.println("Updated Age: " + s.getAge());
    }
}

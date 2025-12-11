// Parent class
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// Child class inheriting Person
class Student extends Person {
    private String rollNo;

    // Constructor (calls parent constructor using super)
    public Student(String name, int age, String rollNo) {
        super(name, age);   // calling Person constructor
        this.rollNo = rollNo;
    }

    // Getter & Setter
    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create Student object
        Student s = new Student("Atharv", 21, "AIML123");

        // Access inherited and own data
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("Roll No: " + s.getRollNo());

        // Update values
        s.setName("Avi");
        s.setAge(22);
        s.setRollNo("AIML999");

        System.out.println("Updated Name: " + s.getName());
        System.out.println("Updated Age: " + s.getAge());
        System.out.println("Updated Roll No: " + s.getRollNo());
    }
}

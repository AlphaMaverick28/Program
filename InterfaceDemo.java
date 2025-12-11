// Interface
interface Animal {
    void sound();   // abstract method
    void eat();     // abstract method
}

// Class implementing interface
class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats food");
    }
}

// Another class implementing interface
class Cat implements Animal {

    @Override
    public void sound() {
        System.out.println("Cat meows");
    }

    @Override
    public void eat() {
        System.out.println("Cat drinks milk");
    }
}

// Main class (file name must match this class)
public class InterfaceDemo {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();
        a1.eat();

        a2.sound();
        a2.eat();
    }
}

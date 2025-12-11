// Interface
interface Animal {
    void sound();
    void eat();

    // New default method added
    default void info() {
        System.out.println("This is an animal from the Animal interface.");
    }
}

// Updated Dog class
class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog: Woof Woof!");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats bones.");
    }
}

// Updated Cat class
class Cat implements Animal {

    @Override
    public void sound() {
        System.out.println("Cat: Meow Meow!");
    }

    @Override
    public void eat() {
        System.out.println("Cat drinks milk.");
    }
}

// New class added
class Cow implements Animal {

    @Override
    public void sound() {
        System.out.println("Cow: Moo Moo!");
    }

    @Override
    public void eat() {
        System.out.println("Cow eats grass.");
    }
}

// Main class
public class InterfaceDemo {
    public static void main(String[] args) {

        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Cow();  // new object

        a1.info();
        a1.sound();
        a1.eat();

        System.out.println();

        a2.info();
        a2.sound();
        a2.eat();

        System.out.println();

        a3.info();
        a3.sound();
        a3.eat();
    }
}

package src.main.java.com.technews.testModel;

import java.util.Objects;

// Demo class
public class Demo {
    private String name;
    private int age;
    // right-click anywhere between the opening and closing curly
    // brackets of the Demo class and press Generate to generate constructor via IntelliJ
    // notice that the generated constructor has the same name as Demo class
    // it was derived from and that the method has NO return type. That is,
    // there is no type before Demo and after public in the constructor definition
    public Demo(String name, int age) {

        this.name = name;
        this.age = age;
    }
    // same goes for creating getters and setters via IntelliJ
    // the name of each method is preceded by public or private
    // and then by a return type
    public String getName() {
        return name;
    }
    // If the method doesn't need to return a value, then we can use
    // void keyword in place of a return type
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // using the equals() method to compare two objects. This method
    // compares objects by hash code(or reference number) rather than value
    // Thus, two distinct objects with the same value would be interpreted as
    // NOT equal.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demo demo = (Demo) o;
        return age == demo.age && Objects.equals(name, demo.name);
    }

    // Override that functionality so that equals() compares objects
    // based on values but also override hashCode() when we do that
    // because it is closely linked
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    // notice the @Override annotation at the top of each of the methods
    // When you see the @Override annotation on a method it means that the
    // method is coming to the class from a superclass. The @Override
    // annotation isn't required, but it is best practice to include it.
    @Override
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

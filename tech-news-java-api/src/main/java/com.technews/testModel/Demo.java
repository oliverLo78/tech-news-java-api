package src.main.java.com.technews.testModel;
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
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

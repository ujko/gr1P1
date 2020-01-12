package day1.staticDynamic;

public class Person {
    private String name;
    private int age;
    public static String programName;

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

    public static void wypiszCos() {
        System.out.println("cos");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", programName=" + programName +
                '}';
    }
}

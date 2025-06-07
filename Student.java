import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private String course;
    private transient String password; // This won't be serialized

    public Student(String name, int age, String course, String password) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.password = password;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Password: " + password); // Will be null after deserialization
    }
}

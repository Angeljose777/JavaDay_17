import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeStudent {
    public static void main(String[] args) {
        Student student = new Student("Alice", 22, "Computer Science", "secret123");

        try (FileOutputStream fos = new FileOutputStream("student.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(student);
            System.out.println("Student object has been serialized to student.ser");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

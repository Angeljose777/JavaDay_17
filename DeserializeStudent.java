import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeStudent {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("student.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Student student = (Student) ois.readObject();
            System.out.println("Student object has been deserialized:\n");
            student.displayInfo();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

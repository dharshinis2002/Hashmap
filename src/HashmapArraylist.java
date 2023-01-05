import java.util.ArrayList;
import java.util.HashSet;

public class HashmapArraylist {
    public static void main(String[] args) {
        HashSet<String> Student =new HashSet<>();
        Student.add("dharsh");
        Student.add("madhu");
        Student .add("mabi");
        Student.add("dharsh");
        Student.add("hi");

        System.out.println(Student.size());


        ArrayList<String> Student1 =new ArrayList<>();
        Student1.add("dharsh");
        Student1.add("madhu");
        Student1 .add("mabi");
        Student1.add("dharsh");
        Student1.add("hi");

        System.out.println(Student1.size());

    }
}

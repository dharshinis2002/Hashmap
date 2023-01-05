package HashsetEx;

import java.util.ArrayList;
import java.util.HashSet;

public  class StudentMain {
    public static void main(String[] args) {

        Student s1 = new Student("dharshini", 14);
        Student s2 = new Student("madhu", 14);
        Student s3 = new Student("mabi", 02);

        HashSet<Student> studentlist = new HashSet<>();
        studentlist.add(s1);
        studentlist.add(s2);
        studentlist.add(s3);
        studentlist.add(s3);
        studentlist.add(s1);
        System.out.println(studentlist.size());

        ArrayList<Student>studentList1 = new ArrayList<>();

        studentList1.add(s1);
        studentList1.add(s1);
        studentList1.add(s2);
        studentList1.add(s3);
        studentList1.add(s3);
        System.out.println(studentList1.size());

    }
}

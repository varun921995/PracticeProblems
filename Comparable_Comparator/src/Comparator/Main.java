package Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Comparator Example");


        Student s1 = new Student(2, "Milap");
        Student s2 = new Student(3, "Varun");
        Student s3 = new Student(3, "Prit");
        Student s4 = new Student(1, "Prakruti");
        Student s5 = new Student(4, "Dhara");

        List<Student> studentList = Arrays.asList(s1,s2,s3,s4,s5);

        Collections.sort(studentList, Comparator.comparing(Student::getId).thenComparing(Student::getName));
        System.out.println(studentList.toString());
    }
}

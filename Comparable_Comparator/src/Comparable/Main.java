package Comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Comparable Example");

        Student s1 = new Student(2, "Varun");
        Student s2 = new Student(3, "Milap");
        Student s3 = new Student(5, "Prit");
        Student s4 = new Student(1, "Prakruti");
        Student s5 = new Student(4, "Dhara");

       List<Student> studentList =Arrays.asList(s1,s2,s3,s4,s5);
       Collections.sort(studentList);
       System.out.println(studentList.toString());
    }
}

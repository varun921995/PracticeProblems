//https://www.hackerrank.com/challenges/grading/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=7-day-campaign

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> grades = new ArrayList<>(){
            {
                add(73);
                add(67);
                add(38);
                add(33);
            }
             };
        gradingStudents(grades);
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        for (int i = 0; i < grades.size(); i++) {
            if(grades.get(i) < 38){
                continue;
            }else if(grades.get(i) % 5 >= 3){
                grades.set(i, grades.get(i) + 5-(grades.get(i) % 5));
            }
        }
        return grades;

    }
}
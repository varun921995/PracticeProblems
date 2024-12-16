package Comparable;

public class Student implements Comparable<Student>{

    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

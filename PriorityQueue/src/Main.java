import java.util.PriorityQueue;

class user  implements Comparable<user>{
    String name;
    String email;

    public user(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public int compareTo(user o) {

        if(this.name.compareTo(o.name)==0){
            return this.email.compareTo(o.email);
        }
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
        PriorityQueue<user> pq = new PriorityQueue<>();

        pq.add(new user("John", "john@gmail.com"));
        pq.add(new user("Jane", "jane@gmail.com"));
        pq.add(new user("John", "jack@gmail.com"));

        while (!pq.isEmpty()) {
            System.out.println(pq.poll().toString());
        }
    }
}
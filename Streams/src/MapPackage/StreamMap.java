package MapPackage;

import java.util.Arrays;
import java.util.List;

public class StreamMap
{

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana");

        List<Character> firstCharacter = names.stream().map(name -> name.charAt(0)).toList();
        System.out.println(firstCharacter);
        List<String> usernames = Arrays.asList("john123", "alice456", "mike789");
        List<User> users = usernames.stream().map(User::new).toList();
        System.out.println(users);
    }
}

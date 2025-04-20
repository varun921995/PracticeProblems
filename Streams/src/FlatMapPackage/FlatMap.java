package FlatMapPackage;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<List<String>> nested = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d", "e")
        );

        List<String> sList = nested.stream().flatMap(Collection::stream).toList();
        System.out.println(sList);
        List<String> words = Arrays.asList("java", "code");
        List<String> wList = words.stream().flatMap(word -> Arrays.stream(word.split(""))).toList();
        System.out.println(wList);
        int[][] matrix = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
        List<Integer> Ilist = Arrays.stream(matrix).flatMapToInt(Arrays::stream).boxed().toList();
        System.out.println(Ilist);
    }


}

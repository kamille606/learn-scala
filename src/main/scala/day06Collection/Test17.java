package day06Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test17 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("2");
        System.out.println(list);

        Map<String, List<String>> collect = list.stream().collect(Collectors.groupingBy(Function.identity()));
        System.out.println(collect);
    }
}

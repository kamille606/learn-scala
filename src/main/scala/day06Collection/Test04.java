package day06Collection;

import java.util.ArrayList;
import java.util.List;

public class Test04 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();


        list.add("1");
        list.add("2");
        list.add("3");
        String s = list.get(2);
        System.out.println(s);

    }
}

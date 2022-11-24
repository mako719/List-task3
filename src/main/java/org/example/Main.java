package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> groupE = new ArrayList<>();
        groupE.add("Germany");
        groupE.add("Japan");
        groupE.add("Spain");
        groupE.add("Costa Rica");

        System.out.println("W杯グループEチーム数");
        System.out.println(groupE.size());
        System.out.println(groupE.get(0));
        System.out.println(groupE.get(1));
        System.out.println(groupE.get(2));
        System.out.println(groupE.get(3));

        int index = 5;
        try {
            if (index < 0 || 4 < index) {
                throw new ArrayIndexOutOfBoundsException();
            }
            System.out.println(groupE.get(index));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(("グループEではありません。"));
        }
    }
}
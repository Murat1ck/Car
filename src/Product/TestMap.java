package Product;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TestMap {
    private static final Map<String, Integer> map = new HashMap<>();

    public static void addNumber(String s, Integer i) {
        if (map.containsKey(s) && map.containsValue(i)) {
            throw new RuntimeException(map + "значения совпадают");
        }
        map.put(s, i);
    }

    public static Integer sumElements(List<Integer> list) {
        Integer sum = 0;
        for (Integer element : list) {
            sum += element;
        }
        return sum;

    }


    public static void test1() {
        addNumber("String",1);
        addNumber("String",2);
        addNumber("String3",3);
        addNumber("String3",4);
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " : " + stringIntegerEntry.getValue());
        }
    }
    public static void test2() {
        Map<String, List<Integer>> listMap = new HashMap<>();
        listMap.put("string1", List.of(14, 17, 19));
        listMap.put("string2", List.of(105, 107, 190));
        listMap.put("string3", List.of(140, 170, 109));
        listMap.put("string4", List.of(141, 171, 191));
        listMap.put("string5", List.of(1114, 1117, 1119));
        Map<String, Integer> listMap1 = new HashMap<>();
        for (Map.Entry<String, List<Integer>> stringListEntry : listMap.entrySet()) {
            listMap1.put(stringListEntry.getKey(), sumElements(stringListEntry.getValue()));
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : listMap1.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " : " + stringIntegerEntry.getValue());
        }
    }

    public static void test3() {
        Map<Integer, String> someNumber = new LinkedHashMap<>();
        someNumber.put(1, "qwe");
        someNumber.put(2, "rty");
        someNumber.put(3, "asd");
        someNumber.put(4, "fgh");
        someNumber.put(5, "zxc");
        for (Map.Entry<Integer, String> integerStringEntry : someNumber.entrySet()) {
            System.out.println(integerStringEntry.getKey() + " : " + integerStringEntry.getValue() );
        }

    }

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }
}

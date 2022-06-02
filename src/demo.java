import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class demo {

    public static void main(String[] args) {

        example1();
        example2();
        example3();
    }

    private static void example1() {

        Map<String, Integer> ages = new HashMap<>();
        ages.put("Baris", 26);
        ages.put("Osman", 7);

        ages.forEach((name, age) -> System.out.println(name + " is " + age + " years old"));
    }

    private static void example2() {

        List<String> names = Arrays.asList("Baris", "Osman");

        List<String> namesWithB = names.stream()
                .filter(name -> name.startsWith("B"))
                .collect(Collectors.toList());

        System.out.println("names: " + names);
        System.out.println("names start with B: " + namesWithB);
    }

    private static void example3() {

        int a = 5;

        Square s = (int x) -> x * x;

        int ans = s.calculate(5);
        System.out.println(ans);
    }
}

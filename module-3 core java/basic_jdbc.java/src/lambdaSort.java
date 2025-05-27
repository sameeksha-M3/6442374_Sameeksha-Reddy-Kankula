import java.util.*;

public class lambdaSort {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Charlie");
        names.add("Alice");
        names.add("Bob");
        names.add("David");

        // Sorting using lambda expression
        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println("Sorted list:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

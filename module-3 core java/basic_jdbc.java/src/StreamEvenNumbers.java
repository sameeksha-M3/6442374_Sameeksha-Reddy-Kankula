import java.util.*;
import java.util.stream.Collectors;

public class StreamEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);

        // Filter even numbers using Stream
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());

        System.out.println("Even numbers:");
        evenNumbers.forEach(System.out::println);
    }
}

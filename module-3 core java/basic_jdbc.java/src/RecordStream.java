import java.util.*;
import java.util.stream.Collectors;

public class RecordStream {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Alice", 22),
            new Person("Bob", 30),
            new Person("Charlie", 17),
            new Person("Diana", 25)
        );

        // Filter persons older than 20
        List<Person> adults = people.stream()
                                    .filter(p -> p.age() > 20)
                                    .collect(Collectors.toList());

        System.out.println("People older than 20:");
        adults.forEach(System.out::println);
    }
}

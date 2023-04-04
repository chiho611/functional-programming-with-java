package programming;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PlayingWithOptional {
    public static void main(String arg[]) {
        List<String> fruits = List.of("apple", "banana", "mango");
        Predicate<String> predicate = fruit -> fruit.startsWith("b");
        Optional<String> optional = fruits.stream().filter(predicate).findFirst();
        System.out.println(optional);
        System.out.println(optional.isEmpty());
        System.out.println(optional.isPresent());
        System.out.println(optional.get());


        System.out.println(Optional.of("test"));
        System.out.println(Optional.empty());



    }

}

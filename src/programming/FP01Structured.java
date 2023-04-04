package programming;

import java.util.List;

public class FP01Structured {
    public static void main(String arg[]) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
//        printAllNumbersInList(numbers);
        printEvenNumbersInList(numbers);
    }

    private static void printAllNumbersInList(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    private static void printEvenNumbersInList(List<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 == 0 ) {
                System.out.println(number);
            }
        }
    }
}

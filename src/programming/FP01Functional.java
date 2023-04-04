package programming;

import java.util.List;

public class FP01Functional {
    public static void main(String arg[]) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
//        PrintAllNumbersInListFunctional(numbers);
//        PrintEvenNumbersInListFunctional(numbers);

        PrintSquareOfEvenNumbersInListFunctional(numbers);
    }

    public static void print(int number) {
        System.out.println(number);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static void PrintAllNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream().forEach(FP01Functional::print);
    }

    private static void PrintEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 == 0)
//                .filter(FP01Functional::isEven)
                .forEach(System.out::println);

    }

    private static void PrintSquareOfEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .forEach(System.out::println);

    }
}

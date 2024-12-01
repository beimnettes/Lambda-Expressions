import java.util.function.Function;

public class ComposeExample {
    public static void main(String[] args) {
        Function<Integer, Integer> addOne = x -> x + 1;
        Function<Integer, Integer> multiplyByTen = x -> x * 10;

        // Composing functions
        Function<Integer, Integer> addThenMultiply = addOne.andThen(multiplyByTen);

        System.out.println(addThenMultiply.apply(5)); // 60
    }
}

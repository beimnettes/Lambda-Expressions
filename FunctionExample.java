import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, String> toUpperCase = s -> s.toUpperCase();

        System.out.println(toUpperCase.apply("hello")); // HELLO
    }
}

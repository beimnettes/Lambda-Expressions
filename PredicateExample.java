import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> isEmpty = s -> s.isEmpty();

        System.out.println(isEmpty.test("")); // true
        System.out.println(isEmpty.test("Hello")); // false
    }
}

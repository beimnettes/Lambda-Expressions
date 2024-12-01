public class LambdaExample {
    public static void main(String[] args) {
        // Traditional way using an anonymous class
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class");
            }
        };

        // Using a lambda expression
        Runnable runnable2 = () -> System.out.println("Hello from lambda expression");

        // Execute both runnables
        runnable1.run();
        runnable2.run();
    }
}

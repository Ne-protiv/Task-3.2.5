public class Task {
    public static void main(String[] args) {
        try (Car audi = new Car()) {
            audi.drive();
        }
        catch (RuntimeException ignored) {}
    }

    static class Car implements AutoCloseable {
        public void drive() {
            System.out.println("Машина поехала.");
        }

        public void close() {
            System.out.println("Машина закрывается...");
        }
    }
}

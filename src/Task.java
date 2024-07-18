public class Task {
    public static void main(String[] args) {
        Car audi = new Car();
        try {
            audi.drive();
        } catch (RuntimeException ignored) {
        }
    }

    static class Car {
        public void drive() {
            System.out.println("Машина поехала.");
        }

        public void close() {
            System.out.println("Машина закрывается...");
        }
    }
}

package exercise_3;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println("Bán kính của circle: " + circle.getRadius());
        System.out.printf("Diện tích của circle: %.2f", circle.getAre());

    }
}

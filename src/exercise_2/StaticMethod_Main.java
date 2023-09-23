package exercise_2;

public class StaticMethod_Main {
    public static void main(String[] args) {
        StaticMethod staticMethod = new StaticMethod();
        double circleArea = staticMethod.calCircleArea(5.0);
        double rectangleArea = staticMethod.calRectangleArea(2.5, 6);
        double calTriangleArea = staticMethod.calTriangleArea(4.5, 7, 6);

        System.out.println("Diện tích hình tròn: " + circleArea);
        System.out.println("Diện tích hình chữ nhật: " + rectangleArea);
        System.out.printf("Diện tích tam giác: %.2f", calTriangleArea);
    }
}

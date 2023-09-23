package exercise_2;

public class StaticMethod {
    private final double PI = 3.14;

    public double calCircleArea(double R) { //diện tích hình tròn.
        return PI * R * R;
    }

    public double calRectangleArea(double width, double height) { //diện tích hình chữ nhật.
        return width * height;
    }

    public double calTriangleArea(double a, double b, double c) { //tính diện tích của tam giác
        double s = (a + b + c) / 2; // Nửa chu vi tam giác
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

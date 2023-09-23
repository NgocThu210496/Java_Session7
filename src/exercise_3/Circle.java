package exercise_3;

public class Circle {
    private double radius=1.0;
    private String color ="red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //lay dien tich hinh trong
    public double getAre(){
        return Math.PI * radius * radius;
    }
}

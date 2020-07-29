package abstracts.shapes;

public class Circle extends Shape{

    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    String draw() {
        return "A " + color + " circle with a " +
                radius  + " inch radius is drawn";
    }
}

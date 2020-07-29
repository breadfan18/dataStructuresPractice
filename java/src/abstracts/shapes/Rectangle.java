package abstracts.shapes;

public class Rectangle  extends Shape {

    double length;
    double  width;

    public Rectangle(String color, double length, double  width) {
        super(color);
        this.length = length;
        this.width = width;
    }


    @Override
    double getArea() {
        return length * width;
    }

    @Override
    String draw() {
        return "A " + color + " rectangle " +
                length + " inches long and " +
                width + " inches wide has been drawn";
    }
}

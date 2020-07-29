package abstracts.shapes;

public class RunIt {

    public static void main(String[] args) {

        Rectangle r = new Rectangle("Purple", 5, 2);
        Circle c = new Circle("blue", 4);

        System.out.println("Rectangle Area: " + r.getArea());
        System.out.println("Circle Area: " + c.getArea());

        System.out.println(r.draw());
        System.out.println(c.draw());

        //Abstraction  : Way to hide complexity of code, so  code is more concise. This is achieved by  creating
                        //class relationships between different classes either by  inheriting or extending etc,
                        //so code is   more  readable, and  scalable

        //Encapsulation : data  hiding ..manage how methods are visible or not visible by  using the access modifiers.
                        //using getters and setters  to  access variables rather than making the variables public. Other
                        //classes can still access the data, but only can do so indirectly using public methods of the class.
    }
}

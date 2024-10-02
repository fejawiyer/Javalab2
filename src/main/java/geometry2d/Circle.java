package geometry2d;
import exceptions.BadNumberExceptionFigure;

public class Circle implements Figure {
    double radius;
    public Circle(int radius) throws BadNumberExceptionFigure {
        if(radius<=0) {
            throw new BadNumberExceptionFigure("Bad argument");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*3.14*radius;
    }
}

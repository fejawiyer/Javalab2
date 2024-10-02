package geometry2d;

import exceptions.BadNumberExceptionFigure;

public class Rectangle implements Figure{
    double a;
    double b;

    public Rectangle(double a, double b) throws BadNumberExceptionFigure {
        if(a <= 0 || b <= 0) {
            throw new BadNumberExceptionFigure("Bad argument");
        }
        this.a = a;
        this.b = b;
    }
    @Override
    public double area() {
        return a*b;
    }

    @Override
    public double perimeter() {
        return 2*a+2*b;
    }
}

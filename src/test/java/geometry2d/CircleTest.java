package geometry2d;

import exceptions.BadNumberExceptionFigure;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Figure circle;

    @Test
    void area() throws BadNumberExceptionFigure {
        circle = new Circle(5);
        assertEquals(3.14*5*5, circle.area());
    }

    @Test
    void perimeter() throws BadNumberExceptionFigure {
        circle = new Circle(5);
        assertEquals(2*3.14*5, circle.perimeter());
    }
}
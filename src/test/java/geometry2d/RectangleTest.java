package geometry2d;

import exceptions.BadNumberExceptionFigure;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Figure rectangle;
    @Test
    void area() throws BadNumberExceptionFigure {
        rectangle = new Rectangle(3,2);
        assertEquals(6, rectangle.area());
    }

    @Test
    void perimeter() throws BadNumberExceptionFigure {
        rectangle = new Rectangle(3,2);
        assertEquals(10, rectangle.perimeter());
    }
}
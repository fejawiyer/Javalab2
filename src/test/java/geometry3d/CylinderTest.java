package geometry3d;

import exceptions.BadNumberExceptionCylinder;
import exceptions.BadNumberExceptionFigure;
import geometry2d.Circle;
import geometry2d.Figure;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {
    Cylinder cylinder;
    @Test
    void volume() throws BadNumberExceptionFigure, BadNumberExceptionCylinder {
        Figure circleBase = new Circle(5);
        cylinder = new Cylinder(circleBase, 6);
        assertEquals(3.14*5*5*6, cylinder.volume());
    }
}
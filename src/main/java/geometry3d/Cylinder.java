package geometry3d;
import exceptions.BadNumberExceptionCylinder;
import geometry2d.Figure;

public class Cylinder {
    Figure base;
    double height;
    public Cylinder(Figure base, double height) throws BadNumberExceptionCylinder {
        if (height <= 0) throw new BadNumberExceptionCylinder("Bad argument");
        this.base = base;
        this.height = height;
    }
    public double volume() {
        return base.area()*height;
    }
}

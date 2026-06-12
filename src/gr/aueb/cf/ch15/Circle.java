package gr.aueb.cf.ch15;

public class Circle extends AbstractShape implements ITwoDimensional{

    private double radius;

    public Circle() {
        super();
    }

    public Circle(double radius, long id) {
        super();
        this.radius = radius;
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public void setId(long id) {
        super.setId(id);
    }

    @Override
    public double getArea() {
        double PI = 3.14;
        return PI * radius *radius;
    }
}

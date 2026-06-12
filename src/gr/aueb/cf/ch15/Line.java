package gr.aueb.cf.ch15;

public class Line extends AbstractShape{
    private double length;

    public Line(long id) {
        super();
    }

    public Line(long id, double length) {
        super();
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}

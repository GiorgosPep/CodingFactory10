package gr.aueb.cf.ch15;

public abstract class AbstractShape implements IShape{
    private long id;

    public AbstractShape() {
    }

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}


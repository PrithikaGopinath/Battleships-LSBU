package battleships;

import java.awt.geom.Rectangle2D;

public abstract class Ship {

    public String name;
    private String code;

    protected int squareCount;

    protected int x;
    protected int y;
    

    private int hits;

    public Ship(String name, String code, int squarecount) {
        this.name = name;
        this.code = code;
        this.squareCount = squarecount;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void rotate();

    public abstract void addToBoard(final Board board);

    public abstract int getWidth();

    public abstract int getHeight();

    public boolean overlap(final Ship other) {
        final Rectangle2D rectThis = new Rectangle2D.Double(this.x, this.y, this.getWidth(), this.getHeight());
        final Rectangle2D rectOther = new Rectangle2D.Double(other.x, other.y, other.getWidth(), other.getHeight());
        final Rectangle2D intersection = rectThis.createIntersection(rectOther);
        return (intersection.getWidth() >= 0) && (intersection.getHeight() >= 0);
    }

    public boolean incrementHitCount() {
        if (this.hits < this.squareCount) {
            this.hits++;
        }
        return (this.hits == this.squareCount);
    }

    public boolean isSunk() {
        return (this.hits == this.squareCount);
    }

    
}

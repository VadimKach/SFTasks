package m8t6;

public class Vector2D extends Vector {
    private double lenght;

    public Vector2D(int x1, int y1, int x2, int y2) {
        super(x1, y1, 0, x2, y2, 0);
    }

    @Override
    public double getLenght() {
        return Math.abs(Math.sqrt(Math.pow(x[0] - x[1], 2) + Math.pow(y[0] - y[1], 2)));
    }

    @Override
    public String getVectorCords() {
        return null;
    }
}

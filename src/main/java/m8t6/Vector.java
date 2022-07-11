package m8t6;

public abstract class Vector {
    int[] x, y, z;


    public Vector(int x1, int y1, int z1, int x2, int y2, int z2) {
        x = new int[2];
        x[0] = x1;
        x[1] = x2;
        y = new int[2];
        y[0] = y1;
        y[1] = y2;
        z = new int[2];
        z[0] = z1;
        z[1] = z2;
    }


    public abstract double getLenght();
    public abstract String getVectorCords();
}

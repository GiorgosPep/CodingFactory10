package gr.aueb.cf.ch12;

/**
 * Η κλάση αρχικοποιεί 3 σημεία (Χ,Υ,Ζ) και υλοποιεί τέσσερις μεθόδους
 * για να βρει την απόστασή τους ανά δύο και την απόσταση μεταξύ των τριών.
 */
public class PointXYZ {
    private double x;
    private double y;
    private double z;

    public PointXYZ() {
    }


    public PointXYZ(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    /**
     * Calculates the distance between two points
     * @param x point 1
     * @param y point 2
     * @return
     */
    public double getXYDistance(double x, double y){
        return Math.sqrt(x*x + y*y);
    }
    public double getYZDistance(double y, double z) {
        return Math.sqrt(z * z + y * y);
    }
    public double getXZDistance(double x, double z) {
        return Math.sqrt(z * z + x * x);
    }
    public double getXYZDistance(double x, double y, double z) {
        return Math.sqrt(x*x + y*y + z*z);
    }

}

package gr.aueb.cf.ch12;

/**
 * Η κλάση δημιουργεί ένα object τύπου PointXYZ με overloaded constructos
 * και καλεί 4 μεθόδους μέσω Public API για να βρει τις αποστάσεις των σημείων ανά δύο
 * και την απόσταση και των τριών.
 * Ενδεικτικά τυπώνει μία από τις αποστάσεις.
 */
public class Main {
    public static void main(String[] args) {
        PointXYZ point = new PointXYZ(12.5, -3.01, 1.07);

        point.getXYZDistance(12.5, -3.01, 1.07);
        point.getXYDistance(12.5, -3.01);
        point.getYZDistance(-3.01, 1.07);
        point.getXZDistance(12.5, 1.07);

        System.out.println("Η απόσταση xyz είναι: " +
                point.getXYZDistance(12.5, -3.01, 1.07));

    }
}

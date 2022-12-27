public class Dih {

    public double f(double x){
        return Math.pow(x, 2);
    }

    public void search(double a, double b, double bias, double eps) {

        while (true) {
            double length = b - a;
            double mid = a + length / 2.0;

            double left = mid - bias;
            double right = mid + bias;

            double f_left = f(left);
            double f_right = f(right);
            double f_mid = f(mid);

            System.out.printf("%10f%10f%10f%10f%10f%10f%10f%10f\n", length, a, b, left, right, f_left, f_mid, f_right);

            if (length < 2*eps) {
                System.out.printf("%10f %10f\n", mid, f(mid));
                System.exit(-101);
            }

            if (f_left < f_right) {
                b = right;
            }
            else a = left;
        }

    }
}

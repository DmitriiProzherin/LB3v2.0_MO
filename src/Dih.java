import java.util.ArrayList;
import java.util.Arrays;

public class Dih {

    ArrayList<double[]> list = new ArrayList<>();

    public double f(double x){
        return Math.pow(x, 32);
    }

    public void search(double a, double b, double eps,  double delta) {

        double length = b - a;
        double mid = a + length / 2.0;

        if (delta >= eps) {
            System.out.println("Error");
            System.exit(13);
        }

        if (length <= 2 * eps) {

            list.forEach(ar -> {

                System.out.printf("%3d%10f%10f%10f%10f%10f%10f%10f%10f\n",
                        list.indexOf(ar), ar[0], ar[1], ar[2], ar[3], ar[4], ar[5], ar[6], ar[7]);

            });

            System.out.printf("%10f%10f%10f", a, b, mid);
            System.exit(0);
        }

        double left = mid - delta / 2;
        double right = mid + delta / 2;

        double f_left = f(left);
        double f_right = f(right);

        list.add(new double[] {length, a, b, left, mid, right, f_left, f_right});

        if (f_left < f_right) search(a, right, eps, delta);
        else search(left, b, eps, delta);


    }
}

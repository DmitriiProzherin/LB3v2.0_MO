public class Main {
    public static void main(String[] args) {

        Dih dih = new Dih();
        System.out.printf("%3s%10s%10s%10s%10s%10s%10s%10s%10s\n",
                "k","delta_k","a","b", "m-d","m","m+d",
                "f(m-d)","f(m+d)");

        dih.search(0, 1, 0.2, 0.1);
    }
}
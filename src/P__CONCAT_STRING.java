import java.util.Scanner;

public class P__CONCAT_STRING {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, m, k, t;
        String a, b;

        n = scanner.nextInt();
        a = scanner.next();
        m = scanner.nextInt();
        b = scanner.next();
        k = scanner.nextInt();
        t = scanner.nextInt();

        for (int i = 0; i < k; i++) {
            System.out.printf(a);
        }
        for (int i = 0; i < t; i++) {
            System.out.printf(b);
        }
    }
}

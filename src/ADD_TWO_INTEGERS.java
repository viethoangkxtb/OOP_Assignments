import java.math.BigInteger;
import java.util.Scanner;

public class ADD_TWO_INTEGERS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger a, b;

        a = scanner.nextBigInteger();
        b = scanner.nextBigInteger();

        BigInteger s = new BigInteger("0");
        s = s.add(a);
        s = s.add(b);
        System.out.print(s);
    }
}

import java.util.Scanner;

public class FIND_PERIMETER_AREA_RECTANGLE {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.print(2 * (a +b) + " ");
        System.out.print(a * b);
    }
}

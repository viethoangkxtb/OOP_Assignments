import java.util.Scanner;

public class P__STRING_MATCHING {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();      // Độ dài chuỗi a
        String a = scanner.next();      // Chuỗi a
        int m = scanner.nextInt();      // Độ dài chuỗi b
        String b = scanner.next();      // Chuỗi b
        boolean result = true;

        for (int i = 0; i <= n - m; i++) {  // Chạy tới n - m thay vì n
            boolean check = true;
            for (int j = 0; j < m; j++) {
                if (a.charAt(i + j) != b.charAt(j)) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(i + " ");
                result = false;
            }
        }
        if (result) {
            System.out.print(" ");
        }
    }
}

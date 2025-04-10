import java.util.Scanner;

public class P__COUNT_REPLACE_CHAR_IN_STRING {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();           // Đọc độ dài chuỗi
        String s = scanner.next();           // Đọc chuỗi s
        char a = scanner.next().charAt(0);   // Đọc ký tự a
        char b = scanner.next().charAt(0);   // Đọc ký tự b

        int count = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char current = s.charAt(i);
            if (current == a) {
                count++;
                result.append(b);
            } else {
                result.append(current);
            }
        }

        System.out.println(count + " " + result);
    }
}
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SUM_ARRAY {
    public static void main(String[] args) {
        int n;
        int temp;
        int s = 0;

        Scanner myObj = new Scanner(System.in);

        n = myObj.nextInt();

        for (int i = 0; i < n; i++) {
            temp = myObj.nextInt();
            s = s + temp;
        }

        System.out.println(s);
    }
}
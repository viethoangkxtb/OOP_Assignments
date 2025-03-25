import java.util.Scanner;

public class PERMUTATION_GEN {
    public static int n;
    public static int[] visited = new int[100];
    public static int[] x = new int[100];

    static boolean check(int k) {
        return visited[k] == 0;
    }

    static  void solution() {
        for (int i = 1; i < n + 1; i++){
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }

    static void Try(int k) {
        for (int i = 1; i < n + 1; i++) {
            if (check(i)) {
                x[k] = i;
                visited[i] = 1;
                if (k == n) {
                    solution();
                } else {
                    Try(k + 1);
                }
                visited[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        Try(1);
    }
}

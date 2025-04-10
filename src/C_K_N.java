import java.util.Scanner;

public class C_K_N {
    public static long[][] memory = new long[1000][1000];
    static final int MOD = 1_000_000_007;
    static long computeCombination(int k, int n) {
        if (k > n) return 0;

        if (memory[k][n] != 0) return memory[k][n];

        memory[k][n] = (computeCombination(k, n - 1) + computeCombination(k - 1, n - 1)) % MOD;
        return memory[k][n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int n = scanner.nextInt();

        // Khởi tạo các giá trị cơ bản của tổ hợp
        for (int i = 0; i < 1000; i++) {
            memory[i][i] = 1;
            memory[0][i] = 1;
        }

        long result = computeCombination(k, n);
        System.out.println(result);
    }
}

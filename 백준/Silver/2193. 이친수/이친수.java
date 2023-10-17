import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 방법 1 - Bottom-Up 방식
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long d[] = new long[N + 1];
        d[0] = 0;
        d[1] = 1;
        for (int i = 2; i <= N; i++) {
            d[i] = d[i - 1] + d[i - 2];
        }
        System.out.println(d[N]);
    }
}

// 방법 2 - Top-Down 방식
public class Main {
    static long d[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        d = new long[N + 1];
        System.out.println(recur(N));
    }

    static long recur(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        if (d[N] > 0) {
            return d[N];
        }
        d[N] = recur(N - 1) + recur(N - 2);
        return d[N];
    }
}

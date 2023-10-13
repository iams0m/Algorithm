import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
        br.close();
        
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            if (i == N) {
                sb.append("*".repeat(2 * i - 1));
                break;
            }
            
            sb.append(" ".repeat(N - i));

            if (i == 1) {
                sb.append("*");
            } else {
                sb.append("*");
                sb.append(" ".repeat(2 * (i - 1) - 1));
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
	}
}
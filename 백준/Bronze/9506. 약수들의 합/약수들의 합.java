import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
	    
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        // 입력된 n이 -1이 아닌 동안 반복
        while (n != -1) {
            // StringBuilder 초기화 및 첫 항 추가
            sb.setLength(0);
            sb.append(n + " = 1");
            sum = 1;

            // 2부터 n-1까지의 정수 i를 반복하면서 n을 i로 나눈 나머지가 0인 경우(즉, i가 n의 약수인 경우)
            // 약수를 StringBuilder에 추가하고 합을 구함
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    sb.append(" + " + i);
                    sum += i;
                }
            }

            // 합이 n과 같으면 완전수(Perfect Number)이므로 해당 값을 출력
            // 완전수는 자신을 제외한 약수들의 합이 자기 자신과 같은 수를 의미함
            if (sum == n) {
                System.out.println(sb);
            } else {
                // 합이 n과 다르면 완전수가 아니므로 해당 값을 출력
                System.out.println(n + " is NOT perfect.");
            }

            n = Integer.parseInt(br.readLine());
        }
    }
}

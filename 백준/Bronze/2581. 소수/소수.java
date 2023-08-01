import java.io.*;

public class Main {
    public static boolean[] prime; // 소수 여부를 저장하는 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        // N보다 작거나 같은 수들에 대한 소수 여부를 저장하는 배열 생성
        prime = new boolean[N + 1];
        
        // 에라토스테네스의 체 알고리즘을 이용하여 소수를 찾고 배열에 표시
        get_prime();

        // 소수들의 합과 최솟값을 구하기 위한 변수 초기화
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = M; i <= N; i++) {
	    // i가 소수라면 sum에 i를 더하고, min과 비교하여 갱신
            if (prime[i] == false) { // false = 소수 
                sum += i;
                if (min == Integer.MAX_VALUE) { // 첫 소수가 최솟값임  
                    min = i;
                }
            }
        }

        if (sum == 0) { // 소수가 없는 경우
            System.out.println(-1);
        } else { // 소수가 있는 경우
            System.out.println(sum);
            System.out.println(min);
        }

    }

    // 에라토스테네스 체 알고리즘을 구현한 메드
    public static void get_prime() {
        // 0과 1은 소수가 아니므로 true로 표시
        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            // 이미 소수로 판별된 수라면 넘어감
            if (prime[i]) {
                continue;
            }
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}

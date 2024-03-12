import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());
        int top = -1;
        int[] arr = new int[K];

        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                top--;
            } else {
                top++;
                arr[top] = num;
            }
        }

        int sum = 0;

        for (int i = 0; i<= top; i++) {
            sum += arr[i];
        }

        System.out.print(sum);
    }
}
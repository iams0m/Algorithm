import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            if (65 <= s.charAt(i) && s.charAt(i) <= 90) {
                arr[s.charAt(i) - 65]++;
            } else {
                arr[s.charAt(i) - 97]++;
            }
        }

        int max = -1;
        int answer = -2;

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                answer = i;
            } else if (arr[i] == max) {
                answer = -2;
            }
        }

        System.out.print((char) (answer + 65));

    }
}

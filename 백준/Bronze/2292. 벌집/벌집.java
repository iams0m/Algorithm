import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int range = 2;

        if (N == 1) {
            System.out.print(1);
        } else {
            while (N >= range) {
                range = range + (count * 6);
                count++;
            }
            System.out.print(count);
        }
    }
}

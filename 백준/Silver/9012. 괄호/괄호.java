import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        String arr[] = new String[T];

        for (int i = 0; i < T; i++) {
            arr[i] = solve(br.readLine());
            System.out.println(arr[i]);
        }
    }

    public static String solve(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return "NO";
                } else {
                    stack.pop();
                }
            }
        }

        if (stack.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}

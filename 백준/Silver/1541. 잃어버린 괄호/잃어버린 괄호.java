import java.io.*;

public class Main {
	static int answer = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String example = br.readLine();
		String[] str = example.split("-");
		for (int i = 0; i < str.length; i++) {
			int temp = mySum(str[i]);
			if (i == 0) {
				answer = answer + temp;
			} else {
				answer = answer - temp;
			}
		}
		System.out.println(answer);
	}
	private static int mySum(String example) {
		int sum = 0;
		String[] temp = example.split("\\+");
		for (int i = 0; i < temp.length; i++) {
			sum = sum + Integer.parseInt(temp[i]);
		}
		return sum;
	}
}
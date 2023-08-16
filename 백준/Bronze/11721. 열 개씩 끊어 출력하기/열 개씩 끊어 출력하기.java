import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int index = 0;
		
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
			index++;

			if (index == 10) {
				System.out.println();
				index = 0;
			}
		}
	}
}
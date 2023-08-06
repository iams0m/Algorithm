import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a1 = Integer.parseInt(br.readLine());
		int a2 = Integer.parseInt(br.readLine());
		int a3 = Integer.parseInt(br.readLine());

		if (a1 + a2 + a3 == 180) {
			if (a1 == a2 && a2 == a3) {
				System.out.println("Equilateral");
			} else if (a1 == a2 || a2 == a3 || a1 == a3) {
				System.out.println("Isosceles");
			} else {
				System.out.println("Scalene");
			}
		} else {
			System.out.println("Error");
		}

	}
}
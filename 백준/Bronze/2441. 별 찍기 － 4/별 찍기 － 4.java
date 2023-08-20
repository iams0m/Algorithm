import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= i - 1; ++j) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n - i + 1; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());

		int[] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] dayOfWeek = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

		int sum = 0;
		for (int i = 0; i < x - 1; i++) {
			sum += month[i];
		}
		
		sum += y;
		System.out.println(dayOfWeek[sum % 7]);
	}
}
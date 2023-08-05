import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;

		int x_axis[] = new int[3];
		int y_axis[] = new int[3];

		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			x_axis[i] = Integer.parseInt(st.nextToken());
			y_axis[i] = Integer.parseInt(st.nextToken());
		}
		br.close();

		int x = 0;
		int y = 0;

		if (x_axis[0] == x_axis[1]) {
			x = x_axis[2];
		} else if (x_axis[0] == x_axis[2]) {
			x = x_axis[1];
		} else {
			x = x_axis[0];
		}

		if (y_axis[0] == y_axis[1]) {
			y = y_axis[2];
		} else if (y_axis[0] == y_axis[2]) {
			y = y_axis[1];
		} else {
			y = y_axis[0];
		}

		bw.write(x + " " + y);
		bw.flush();
		bw.close();
	}
}
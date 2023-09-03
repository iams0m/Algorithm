import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> myQueue = new LinkedList<Integer>();
		int N = Integer.parseInt(br.readLine());
		for (int i = 1; i <= N; i++) {
			myQueue.add(i);
		}
		while (myQueue.size() > 1) {
			myQueue.poll();
			int temp = myQueue.poll();
			myQueue.add(temp);
		}
		System.out.println(myQueue.poll());
	}
}
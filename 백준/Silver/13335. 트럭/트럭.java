import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        Queue<Integer> truck = new LinkedList<>();
        Queue<Integer> bridge = new LinkedList<>();

        int time = 0;
        int weight = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            truck.offer(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < w; i++) {
            bridge.offer(0);
        }

        while (!bridge.isEmpty()) {
            time++;
            weight -= bridge.poll();

            if (!truck.isEmpty()) {
                if (truck.peek() + weight <= L) {
                    weight += truck.peek();
                    bridge.add(truck.poll());
                } else {
                    bridge.add(0);
                }
            }
        }
        System.out.print(time);
    }
}

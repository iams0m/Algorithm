package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BFS_List {
    static boolean visited[];
    static LinkedList<Integer>[] adjList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 정점의 개수
        int m = Integer.parseInt(st.nextToken()); // 간선의 개수
        int v = Integer.parseInt(st.nextToken()); // 탐색을 시작할 정점의 번호

        // 방문 여부를 저장하는 배열을 초기화합니다.
        visited = new boolean[n + 1];

        // 인접 리스트를 초기화합니다. (각 정점마다 연결된 정점을 저장하기 위해 LinkedList 배열을 사용합니다.)
        adjList = new LinkedList[n + 1];
        for (int i = 0; i <= n; i++) {
            adjList[i] = new LinkedList<Integer>();
        }

        // 간선 정보를 입력받아 인접 리스트를 구성합니다.
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine()); // 한 줄씩 읽어와야 합니다.
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            // 양방향 그래프이므로 start와 end를 서로 연결합니다.
            adjList[start].add(end);
            adjList[end].add(start);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(adjList[i]); // 방문 순서를 위해 각 정점의 인접 리스트를 오름차순 정렬
        }

        System.out.println("BFS - 인접리스트");
        bfs_list(v, adjList, visited); // BFS 탐색 시작
    }

    // BFS - 인접리스트
    public static void bfs_list(int v, LinkedList<Integer>[] adjList, boolean[] visited) {
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<Integer>(); // BFS 탐색을 위한 큐 생성
        visited[v] = true; // 시작 정점을 방문했다고 표시
        queue.add(v); // 시작 정점을 큐에 추가

        while (!queue.isEmpty()) {
            v = queue.poll();
            sb.append(v).append(" ");

            Iterator<Integer> iter = adjList[v].listIterator(); // 현재 정점의 인접 리스트를 순회하는 반복자 생성
            while (iter.hasNext()) {
                int w = iter.next();
                if (!visited[w]) {
                    visited[w] = true; // 정점을 방문 표시합니다.
                    queue.add(w); // 큐에 추가하여 나중에 탐색
                }
            }
        }
        System.out.println(sb);
    }
}
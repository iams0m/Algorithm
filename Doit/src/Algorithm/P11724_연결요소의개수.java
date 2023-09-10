package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*연결 요소의 개수를 찾는 문제를 해결하기 위해 DFS(Depth-First Search) 알고리즘 사용*/

public class P11724_연결요소의개수 {
	static boolean visited[];
	static ArrayList<Integer>[] A;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 입력으로 정점의 개수(n)와 간선의 개수(m)를 받습니다.
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		// 방문 여부를 저장하는 배열을 초기화합니다.
		visited = new boolean[n + 1];

		// 인접 리스트를 초기화합니다. (각 정점마다 연결된 정점을 저장하기 위해 ArrayList 배열을 사용합니다.)
		A = new ArrayList[n + 1];
		for (int i = 1; i < n + 1; i++) {
			A[i] = new ArrayList<Integer>();
		}

		// 간선 정보를 입력받아 인접 리스트를 구성합니다.
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());

			// 양방향 그래프이므로 start와 end를 서로 연결합니다.
			A[start].add(end);
			A[end].add(start);
		}

		int count = 0; // 연결 요소의 개수를 세기 위한 변수를 초기화합니다.

		// 모든 정점을 순회하면서 방문하지 않은 정점을 시작점으로 DFS를 수행하여 연결 요소를 찾습니다.
		for (int i = 1; i < n + 1; i++) {
			if (!visited[i]) {
				count++; // 연결 요소 개수를 증가시킵니다.
				DFS(i); // DFS를 통해 현재 연결 요소를 탐색합니다.
			}
		}

		System.out.println(count); // 최종 연결 요소의 개수를 출력합니다.
	}

	// 깊이 우선 탐색(DFS) 함수
	private static void DFS(int v) {
		if (visited[v]) {
			return; // 이미 방문한 정점이면 종료합니다.
		}
		visited[v] = true; // 정점을 방문 표시합니다.

		// 현재 정점과 연결된 모든 정점에 대해 DFS를 재귀적으로 호출합니다.
		for (int i : A[v]) {
			if (!visited[i]) {
				DFS(i);
			}
		}
	}
}
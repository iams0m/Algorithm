package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2178_미로탐색 {
	static int[] dx = { 0, 1, 0, -1 }; // 상하좌우 방향을 표현하는 배열 (x 좌표 이동)
	static int[] dy = { 1, 0, -1, 0 }; // 상하좌우 방향을 표현하는 배열 (y 좌표 이동)
	static boolean[][] visited; // 방문 여부를 저장하는 배열
	static int[][] A; // 미로 정보를 저장하는 배열
	static int N, M; // 미로의 크기를 나타내는 변수

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); // 미로의 행 수 입력
		M = Integer.parseInt(st.nextToken()); // 미로의 열 수 입력
		A = new int[N][M]; // 미로 정보를 저장할 2차원 배열
		visited = new boolean[N][M]; // 방문 여부를 저장할 2차원 배열 초기화

		// 미로 정보 입력
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for (int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(line.substring(j, j + 1));
			}
		}

		BFS(0, 0); // 너비 우선 탐색(BFS)을 통해 최단 경로 찾기
		System.out.println(A[N - 1][M - 1]); // 미로의 마지막 위치에 저장된 최단 경로 출력
	}

	private static void BFS(int i, int j) {
		Queue<int[]> queue = new LinkedList<>(); // BFS를 위한 큐 생성
		queue.offer(new int[] { i, j }); // 시작 위치를 큐에 추가
		visited[i][j] = true; // 시작 위치를 방문했다고 표시

		while (!queue.isEmpty()) { // 큐가 비어 있을 때까지 반복
			int now[] = queue.poll(); // 큐에서 다음 탐색 위치를 꺼냄
			for (int k = 0; k < 4; k++) { // 상하좌우 4방향을 탐색
				int x = now[0] + dx[k]; // 다음 x 좌표 계산
				int y = now[1] + dy[k]; // 다음 y 좌표 계산
				if (x >= 0 && y >= 0 && x < N && y < M) { // 배열 범위 안에 있는지 확인
					if (A[x][y] != 0 && !visited[x][y]) { // 벽이 아니고 아직 방문하지 않은 곳인 경우
						visited[x][y] = true; // 방문했다고 표시
						A[x][y] = A[now[0]][now[1]] + 1; // 최단 경로 거리 업데이트
						queue.add(new int[] { x, y }); // 다음 위치를 큐에 추가
					}
				}
			}
		}
	}
}
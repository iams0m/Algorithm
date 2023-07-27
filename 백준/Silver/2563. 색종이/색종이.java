import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = 0;  // 사각형의 총 면적을 저장하는 변수
		int n = Integer.parseInt(br.readLine());  // 입력으로 받을 사각형의 개수를 저장하는 변수
		boolean[][] arr = new boolean[100][100];  // 100x100 크기의 2차원 boolean 배열 선언 (기본값은 false)

		// 입력으로 주어진 사각형들을 2차원 배열에 표시하고, 그 면적을 계산하여 total에 더하는 과정
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());  // 사각형의 왼쪽 아래 모서리 x 좌표
			int y = Integer.parseInt(st.nextToken());  // 사각형의 왼쪽 아래 모서리 y 좌표
			
			// 사각형이 차지하는 부분을 2차원 배열에 표시하고, 중복해서 더하지 않기 위해 조건문 사용
			for (int j = x; j < x + 10; j++) {
				for (int k = y; k < y + 10; k++) {
					if (!arr[j][k]) {  // 해당 칸이 이전에 표시된 적이 없다면
						arr[j][k] = true;  // 사각형이 차지하는 부분임을 표시
						total++;  // 면적 증가
					}
				}
			}
		}

		System.out.print(total);  // 총 면적 출력
	}
}

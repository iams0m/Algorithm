import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[][] ch = new char[5][15]; // 5줄에 최대 15개의 문자를 저장할 2차원 배열 선언
		int max = 0; // 입력받은 문자열 중 가장 긴 길이를 저장할 변수 선언

		// 5줄에 각각 문자열을 입력받고 가장 긴 문자열의 길이를 구함
		for (int i = 0; i < ch.length; i++) {
			String str = br.readLine();
			// 최댓값 구하는 방법 1
			max = Math.max(max, str.length());
			// 최댓값 구하는 방법 2
			// if (str.length() > max) {
			// 	max = str.length();
			// }
			// 최댓값 구하는 방법 3
			// max = str.length() > max ? str.length() : max;
			for (int j = 0; j < str.length(); j++) {
				ch[i][j] = str.charAt(j); // 문자열을 문자 단위로 2차원 배열에 저장
			}
		}

		StringBuilder sb = new StringBuilder();
		// 세로로 읽어서 문자열을 만들고 출력
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < 5; j++) {
				if (ch[j][i] == '\0') { // 배열의 끝을 확인하여 문자가 없으면 건너뜀
					continue;
				}
				sb.append(ch[j][i]); // 세로로 읽어서 StringBuilder에 추가
			}
		}
		System.out.println(sb); // 결과 출력
	}

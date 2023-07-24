import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		// 방법 1(if문과 System.in.read()로 입력값 받기)
		int count = 0;
		int value;

		while (true) {
			value = System.in.read();
			if (value == '\n') {
				break;
			}
			if (value < 68) {
				count += 3;
			} else if (value < 71) {
				count += 4;
			} else if (value < 74) {
				count += 5;
			} else if (value < 77) {
				count += 6;
			} else if (value < 80) {
				count += 7;
			} else if (value < 84) {
				count += 8;
			} else if (value < 87) {
				count += 9;
			} else {
				count += 10;
			}
		}
		System.out.println(count);

		// 방법 2(switch-case와 BufferReader로 입력값 받기)
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// String str = br.readLine();
		// int count = 0;
		// for (int i = 0; i < str.length(); i++) {
		// 	switch (str.charAt(i)) {
		// 	case 'A' : case 'B' : case 'C' :
		// 		count += 3;
		// 		break;
				
		// 	case 'D' : case 'E' : case 'F' :
		// 		count += 4;
		// 		break;

		// 	case 'G' : case 'H' : case 'I' :
		// 		count += 5;
		// 		break;
			
		// 	case 'J' : case 'K' : case 'L' :
		// 		count += 6;
		// 		break;	
				
		// 	case 'M' : case 'N': case 'O' : 
		// 		count += 7; 
		// 		break;
                
		// 	case 'P' : case 'Q': case 'R' : case 'S' :
		// 		count += 8; 
		// 		break;
                
		// 	case 'T' : case 'U': case 'V' : 
		// 		count += 9; 
		// 		break;
                
		// 	case 'W' : case 'X': case 'Y' : case 'Z' : 
		// 		count += 10; 
		// 		break;	
		// 	}
		// }
		// System.out.print(count);
	}
}

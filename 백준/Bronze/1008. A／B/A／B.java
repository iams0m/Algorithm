public class Main {

	public static void main(String[] args) throws java.io.IOException {
		double a = System.in.read() - '0';
		System.in.read(); // 한 번에 하나의 문자(바이트)만을 읽어들입니다.
		double b = System.in.read() - '0';
		System.out.println(a / b);

	}

}

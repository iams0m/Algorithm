public class Main {
    public static void main(String[] args) {

        boolean[] check = new boolean[10001];

        for (int i = 1; i <= 10000; i++) {
            int n = d(i);
            if (n <= 10000) {
                check[n] = true;
            }
        }
        
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 10000; i++) {
            if (!check[i]) {
                sb.append(i).append('\n');
            }
        }
        System.out.print(sb);
    }

    public static int d(int num) {
        int sum = num;

        while (num != 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }
        return sum;
    }
}

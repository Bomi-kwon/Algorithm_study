import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int numbers_of_divisor = 0;
		
		
		for (int i = 1 ; i <= N ; i++) {
			if (N % i == 0) {
				numbers_of_divisor++;
				if (numbers_of_divisor == K) {
					System.out.println(i);
					break;
				}
			}
		}
		if (numbers_of_divisor < K) {
			System.out.println(0);
		}
		
	}
}
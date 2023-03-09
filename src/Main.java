import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());

		if (N == 1) {
			System.out.println(1);
		} 
		else {
			for (int i = 1; i <= 20000; i++) {
				if (N > get_last_term(i) && N <= get_last_term(i + 1)) {
					System.out.println(i + 1);
					break;
				}
			}
		}

	}

	private static int get_last_term(int i) {
		return (int) (3 * Math.pow(i, 2)) - 3 * i + 1;
	}
}

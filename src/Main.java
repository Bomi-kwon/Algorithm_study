import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		int A;
		int B;
		
		while (true) {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(bf.readLine());
			
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			
			if (A == 0 && B == 0) {
				break;
			}
			else if (B%A == 0 && A%B != 0) {
				System.out.println("factor");
				continue;
			}
			else if (A%B == 0 && B%A != 0) {
				System.out.println("multiple");
				continue;
			}
			else if (A%B != 0 && B%A != 0) {
				System.out.println("neither");
				continue;
			}
			
		}
		
		
	}
}
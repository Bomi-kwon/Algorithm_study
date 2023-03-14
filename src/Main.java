import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(bf.readLine());
		
		int[] arr_H = new int[T];
		int[] arr_W = new int[T];
		int[] arr_N = new int[T];
		
		for(int i = 0 ; i < T ; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			arr_H[i] = Integer.parseInt(st.nextToken());
			arr_W[i] = Integer.parseInt(st.nextToken());
			arr_N[i] = Integer.parseInt(st.nextToken());
		}
		int floor;
		int room;
		
		for(int i = 0 ; i < T ; i++) {
			if(arr_N[i] % arr_H[i] == 0) {
				floor = arr_H[i];
				room = arr_N[i] / arr_H[i];
			}
			else {
				floor = arr_N[i] % arr_H[i];
				room = arr_N[i] / arr_H[i] + 1;
			}
			System.out.println(floor*100 + room);
		}
		
		
		
		
	}
}
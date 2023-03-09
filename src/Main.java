import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		int distance_after_firstday = V-A;
		int distance_per_day = A-B;
		int days;
		
		if(distance_after_firstday % distance_per_day == 0) {
			days = distance_after_firstday / distance_per_day + 1;
		}
		else {
			days = distance_after_firstday / distance_per_day + 2;
		}
		
		String str = Integer.toString(days);
		bw.write(str);
		bw.flush();
		bw.close();
	}
}
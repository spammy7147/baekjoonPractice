package baekjoon.step.forProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No10871 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		

		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = Integer.parseInt(st.nextToken());
		int compare = Integer.parseInt(st.nextToken());
		
		StringTokenizer nums = new StringTokenizer(br.readLine());
		br.close();
		
		for (int i = 0; i < count ; i++) {
			int check = Integer.parseInt(nums.nextToken());
			if (check < compare) {
				bw.write(check+" ");
			}
			
		}
		bw.flush();
		bw.close();
		
	}

}

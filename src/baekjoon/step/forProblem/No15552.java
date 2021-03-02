package baekjoon.step.forProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;






public class No15552 {

	public static void main(String[] args) {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			
			int count = Integer.parseInt(bf.readLine());
			
			for (int i = 0 ; i < count ; i++) {
				StringTokenizer st = new StringTokenizer(bf.readLine());
				int num1 = Integer.parseInt(st.nextToken());
				int num2 = Integer.parseInt(st.nextToken());
				bw.write(num1 + num2+ "\n");
			}
			bf.close();
			bw.flush();
			bw.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	
		

	}
	
}

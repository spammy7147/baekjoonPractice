package baekjoon.step.forProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No2438 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		

		int count = Integer.parseInt(br.readLine());
		br.close();
		
		for (int i = 0; i < count ; i ++) {
			for(int j = 0 ; j <= i ; j ++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		
	}

}

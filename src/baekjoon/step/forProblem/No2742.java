package baekjoon.step.forProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



public class No2742 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		br.close();
		for (int i = count; i >= 1; i--) {
			bw.write(i+"\n");
		}
		bw.flush();
		bw.close();
	}
	
}

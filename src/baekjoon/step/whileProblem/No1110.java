package baekjoon.step.whileProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No1110 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		br.close();
		
		int count = 0;
		int one = num%10;
		int ten = num/10;
		int tempten = 0 ;
		
		while(true) {
			
			
			count++;
			tempten = one;
			one = (ten+one)%10;
			ten = tempten;
			
			
			if(ten*10 + one == num) {
				break;
			}

		}
		System.out.println(count);
		bw.flush();
		bw.close();
	}

}

package baekjoon.step.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No3052 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] array = new int[10];
		boolean[] bool = new boolean[42];
		int count = 0;
		
		for(int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(br.readLine())%42;
		}
		
		for(int i : array) {
			bool[i] = true;
		}
		
		for (boolean i : bool) {
			if(i) {
				count++;
			}
		}
		br.close();
		bw.write(count+"\n");
		bw.flush();
		bw.close();
		
		
	}

}

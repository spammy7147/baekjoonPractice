package baekjoon.step.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No1546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int num = Integer.parseInt(br.readLine());
		double[] array = new double[num];
		double max = 0;
		double tot = 0;
		double avg = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < num; i++) {
			array[i] = Integer.parseInt(st.nextToken());
			
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		for(double i : array) {
		
			tot = tot + (i/max)*100;
		
		}
		
		avg = tot/array.length;
		bw.write(avg+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}

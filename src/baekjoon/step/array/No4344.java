package baekjoon.step.array;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class No4344 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		
		
		int num = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < num; i++) {
		
			double tot = 0;
			double avg = 0;
			double count = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int test = Integer.parseInt(st.nextToken());
			double[] scores = new double[test];

			
			for (int j = 0; j < test; j++) {
				scores[j] = Integer.parseInt(st.nextToken());
				tot += scores[j];
				

			}
	
			avg = tot/test;
			
			for(double k : scores) {
	
				if (k > avg) {
					count++;
				}
			}
			
			System.out.printf("%.3f%s %n",(count/test)*100,"%");
			
			
			
		}
		br.close();
	}

}

package baekjoon.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No8958 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		String[] test = new String[num];
		
		
		for(int i = 0; i < num; i++) {
			test[i] = br.readLine();
			
		}
	
	
		for (String t : test) {
			int score = 0;
			int count = 0;
			
			for(int i = 0; i < t.length(); i++) {
				
				if (t.charAt(i) == 'O'){
					count++;
					
				}else if(t.charAt(i) == 'X') {
					for(int j = 1; j <= count; j++) {
						score += j;
					}
					count = 0;
				}
			}
			
			if (count != 0) {
				for(int j = 1; j <= count; j++) {
					score += j;
				}
				count = 0;
			}
			
			bw.write(score + "\n");
			
			
			
		}
		
		bw.flush();
		bw.close();
		br.close();

	}

}

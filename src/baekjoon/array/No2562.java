package baekjoon.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No2562 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int[] nums = new int[9];
		int max = nums[0];
		int count=0;
		
		for(int i = 0; i < nums.length; i++) {
			
			nums[i] = Integer.parseInt(br.readLine());
			
		}
		
		
		for(int i = 0; i < nums.length; i++) {
				
			if(nums[i] > max) {
				max = nums[i];
				count = i+1;
			}	
				
			}
		bw.write(max + "\n");
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}

}

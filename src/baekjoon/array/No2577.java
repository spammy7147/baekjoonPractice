package baekjoon.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No2577 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int[] array = new int[10];
		
		int result = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		br.close();
		String sb = Integer.toString(result);
		

		for (int i = 0; i < sb.length(); i++) {
			
			array[Character.getNumericValue(sb.charAt(i))]++;
			
		}
		
		for (int i=0; i < array.length; i++) {
			bw.write(array[i]+ "\n");
		}

		
		bw.flush();
		bw.close();

	}

}

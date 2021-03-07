package baekjoon.step.function;

import java.util.Scanner;

public class No1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println(cnt(num));
		

	}


public static int cnt(int num) {
	if (num < 100) {
		return num;
	}else {
		if(num == 1000) {
			num = 999;
		}
		int cnt=0;
		for(int i=100;i<=num;i++) {
			int one = i%10;
			int ten = (i/10)%10;
			int hun = (i/100)%10;
			
			if((hun-ten) == (ten-one)) {
				cnt++;
				
			}
		
			
		}
		return cnt+99;
	}
	
	
	
}
	
	
	
}


package baekjoon.step.ifProblem;

import java.util.Scanner;

public class No2884 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		sc.close();
		
	
		if (minute - 45 < 0) {
			minute += (60-45);
			if (hour-1 < 0) {
				hour += (24-1);
			}else {
				hour -= 1;
			}
		}else {
			minute -= 45;
		}
		
		System.out.println(hour + " " + minute );
	}
}

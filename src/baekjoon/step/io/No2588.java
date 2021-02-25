package baekjoon.step.io;

import java.util.Scanner;

public class No2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();
		
		int first = (n2/100)%10;
		int second = (n2/10)%10;
		int third = (n2/1)%10;
		
		System.out.println(n1*third);
		System.out.println(n1*second);
		System.out.println(n1*first);
		System.out.println(n1*n2);
		
		
		
		
		
	}
	
	
}

package baekjoon.step.io;

import java.util.Scanner;

public class No1008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b);
			System.out.println(a%b);
			
			
		} finally {
			sc.close();
		}

	}

}

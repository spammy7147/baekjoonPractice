package baekjoon.step.io;

import java.util.Scanner;

public class No10869 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			System.out.println((a+b)%c);
			System.out.println(((a%c)+(b%c))%c);
			System.out.println((a*b)%c);
			System.out.println(((a%c)*(b%c))%c);
			
			
			
		} finally {
			sc.close();
		}

	}

}

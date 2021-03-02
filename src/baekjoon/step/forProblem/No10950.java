package baekjoon.step.forProblem;

import java.util.Scanner;

public class No10950 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int num = sc.nextInt();
		sc.close();
		for (int i = 0; i < num ; i++) {
			
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			System.out.println(n1+n2);
			
		}
	}

}

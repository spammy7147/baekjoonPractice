package baekjoon.step.forProblem;

import java.util.Scanner;

public class No8393 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		sc.close();
		int add =0;
		for (int i = 0; i <= n; i++) {
			add += i;
		}
		System.out.println(add);

	}

}

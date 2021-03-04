package baekjoon.step.function;


public class No4673 {

	public static void main(String[] args) {
		
		boolean[] series = new boolean[10001];
		
		for(int i = 1; i <= 10000; i++) {
			if (s(i) <=10000) {
				series[s(i)] = true;				
			}
		}
		
		
		
		for (int i = 1; i <=10000; i++) {
			
			if (series[i]==false) {
				System.out.println(i);
			}
		}
		
		
	}

	
	
	public static int s(int n) {
		
		
		
		n = n + (n/10000)%10 + (n/1000)%10 + (n/100)%10 + (n/10)%10 + n%10;
		
			
		
		return n;
	}
	
}

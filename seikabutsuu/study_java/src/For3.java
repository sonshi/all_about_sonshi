package study_java;

public class For3 {
	public static void main(String args[]) {
		int max = 100;
		int sum = 0;
		
		for (int i = 1; i <= max; i++) {
			sum = sum + i;
		}
		System.out.println(max + "までの総和" + sum );
	}
}

package study_java;

public class Array1 {
	public static void main(String args[]) {
		double[] height;
		double average;
		
		height = new double[3];
		height[0] = 172;
		height[1] = 184;
		height[2] = 160;
		average = (height[0] + height[1] + height[2]) / 3;
		System.out.println("平均身長：" + average);
	}
}

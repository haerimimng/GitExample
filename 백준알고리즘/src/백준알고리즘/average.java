package 백준알고리즘;

import java.util.Scanner;

/**
 * 자기 점수의 최대값, 점수 /m =/100
 * 50/70
 * @author 이혜림
 *
 */
public class average {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	
	double[] input = new double[N];
	double M = 0;
	for (int i = 0; i < N; i++) {
		input[i] = sc.nextInt();
		if(input[i]>N)M = input[i];
	}
	double sum = 0;
	for (int i = 0; i < N; i++) {
		input[i] = (double)input[i]/M *100;
		sum += input[i];
	}
	System.out.print(sum/N);
}
}

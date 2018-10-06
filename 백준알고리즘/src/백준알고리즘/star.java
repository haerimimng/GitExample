package 백준알고리즘;

import java.util.Scanner;

/**
 * 첫쨋줄 별 1개, 둘쨋줄 별 2개 n번째 줄에는 별 n개 찍기
 * 
 * @author 이혜림
 *
 */
public class star {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i <= N; i++) {
			for (int k = 1; k <= N-i; k++) {
				System.out.print("*");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
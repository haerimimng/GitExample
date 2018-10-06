package 백준알고리즘;

import java.util.Scanner;

/**
 * N찍기, 첫쨋줄에 자연수가 주어지고 N번째 줄까지 차례대로 모든 값 출력하기
 * 
 * @author 이혜림
 *
 */
public class Nmain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			System.out.println(i);
		}
	}
}

package 백준알고리즘;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 다리 놓기 문제/ 왼쪽 spot(N) & 오른쪽 spot(M)
 * 다리 놓을 수 있는 갯수 인출하기
 * @author 이혜림
 * DP함수 (N<=M) / 서쪽 갯수만큼 다리 N 
 */
public class no1010 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	
	for(int i = 0 ; i < T ; i++) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		
	BigInteger result = new BigInteger("1");
	int temp = N;
			
	for (int j = 0; j < N; j++) {
		result = result.multiply(BigInteger.valueOf(M));
		M--;
	}
	for (int j = 0; j < N; j++) {
		result = result.divide(BigInteger.valueOf(N));
		N--;
	}
	System.out.println(result);
	}
}
}

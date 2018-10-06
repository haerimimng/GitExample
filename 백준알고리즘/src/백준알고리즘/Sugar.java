package 백준알고리즘;

import java.util.Scanner;

/**
 * 설탕가게에 설탕을 정확하게 N킬로그램 배달해야한다. 봉지는 3킬로그램과 5 킬로그램 봉지가 있다.
 * 
 * 상근이가 설탕을 N킬로그램 배달해야 할때, 봉지 몇개 배달
 * - 정확하게 N 킬로그램 만들 수 x -> -1출력 
 * @author 이혜림
 *
 */
public class Sugar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,N; //A: 5KG 박스 , B: 3KG박스
		N = sc.nextInt();
		boolean flag = true;
		
		for(b=0; b<N/3+1; b++) {
			for (a=0; a<N/5+1;a++) {
				int k = 5*a + 3*b;
				if (N == k) {
					System.out.println(a+b);
					break;
				}
			}
			int k = 5*a + 3*b;
			if (N == k) {
				flag = false;
				break;
			} 
		}
		if (flag) {
			System.out.println(-1);
		}
	}
}
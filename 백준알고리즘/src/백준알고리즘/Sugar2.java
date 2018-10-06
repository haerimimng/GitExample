package 백준알고리즘;

import java.util.Scanner;

/**
 * 설탕문제 다른 풀이법 : 3 / 5키로 봉지로 모든 값 이동
 * 
 * @author 이혜림
 *
 */
public class Sugar2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sugar = sc.nextInt();

		if (sugar >= 3 && sugar <= 5000) {
			if (sugar % 5 == 0) {// 경우1_5로 나누어 떨어지는 경우
				System.out.println(sugar / 5); //인출
				sugar = -1;
			} else {//경우2_5로도 떨어짐 3으로도 떨어짐
				int fivesugarbyonebox = sugar / 5; //5개 들어있는 박스 
				for (int fiveSugar = fivesugarbyonebox; fiveSugar > 0; fiveSugar++) {
					int remainSugar = sugar - (fiveSugar * 5);
					//5로떨어져서 남은 설탕 3으로 나누기
					if (remainSugar % 3 == 0) {
						// 5로 나누어 떨어지고 + 3으로도 나누어 떨어짐 
						int threeSugarByOneBox = remainSugar / 3;
						//3개 들어있는 박스 + 다섯개 박스 
						System.out.println(threeSugarByOneBox + fivesugarbyonebox);
						//나머지 다 -1때려넣기
						sugar = -1;
						break;
					}
				}
			}
			if (sugar % 3 == 0) { //경우3_3으로 나누어 떨어지는 경우 
				System.out.println(sugar / 3);
			} else if (sugar > 0) { //경우4_아니면 다 -1
				System.out.println(-1);
			}

		}

	}
}

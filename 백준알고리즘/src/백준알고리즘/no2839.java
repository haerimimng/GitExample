package 백준알고리즘;

import java.util.Scanner;

/**
 * 설탕 주머니 / 3kg 와 5kg 1. 5로 나누고 3으로도 나누어떨어짐 2. 3으로 나누어떨어짐 3. 5로 나누고, 나머지 < 5 그리고
 * N-5 > 4 (1,2,4) 4. 나머지 경우
 * 
 * @author 이혜림
 *
 */
public class no2839 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sugarAmount = sc.nextInt();

		if (sugarAmount >= 3 && sugarAmount <= 5000) {
			if (sugarAmount % 5 == 0) {
				System.out.println(sugarAmount / 5);
				sugarAmount = -1;
			} else {
				int fivesugarbyonebox = sugarAmount / 5;
				for (int fiveSugarBoxCnt = fivesugarbyonebox; fiveSugarBoxCnt > 0; fiveSugarBoxCnt++) {
					int remainSugarAmount = sugarAmount - (fiveSugarBoxCnt * 5);

					if (remainSugarAmount % 3 == 0) {
						int threeSugarByOneBox = remainSugarAmount / 3;
						System.out.println(threeSugarByOneBox + fivesugarbyonebox);
						sugarAmount = -1;
						break;

					}

				}

			}
			if (sugarAmount % 3 == 0) {
				System.out.println(sugarAmount / 3);
			} else if (sugarAmount > 0) {
				System.out.println(-1);
			}

		}

	}
}
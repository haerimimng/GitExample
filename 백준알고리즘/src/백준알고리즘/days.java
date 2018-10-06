package 백준알고리즘;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

/**
 * 날짜 입력하면 요일값 인출코딩 작성하기
 * 
 * @author 이혜림
 *
 */
public class days {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close(); // 입력값 두개 작성하면 닫기

		int cnt = 0;
		for (int i = 1; i < x; i++) {
			if (i == 2) {
				for (int j = 1; j <= 28; j++)
					cnt++; // 1-28까지 세기
			}
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
				for (int j = 1; j <= 31; j++)
					cnt++;
			}
			if (i == 4 || i == 6 || i == 9 || i == 11) {
				for (int j = 1; j <= 30; j++)
					cnt++;
			}
		}
		int k = (cnt + y) % 7;

		if (k == 0) {
			System.out.print("SUN");
		}
		if (k == 1) {
			System.out.print("MON");
		}
		if (k == 2) {
			System.out.print("TUE");
		}
		if (k == 3) {
			System.out.print("WED");
		}
		if (k == 4) {
			System.out.print("THU");
		}
		if (k == 5) {
			System.out.print("FRI");
		}
		if (k == 6) {
			System.out.print("SAT");
		}
	}
}

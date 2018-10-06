package 백준알고리즘;

import java.util.Scanner;

/**
 * 1000&1001. 두 정수 A와 B를 입력받은 다음
 * A+B / A-B를 출력하는 프로그램을 작성하시오
 * 
 * @author 이혜림
 *
 */
public class PlusMinus {
public static void main(String[] args) {
	int a, b; 
	//작성 내용 scanner 로 읽기 
	Scanner sc = new Scanner(System.in);
	a = sc.nextInt();
	b = sc.nextInt();
	if (0<a && a<10 && 0<b && b<10) {
		System.out.println((double)a/b);
	}else
		System.out.println("입력이 잘못됨");
	
}
}

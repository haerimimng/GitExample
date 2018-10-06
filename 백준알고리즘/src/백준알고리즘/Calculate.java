package 백준알고리즘;

import java.util.Scanner;

/**
 * 자연수 a와 b가 주어진다. 사칙연산을 출력하는 프로그램을 작성하여라, 1<=a / b <= 10,000
 * 
 * @author 이혜림
 *
 */
public class Calculate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(0<a && a<10000 && 0<b && b<10000) {
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b);
			System.out.println(a%b);
		}else 
			System.out.println("범위를 벗어난 숫자입니다.");
	}
}

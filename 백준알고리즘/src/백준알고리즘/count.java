package 백준알고리즘;

import java.util.Scanner;

/*
 * 단어의 개수 찾기 : 문자열에 단어가 몇개인지 찾기
 * Split함수 이용하기
 */
public class count {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String text = sc.nextLine();
	
	String[]arrayStringSplit = text.split(" ");
	
	int count = 0;
	for (String string : arrayStringSplit) {
		if(!string.equals(" ")) {
			++count;
			
		}
	}
	System.out.println(count);
	sc.close();
}
}

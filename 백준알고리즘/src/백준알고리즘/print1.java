package 백준알고리즘;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1. 입력받기
 * 2. 입력은 최대 100줄
 * 3. 알파벳 소문자, 대문자, 공백, 숫자
 * 4. 각줄은 100글자 안넘음 
 * 5. 빈줄을 주어지지 않음
 * 6. 각 줄은 공백으로 시작되지 않고, 공백으로 끝나지 않는다. 
 */
public class print1 {
	public static void main(String[] args) {
		//연속으로 입력받기
		Scanner sc = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<>();
		int cnt = 0;
		
		//연속해서 입력 받기 
		while(sc.hasNextLine()) {
			String sentence = sc.nextLine();
			//6번 조건 / 공백시작 공백끝 아님
			if(sentence.startsWith(" ") || sentence.endsWith(" ") || sentence.length()>100  ) {
				System.out.println("다시 입력하세요.");
			}else if (cnt >= 99) {
				System.out.println("100줄이 초과되었습니다.");
			break;
			
		}else {
			cnt ++;
			words.add(sentence);
		}
			
			
			//공백 입력시, 출력
			if(sentence.isEmpty()) {
				for (int i = 0; i < words.size(); i++) {
					System.out.println(words.get(i));
				}break;
			}
		}
	}
}

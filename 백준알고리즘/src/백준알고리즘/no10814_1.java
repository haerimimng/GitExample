package 백준알고리즘;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ArrayList를 활용한 문제로 다시 풀기
 * @author 이혜림
 *
 */
public class no10814_1 {
	static class Dic{
		int key;
		String value;
		
		Dic(int key, String value){
			this.key = key;
			this.value = value;
		}

		@Override
		public String toString() {
			StringBuilder str = new StringBuilder();
			str.append(key);
			str.append(value);
			return str.toString();
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Dic> dic = new ArrayList<Dic>();
		int num = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < num; i++) {
			
		}
	}
	
}

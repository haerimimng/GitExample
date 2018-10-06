package 백준알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 에디터 편집 기능 만들기
 * @author 이혜림
 *L: 커서 왼쪽 한칸 / D:커서 오른쪽
 *B: 문자 삭제
 *P $: $ 문자 추가하기 
 */
public class no1406 {
public static void main(String[] args) throws IOException {
	int N;		//명령어 개수 
	String cmd; //주어진 값
	
	StringTokenizer st;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Editor editor = new Editor(br.readLine().toCharArray());
	//editor 클래스 이용한다.
	N = Integer.parseInt(br.readLine());
	for (int i = 0; i < N; i++) {
		st = new StringTokenizer(br.readLine());
		cmd = st.nextToken();
		
		switch(cmd) {
		case"L": editor.L(); break;
		case"D": editor.D();break;
		case"B": editor.B();break;
		case"P": char c = st.nextToken().charAt(0);
				 editor.P(c); break;
			default: break;
		}
	}
	editor.printStr();
}
}

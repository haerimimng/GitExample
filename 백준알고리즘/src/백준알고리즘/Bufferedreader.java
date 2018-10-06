package 백준알고리즘;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 한줄에 적은 내용 계산하기
 * 
 * @author 이혜림
 *
 */
public class Bufferedreader {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in) );
		BufferedWriter Writer = new BufferedWriter(new OutputStreamWriter(System.out) );
		int T = Integer.parseInt(Reader.readLine()); // BufferedReader의 객체는 문자열만 입력 받을 수 있음.
		for(int i=0; i<T; i++) {
			String input = Reader.readLine();
			int index = input.indexOf(" "); // input문자열에서 빈칸" "의 index를 찾아 index변수에 저장.
			int A = Integer.parseInt(input.substring(0,index)); // 0번 지수에서 index-1지수까지 잘라서 저장.
			int B = Integer.parseInt(input.substring(index+1)); // index+1번 지수에서 끝까지 잘라서 저장.
			Writer.write((A+B) + "\n" ); // "\n"은 한 줄 띄기를 의미
		}
		Writer.close(); // Writer.close() 나 Writer.flush()를 해주지 않으면 출력이 틀릴 수 있음.
	}

}
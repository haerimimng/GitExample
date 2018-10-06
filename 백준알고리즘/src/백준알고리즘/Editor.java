package 백준알고리즘;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Editor {
	List<Character> str; //문자 리스트 : str
	ListIterator<Character> it; // 문자 리스트 위치ㅎㅎ

	int index = 0;

	Editor(char[] arr) {
		str = new LinkedList<Character>();
		it = str.listIterator(str.size());
		pushInitStr(arr);

	} // 왼쪽 메서드
	public void L() {
		if (it.hasPrevious()) {
			it.previous();
		}
	} // 오른쪽
	public void D() {
		if (it.hasNext()) {
			it.next();
		}
	} // 문자 삭제

	public void B() {
		if (it.hasPrevious()) {
			it.previous();
			it.remove();
		}
	}

	public void P(char c) {
		it.add(c);
	}

	public void printStr() {
		StringBuilder sb = new StringBuilder();
		for (char c : str) {
			sb.append(c);
		}
		System.out.print(sb);
	}

	private void pushInitStr(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			P(arr[i]);
		}
	}
}

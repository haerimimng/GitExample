package 백준알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * 나이순 정렬 ArrayList? 나이가 같으면 가입한 사람이 먼저
 * 
 * @author 이혜림 PriorityQueue<Member> q = new PriorityQueue<Member>();
 *         PriorityQueue<> q = new PriorityQueue<>(size, Comparator<>
 *         comparator);
 */
public class no10814 {
	static class Member {
			int uid;
			int age;
			String name;
			
			Member(int uid, int age, String name){
				this.uid = uid;
				this.age = age;
				this.name = name;
			}		
	}
public static void main(String[] args) throws NumberFormatException, IOException {
	PriorityQueue<Member> que = new PriorityQueue<Member>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	PriorityQueue<Member> q = new PriorityQueue<Member>(100000, new Comparator<Member>() {

		@Override
		public int compare(Member o1, Member o2) {
			if(o1.age < o1.age) {
				return -1;
			}else if(o1.age> o2.age) {
				return 1;
			}else {
				return o1.uid = o2.uid;
			}
		}
		});
	int n = Integer.parseInt(br.readLine());
	for (int i = 0; i < n; i++) {
		StringTokenizer st = new StringTokenizer(br.readLine());
		q.add(new Member(i, Integer.parseInt(st.nextToken()), st.nextToken()));
	}
	while(!q.isEmpty()) {
		Member m = q.poll();
		System.out.println(m.age + " " + m.name);
	}
	
			}	


}

package 백준알고리즘;

import java.util.Scanner;

public class sum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	String b = sc.next();
	int sum = 0;
	for(int i = 0; i<a; i++) {
		sum += Integer.parseInt(b.substring(i, i+1));
	}
	System.out.print(sum);
}

}

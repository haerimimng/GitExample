package 백준알고리즘;

public class fuctionwhichhavetwofor {
	public static void main(String[] args) {
		boolean check = true;
		for (int a = 0; a < 10; a++) {
			for (int b = 0; b < 10; b++) {
				if(a+b == 10) {
					System.out.println("(" + a  + ","+ b + ")" );
				check = false; // 해 찾으면 폴스 
				}
			}
			if(check) {
			System.out.println("해를 찾지 못하였습니다.");
			}
		}
	}
}

package 백준알고리즘;

import java.math.BigInteger;

/**
 * 큰수의 계산을 위해 필요한 BigInteger
 * @author 이혜림
 */
public class Biginteger {
public static void main(String[] args) {
	System.out.println("최대 정수 : " + Long.MAX_VALUE);
	System.out.println("최대 정수 : " + Long.MIN_VALUE);
	
	BigInteger big1 = new BigInteger("100000000000000000000000");
	BigInteger big2 = new BigInteger("-99999999999999999999999");
	
	BigInteger add = big1.add(big2);
	BigInteger mul = big1.multiply(big2);
	
	System.out.println("덧셈결과" + add);
	System.out.println("곱셈결과" + mul);
}
}

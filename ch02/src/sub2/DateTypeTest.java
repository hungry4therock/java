package sub2;

/* 날짜:2021/05/17
 * 이름:최현진
 * 내용:자바 변수의 자료형 실습하기
 */


public class DateTypeTest {
	public static void main(String[] args) {
		
		//정수형
		
		byte num1 = 127;
		short num2 = 32767;
		int num3 = 2147483647;
		long num4 = 1000L;
		
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
		System.out.println("num3:"+num3);
		System.out.println("num4:"+num4);
		
		//실수형
		
		float var1 = 1.123456789f;
		double var2 = 1.1234567890123456789;
		System.out.println("var1:"+var1);
		System.out.println("var2:"+var2);
		
		//논리형
		
		boolean value1 = true;
		boolean value2 = false;
		
		System.out.println("value1:"+value1);
		System.out.println("value2:"+value2);
		
		//문자형
		
		char ch1 = 'A';
		char ch2 = '가';
		
		System.out.println("ch01:"+ch1);
		System.out.println("ch02:"+ch2);
		
		//문자열
		
		String str1 = "Apple";
		String str2 = "가위";
		String str3 = "A";
		String str4 = "가";
		
		System.out.println("str1:"+str1);
		System.out.println("str2:"+str2);
		System.out.println("str3:"+str3);
		System.out.println("str4:"+str4);
		
		
	}

}

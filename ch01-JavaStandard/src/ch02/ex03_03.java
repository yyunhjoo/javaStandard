package ch02;

import java.util.Scanner;

public class ex03_03 {
	public static void main(String[] args) {
		//16.부호있는 정수의 오버플로우
		short sMin = -32768, sMax = 32767;
		char cMin = 0, cMax = 65535;
		
		System.out.println("sMin = " + sMin);//-32768
		System.out.println("sMin-1 = " + (short)(sMin-1));//32767
		System.out.println("sMax = " + sMax);//32767
		System.out.println("sMax+1 = " + (short)(sMax+1));//-32768
		System.out.println("cMin = " + (int)cMin);//0
		System.out.println("cMin-1 = " + (int)(cMin-1));//65535
		System.out.println("cMax = " + (int)cMax);//65535
		System.out.println("cMax+1 = " + (int)(cMax+1));//0
		System.out.println("=====");
		
		//17.타입 간의 변환방법
		String str = "3";
		
		System.out.println(str.charAt(0) - '0');	//3 문자열을 문자로 반환
		System.out.println('3'-'0'+1);				//4 문자를 숫자로 반환
		System.out.println(Integer.parseInt("3")+1);//4 문자열을 숫자로 반환
		System.out.println("3"+1);					//31 문자열에 숫자를 더함
		System.out.println((char)(3+'0'));			//3 숫자를 문자로 반환
		System.out.println("=====");
		
		//18. 사칙연산자
		int a = 10;
		int b = 4;
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		System.out.printf("%d - %d = %d\n", a, b, a-b);
		System.out.printf("%d * %d = %d\n", a, b, a*b);
		System.out.printf("%d / %d = %d\n", a, b, a/b);	//int형: 소수점이하는 버려진다.
		System.out.printf("%d / %f = %f\n", a, (float)b, a / (float)b); //%d: 정수형., %f: 실수형.000000
		System.out.println("=====");
		
		//18. 자동형변환
		byte a1 = 10;
		byte a2 = 30;
		byte a3 = (byte)(a1 + a2);
		System.out.println(a3);
		System.out.println("=====");
		
		int a4 = 1_000_000;
		int a5 = 2_000_000;
		long a6 = a4 * a5;
		long a7 = (long)a4*a5;
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6); //결과값이 이미 int형
		System.out.println(a7);
		System.out.println("=====");
		
		long a8 = 1_000_000 * 1_000_000;
		long a9 = 1_000_000 * 1_000_000L;
		System.out.println(a8);
		System.out.println(a9);
		System.out.println("=====");

		//나머지 연산자
		int x = 10;
		int y = 8;
		System.out.printf("%d을 %d로 나누면 몫은 %d이고, 나머지는 %d입니다.\n", x, y, x/y, x%y);
		
		//문자열 비교
		String str1 = "abc";
		String str2 = new String("abc");
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
		System.out.printf("\"abc\"==str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str1.equalsIgnoreCase(\"ABC\") ? %b%n", str1.equalsIgnoreCase("ABC")); //equalsIgnoreCase" 대소문자 구분x
		System.out.println("=====");
		
		//논리연산자
		/*
		 * Scanner scanner = new Scanner(System.in); char ch = ' ';
		 * System.out.print("문자를 하나 입력하세요:");
		 * 
		 * String input = scanner.nextLine(); ch = input.charAt(0);
		 * 
		 * if('0' <= ch && ch <= '9') { System.out.println("입력하신 문자는 숫자입니다."); }else if
		 * (('a' <= ch && ch <= 'z') || ('A'<=ch && ch<='Z')){
		 * System.out.println("입력하신 문자는 영어입니다."); }else {
		 * System.out.println("입력하신 문자는 숫자도 영어도 아닙니다."); } scanner.close();
		 */
		System.out.println("=====");
		
		//조건식
		int b1 = 10;
		int b2 = -10;
		int absX = b1>=0 ? b1 : -b1;
		int absY = b2<=0 ? -b2 : b2;
		System.out.println(absX);
		System.out.println(absY);
		System.out.println("=====");
		
		System.out.println(x=3);
		
		int a10 = 465;
		System.out.println(a10-(a10%100));
	}
}

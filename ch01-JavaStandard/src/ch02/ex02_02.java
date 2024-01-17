package ch02;

import java.util.Scanner;

public class ex02_02 {
	public static void main(String args[]) {
		//두 변수의 값 바꾸기
		int x = 20;
		int y = 30;
		
		int tem;
		tem = x;
		x = y;
		y = tem;
		System.out.println("int x: " + x);
		System.out.println("int y: " + y);
		System.out.println("==========");
		
		//printf를 이용한 출력
		String url = "www.naver.com";
		float f1 = .10f;
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.23456789;
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		System.out.printf("d=%f%n", d);
		System.out.printf("d=%14.10f%n", d); //전체 14자리 중 소수점 10자리
		System.out.printf("[%.9s]%n", url); //왼쪽에서 9글자 출력
		System.out.println("==========");
		
		//화면으로부터 입력받기
		Scanner scanner = new Scanner(System.in);
		System.out.printf("두자리 정수를 하나 입력해주세요: ");
		String input = scanner.nextLine(); //String -> nextLine, int -> nextInt
		int num = Integer.parseInt(input);
		
		System.out.println("입력내용: " + input);
		System.out.printf("num: %d%n", num);
		scanner.close();
	}
}

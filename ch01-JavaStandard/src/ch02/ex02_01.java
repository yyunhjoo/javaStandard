package ch02;

public class ex02_01 {

	public static void main(String[] args) {
		System.out.println("Hello, Hyunjong");
		System.out.println("==========");

		System.out.println("3+5");
		System.out.println(3+5);
		System.out.println("==========");
		
		int x = 100;
		double pi = 3.14;
		char ch = 'a';
		String str = "abc";
		
		System.out.println(x);
		System.out.println(pi);
		System.out.println(ch);
		System.out.println(str);
		System.out.println("==========");
		
		final int MAX_VALUE;
		MAX_VALUE = 100;
		//MAX_VALUE = 200;
		//상수는 변수와 마찬가지로 '값을 저장할 수 있는 공간'이지만 변수와 달리 한번 값을 저장하면 다른값으로 변경할 수 없다.
		System.out.println(MAX_VALUE);
		System.out.println("==========");
		
		float numf = 3.14f; //f or F: 생략불가
		double numd = 1.618d; //d or D: 생략가능
		System.out.println(numf);
		System.out.println(numd);
		
		String str1 = "";
		//char ch1 = ''; //''안에 반드시 문자 하나가 필요
		char ch2 = ' '; //공백 (blank)로 변수 ch 초기화
		System.out.println(str1);
		System.out.println(ch2);
		System.out.println("==========");
		
		String name = "Ja" + "va";
		String str2 = name + 8.0;
		System.out.println(name);
		System.out.println(str2);
		System.out.println(7+" "); //7_
		System.out.println(" "+7); //_7
		System.out.println(7+""); //7
		System.out.println(""+7); //7
		System.out.println(""+""); //
		System.out.println(7+7+""); //14
		System.out.println(""+7+7); //77
		System.out.println("==========");
		
		
		
	}

}

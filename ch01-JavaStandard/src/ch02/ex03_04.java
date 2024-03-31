package ch02;

public class ex03_04 {

	public static void main(String[] args) {
		int apple = 123;
		int bucket = 10;
		int count = (apple/bucket) + (apple%bucket > 0 ? 1 : 0);
		System.out.println(count); //13
		
		int num = 0;
		System.out.println(num>0 ? "양수" : (num==0 ? 0 : "음수"));
		
		int fahrenheit = 100;
		float celcius =(float)5/9*((float)fahrenheit-32);
		System.out.println("fahrenheit:"+fahrenheit);
		System.out.println("celcius:"+celcius);
	}

}

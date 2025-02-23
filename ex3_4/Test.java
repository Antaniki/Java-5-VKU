package ex3_4;

public class Test {
	public static void main(String[] args) {
//		MyTime t1 = new MyTime(61, 34, 12);
		MyTime t2 = new MyTime(0, 59, 59);
		MyTime t3 = new MyTime();
		System.out.println(t2);
		System.out.println(t2.nextHour());
		System.out.println(t2.nextMinute());
		System.out.println(t2.nextSecond());
		System.out.println(t2.previousHour());
		System.out.println(t2.previousHour());
		System.out.println(t2.previousSecond());
	}
}

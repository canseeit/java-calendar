package calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 수를 입력하세요.");
		
		int a,b;
		String s1, s2;
		
		s1 = scanner.next();
		s2 = scanner.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
//		System.out.println(a + "," + b);
//		System.out.println("두 수의 합은 : " + (a+b));
		System.out.printf("%d와 %d의 합은 %d 입니다.", a, b, a + b );
		scanner.close();
		
	}

}

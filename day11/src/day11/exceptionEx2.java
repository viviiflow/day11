package day11;

import java.util.Scanner;

public class exceptionEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("[나눗셈]숫자1 입력:");
		int num1 = sc.nextInt();
		System.out.println("[나눗셈]숫자2 입력:");
		int num2 = sc.nextInt();

		if (num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
		} else {
			System.out.println(num1 / num2);
		}
		System.out.println("------------------------------");

		try {
			System.out.println(num1 / num2);
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} finally {
			System.out.println("무조건 실행할 문장을 적는다");
		}

		// ex2
		int x = 10;
		int y = 0;
		if (y != 0) {
			System.out.println(x / y);
		} else {
			System.out.println("0으로 못 나눔");
		}
		// ----------------------------------
		try {
			System.out.println(x / y);
		} catch (Exception e) {
			System.out.println("0으로 못 나눔");
		}

	}
}

package day11;

import java.util.Scanner;

public class exceptionEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("[������]����1 �Է�:");
		int num1 = sc.nextInt();
		System.out.println("[������]����2 �Է�:");
		int num2 = sc.nextInt();

		if (num2 == 0) {
			System.out.println("0���� ���� �� �����ϴ�.");
		} else {
			System.out.println(num1 / num2);
		}
		System.out.println("------------------------------");

		try {
			System.out.println(num1 / num2);
		} catch (Exception e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		} finally {
			System.out.println("������ ������ ������ ���´�");
		}

		// ex2
		int x = 10;
		int y = 0;
		if (y != 0) {
			System.out.println(x / y);
		} else {
			System.out.println("0���� �� ����");
		}
		// ----------------------------------
		try {
			System.out.println(x / y);
		} catch (Exception e) {
			System.out.println("0���� �� ����");
		}

	}
}

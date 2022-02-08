package day11;

import java.util.Scanner;

public class next {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력");
		String name = sc.nextLine();
		System.out.println(name);

		System.out.println();
		System.out.println("이름 입력");
		name = sc.next();
		System.out.println(name);
	}
}

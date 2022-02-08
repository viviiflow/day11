package day11;

import java.util.Scanner;

public class animal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "코끼리";
		System.out.println("동물 이름을 입력하세요: ");
		String tpname = sc.next();
		if (name.compareTo(tpname) == 0) {
			System.out.println("일치");
		} else {
			System.out.println("불일치");
		}
	}
}

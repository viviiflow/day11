package day11;

import java.util.Scanner;

public class animal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "�ڳ���";
		System.out.println("���� �̸��� �Է��ϼ���: ");
		String tpname = sc.next();
		if (name.compareTo(tpname) == 0) {
			System.out.println("��ġ");
		} else {
			System.out.println("����ġ");
		}
	}
}

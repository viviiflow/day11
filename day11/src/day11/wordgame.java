package day11;

import java.util.Scanner;

public class wordgame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String start = "������";

		while (true) {
			System.out.println("���þ� : " + start);
			System.out.println("�Է� : ");
			String word = sc.next();
			char a= start.charAt(start.length()-1);
			char b =word.charAt(0);
			if(Character.compare(a, b)==0) {
				start=word;
			}else {
				System.out.println("�����ձ� ����");
				break;
			}
		}
	}
}

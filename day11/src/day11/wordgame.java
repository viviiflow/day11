package day11;

import java.util.Scanner;

public class wordgame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String start = "자전거";

		while (true) {
			System.out.println("제시어 : " + start);
			System.out.println("입력 : ");
			String word = sc.next();
			char a= start.charAt(start.length()-1);
			char b =word.charAt(0);
			if(Character.compare(a, b)==0) {
				start=word;
			}else {
				System.out.println("끝말잇기 실패");
				break;
			}
		}
	}
}

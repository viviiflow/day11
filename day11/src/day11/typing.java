package day11;

import java.util.Scanner;
import java.util.Random;

public class typing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		String[] words = { "java", "masql", "jsp", "spring" };
		int i = 0;
		while (i < 1000) {
			int r = ran.nextInt(4);
			String temp = words[0];
			words[0] = words[r];
			words[r] = temp;
			i++;
		}
		for (int j = 0; j < 4;) {
			System.out.println("문제 : " + words[j]);
			System.out.println("입력 :");
			String tp = sc.next();
			if (words[j].equals(tp)) {
				j++;
			}
		}
		System.out.println("끝");
	}
}

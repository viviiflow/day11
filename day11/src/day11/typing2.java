package day11;
import java.util.Scanner;
import java.util.Random;

public class typing2 {
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
		
		for(i=0; i<4;) {
			StringBuffer sb = new StringBuffer(words[i]);
			int idx=ran.nextInt(words[i].length());
			sb.deleteCharAt(idx);
			sb.insert(idx, "*");
			System.out.println("문제 : " + sb);
			System.out.println("입력 :");
			String tp = sc.next();
			if (words[i].equals(tp)) {
				i++;
			}
		}
		System.out.println("종료");
		
	}
}

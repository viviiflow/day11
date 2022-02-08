package day11;

import java.util.Scanner;

public class changeword {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String text = "Life is too short.";
			System.out.println(text);
			System.out.println("변경하고 싶은 단어를 입력하세요 :");
			String word = sc.next();
			String[] arr = text.split(" ");
			int chk = -1;
			for (int i = 0; i < arr.length; i++) {
				if (word.equals(arr[i])) {
					chk = i;
				}
			}
			if (chk == -1) {
				System.out.println("해당 단어가 존재하지 않습니다.");
			} else {
				System.out.println("해당 단어가 있습니다.");
				System.out.println("무엇으로 바꾸시겠습니까?");
				String change = sc.next();
				arr[chk] = change;
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
				break;
			}
		}
	}
}

package day11;

import java.util.Scanner;

public class changeword {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String text = "Life is too short.";
			System.out.println(text);
			System.out.println("�����ϰ� ���� �ܾ �Է��ϼ��� :");
			String word = sc.next();
			String[] arr = text.split(" ");
			int chk = -1;
			for (int i = 0; i < arr.length; i++) {
				if (word.equals(arr[i])) {
					chk = i;
				}
			}
			if (chk == -1) {
				System.out.println("�ش� �ܾ �������� �ʽ��ϴ�.");
			} else {
				System.out.println("�ش� �ܾ �ֽ��ϴ�.");
				System.out.println("�������� �ٲٽðڽ��ϱ�?");
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

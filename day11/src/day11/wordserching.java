package day11;

import java.util.Scanner;

public class wordserching {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = "Life is too short.";
		System.out.println(text);
		System.out.println("검색할 단어를 입력하세요 :");
		String word = sc.next();
		String[] arr = text.split(" ");
		int chk=-1;
		for(int i=0; i<arr.length; i++) {
			if(word.equals(arr[i])) {
				chk=1;
			}
		}
		if(chk==1) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}

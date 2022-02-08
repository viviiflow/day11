package day11;

import java.util.Scanner;

public class StrNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] charnum= {'0','1','2','3','4','5','6','7','8','9'};
		while(true) {
			int cnt=0;
			System.out.println("입력: ");
			String tp=sc.next();
			if(tp.equals("종료")) {
				break;
			}
			int len=tp.length();
			for(int i=0; i<len; i++) {
				for(int j=0; j<10; j++) {
					if(charnum[j]==tp.charAt(i)) {
						cnt++;
					}
				}
			}
			if(cnt==len) {
				System.out.println("숫자만 있다.");
			}else if(cnt==0) {
				System.out.println("문자만 있다.");
			}else {
				System.out.println("문자와 숫자가 섞여있다.");
			}	
		}
		
	}
}

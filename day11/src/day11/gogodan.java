package day11;

import java.util.Scanner;
import java.util.Random;

public class gogodan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int[] ans = new int[5];
		int[] result = new int[5];
		int[] yes = null;
		int[] no = null;
		int yidx = 0, nidx = 0, cnt1 = 0, cnt2 = 0, n1 = 0, n2 = 0;

		for (int i = 0; i < 5; i++) {
			n1 = ran.nextInt(9) + 1;
			n2 = ran.nextInt(9) + 1;
			System.out.println(n1 + " x " + n2 + " =");
			System.out.println("정답이 무엇인가?");
			result[i] = sc.nextInt();
			if ((n1 * n2) == result[i]) {
				System.out.println("정답!");
				ans[i] = 1;
				yidx++;
			} else {
				System.out.println("떙!");
				ans[i] = -1;
				nidx++;
			}
		}
		yes = new int[yidx];
		no = new int[nidx];

		for (int i = 0; i < 5; i++) {
			if (ans[i] == 1) {
				yes[cnt1] = i;
				cnt1++;
			} else {
				no[cnt2] = i;
				cnt2++;
			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.print(ans[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < yes.length; i++) {
			System.out.print(yes[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < no.length; i++) {
			System.out.print(no[i] + " ");
		}

	}
}

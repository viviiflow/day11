package day11;

public class Stringscore {
	public static void main(String[] args) {
		String str = "11/100/89";

		// ���� 1) arr �迭�� �� ������ �����ϰ�, ���� ���
		int[] arr = new int[3];
		String[] temp = str.split("/");
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(temp[i]);
			sum += arr[i];

		}
		System.out.println(sum);
		
		//���� 2) scores �迭�� �� ������ �����ø� �����ڷ� �ϳ��� ���ڿ��� ����
		int[]scores = {11,100,89};
		String text="";
		for(int i=0; i<3; i++) {
			text+=scores[i];
			System.out.println(text);
			text+="/";
		}
	}
}

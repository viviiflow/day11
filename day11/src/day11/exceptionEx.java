package day11;

public class exceptionEx {
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		try {
			arr[0]=10;
			arr[7]=3;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �ʰ�");
		}
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]+"  ");
		}
		
		int num = 10;
		try {
			System.out.println(num/0);
		}
		catch (Exception e) {
			System.out.println("���� �� �����ϴ�.");
		}
			System.out.println("����");
		
	}
}

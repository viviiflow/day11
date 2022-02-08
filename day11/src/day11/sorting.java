package day11;

public class sorting {
	public static void main(String[] args) {
		String[][] jang = { { "Ã¶¼ö", "±è¹ä" }, { "¿µÈñ", "°¨" }, { "Ã¶¼ö", "»ç°ú" }, { "¿µÈñ", "»ç°ú" }, { "¿µÈñ", "±è¹ä" } };
		String temp = "";

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				int res = jang[i][0].compareTo(jang[j][0]);
				if ((res > 0) && (i < j)) {
					temp = jang[i][0];
					jang[i][0] = jang[j][0];
					jang[j][0] = temp;
				}
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				int res = jang[i][1].compareTo(jang[j][1]);
				int name = jang[i][0].compareTo(jang[j][0]);
				if ((res > 0) && (i < j) && (name == 0)) {
					temp = jang[i][1];
					jang[i][1] = jang[j][1];
					jang[j][1] = temp;
				}
			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.print(jang[i][0] + " : " + jang[i][1]);
			System.out.println();
		}

	}
}

package by.htp.array.main;

public class Task2 {

	public static void main(String[] args) {
		// 2. В целочисленной последовательности есть нулевые элементы. Создать массив
		// из номеров этих элементов.

		int[] mas = { 255, -1, 0, 9, 0, 2, 0, 0, 1, 0 };
		int temp = 0;
		int[] newMas = new int[mas.length];
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				newMas[temp] = i;
				temp++;
			}
		}
		int[] mas2 = new int[temp];
		System.arraycopy(newMas, 0, mas2, 0, temp);
		for (int j = 0; j < mas2.length; j++) {
			System.out.print(mas2[j] + " ");
		}

	}

}

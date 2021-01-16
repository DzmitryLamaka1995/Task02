package by.htp.array.main;

import java.util.Random;

public class Task6 {

	public static void main(String[] args) {
		// 6. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все
		// ее члены, большие данного Z, этим числом.
		// Подсчитать количество замен
		
		int[] mas = new int[10];
		createMas(mas);
		System.out.println("Созданный массив :");
		printMas(mas);
		System.out.println();
		int z = 66;
		System.out.println("Z = " + z);
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > z) {
				mas[i] = z;
			}

		}
		System.out.println("Итог:");
		printMas(mas);

	}

	public static void createMas(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
		}
	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");

		}
	}

}

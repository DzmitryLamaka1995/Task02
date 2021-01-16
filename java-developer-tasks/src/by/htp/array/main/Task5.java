package by.htp.array.main;

import java.util.Random;

public class Task5 {

	public static void main(String[] args) {
		// 5. Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину
		// числовой оси, содержащую все эти числа.

		int[] mas = new int[10];
		createMas(mas);
		System.out.println("Созданный массив :");
		printMas(mas);
		int min = mas[0];
		int max = mas[0];
		for (int i = 1; i < mas.length; i++) {
			if (min > mas[i]) {
				min = mas[i];
			} else if (max < mas[i]) {
				max = mas[i];
			}

		}
		System.out.println();
		System.out.println("Наименьшая длина числовой оси : от " + min + " до " + max);
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

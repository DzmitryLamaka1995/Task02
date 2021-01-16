package by.htp.array.main;

import java.util.Random;

public class Task4 {

	public static void main(String[] args) {
		// 4. Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив
		// из четных чисел этой последовательности.
		// Если таких чисел нет, то вывести сообщение об этом факте.

		int[] array = new int[10];
		int temp = 0;
		createMas(array);
		System.out.println("Созданный массив :");
		printMas(array);
		int[] arrayTemp = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				if (array[i] == 0) {
					continue;
				}
				arrayTemp[temp] = array[i];
				temp++;

			}
		}
		if (temp == 0) {
			System.out.println("В данном массиве нет четных чисел");
			return;
		}

		int[] arrayPos = new int[temp];
		System.arraycopy(arrayTemp, 0, arrayPos, 0, temp);
		System.out.println();
		System.out.println("Массив из четных чисел :");

		printMas(arrayPos);

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

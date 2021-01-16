package by.htp.array.main;

import java.util.Random;

public class Task8 {

	public static void main(String[] args) {
		// 8. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для
		// которых аi > i.

		int[] mas = new int[10];
		createMas(mas);
		System.out.println("Созданный массив :");
		printMas(mas);
		System.out.println();
		System.out.println("Итог: ");
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > i) {
				System.out.print(mas[i] + " ");
			}

		}

	}

	public static void createMas(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(10);
		}
	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");

		}
	}

}

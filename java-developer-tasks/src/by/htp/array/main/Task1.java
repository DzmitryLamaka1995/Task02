package by.htp.array.main;

import java.util.Random;

public class Task1 {

	public static void main(String[] args) {
		// 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов,
		// которые кратны данному К.

		int[] mas = new int[10];
		int sum = 0;
		int k = 2;
		newMas(mas);
		printMas(mas);
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % k == 0) {
				sum = sum + mas[i];
			}

		}
		System.out.println();
		System.out.println("Сумма чисел, которые делятся на 2 = " + sum);

	}

	public static void newMas(int[] mas) {
		Random rd = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rd.nextInt(100);

		}

	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");

		}
	}
}

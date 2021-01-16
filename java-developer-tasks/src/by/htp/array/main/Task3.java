package by.htp.array.main;

import java.util.Random;

public class Task3 {

	public static void main(String[] args) {
		// 3. Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить,
		// будет ли она возрастающей

		int[] mas = { 0, 2, 3, 4, 5, 7, 13, 25, 101, 118, 144, 187 };
		printMas(mas);
		checkMas(mas);
		int[] masRand = new int[5];
		newMas(masRand);
		printMas(masRand);
		checkMas(masRand);

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

	public static void checkMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < mas[i + 1]) {

				if (i == (mas.length - 2)) {
					System.out.println("Данный массив возрастающий");
					return;

				}
			}

			else {
				System.out.println("Данный массив не возрастающий");
				return;
			}

		}
	}

}

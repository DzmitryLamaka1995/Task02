package by.htp.array.main;

import java.util.Random;

public class Task10 {

	public static void main(String[] args) {
		/*10. Даны действительные числа a1, a2, … , a2n.
		Найти
		max(  a1 + a2n a2 + a2n−1  an + an+1)
		*/
		
		int[] mas = new int[10];
		createMas(mas);
		System.out.println("Созданный массив :");
		printMas(mas);
		int[] masSum = new int[mas.length / 2];
		for (int i = 0; i < masSum.length; i++) {
			masSum[i] = mas[i] + mas[((mas.length - 1) - i)];

		}
		System.out.println();
		System.out.println("Массив из сумм: ");
		printMas(masSum);
		int max = masSum[0];
		for (int i = 1; i < masSum.length; i++) {
			if (masSum[i] > max) {
				max = masSum[i];
			}

		}
		System.out.println();
		System.out.println("Максимальная сумма = " + max);

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

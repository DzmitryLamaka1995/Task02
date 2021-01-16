package by.htp.array.main;

public class Task9 {

	public static void main(String[] args) {
		// 9. Дан массив действительных чисел, размерность которого N. Подсчитать,
		// сколько в нем отрицательных,
		// положительных и нулевых элементов.
		
		int[] mas = { 1, 2, 0, -43, 0, -23, 13, 25, 165 };
		System.out.println("Созданный массив :");
		printMas(mas);
		int countNeg = 0;
		int countPos = 0;
		int countNull = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < 0) {
				countNeg++;
			} else if (mas[i] == 0) {
				countNull++;
			} else {
				countPos++;
			}

		}
		System.out.println();
		System.out.println("Кол-во положительных элементов в массиве = " + countPos);
		System.out.println("Кол-во отрицательных элементов в массиве = " + countNeg);
		System.out.println("Кол-во нулевых элементов в массиве = " + countNull);

	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");

		}

	}
}

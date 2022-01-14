package firstprogram;

public class bubbleSort2 {

	static void bubbleSortMethod(int[] a) {
		int length = a.length;

		for (int i = 0; i < length - 1; i++) {
			for (int j = 1; j < length - i; j++) {

				if (a[j - 1] > a[j]) {
					int temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}

		}
	}

	public static void main(String[] args) {
		int a[] = { 12, 79, 55, 29, 111 };
		bubbleSortMethod(a);
		for (int i = 0; i < a.length; i++)  {
			System.out.print(a[i] + " ");
		}
	}
}

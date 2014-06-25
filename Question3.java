public class Question3 {

	public static void main(String args[]) {
		int x[] = { 8, 6, 6, 20, 9, 1, 12, 16, 3, 16, 22, 2 };
		calculatePercentiles(x);
	}

	public static void calculatePercentiles(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			int start = i;
			if (i > 0) {
				while (i > 0 && arr[i] == arr[i - 1]) {
					count++;
					i++;
				}
			}
			double perc = ((start - 0) + (0.5 * count));
			perc = perc / (arr.length - 1);
			for (int k = 0; k < count + 1; k++)
				System.out.println((int) (perc * 100)
						+ "% of the numbers are less than or equal to "
						+ (start + k + 1));
			
			
		}
	}
}

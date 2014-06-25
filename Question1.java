public class Question1 {
	public static void printminMax(int[] points) {

	}

	public static void main(String[] args) {
		int[][] points = { { -1, 0 }, { 2, 2 }, { 1, 3 } };
		Question1 q = new Question1();
		Point p = q.new Point();
		p.printBounds(points);
	}

	class Point {
		int x, y;

		private void printBounds(int[][] points) {
			int minX = 0, minY = 0, maxX = 0, maxY = 0;
			for (int r = 0; r < points.length; r++) {
				int runningX = points[r][0];
				int runningY = points[r][1];
				if (minX > runningX) {
					minX = runningX;
				}
				if (minY > runningY) {
					minY = runningY;
				}

				if (maxX < runningX) {
					maxX = runningX;
				}
				if (maxY < runningY) {
					maxY = runningY;
				}
			}
			System.out.println("Bottom-left: (" + minX + "," + minY + ")");
			System.out.println("Top-right: (" + maxX + "," + maxY + ")");
		}

	}

}

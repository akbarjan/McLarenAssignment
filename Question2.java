import java.awt.Color;

public class Question2 {
	public static void main(String[] args) {
		String hex = toHex(68, 58, 197);
		System.out.println(hex);
	}

	public static String toHex(int r, int g, int b) {
		return "#" + toBrowserHexValue(r) + toBrowserHexValue(g)
				+ toBrowserHexValue(b);
	}

	private static String toBrowserHexValue(int number) {
		StringBuilder builder = new StringBuilder(
				Integer.toHexString(number & 0xff));
		while (builder.length() < 2) {
			builder.append("0");
		}
		return builder.toString().toUpperCase();
	}
}

import java.util.Scanner;

public class DCP35SquareNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numTestCases = scanner.nextInt();
		
		for (int i = 1; i <= numTestCases; i++) {
			int number = scanner.nextInt();
			int squareRootOfNumber = (int) Math.sqrt(number);
			if ((squareRootOfNumber * squareRootOfNumber) == number) {
				System.out.printf("Case %d: YES\n", i);
			} else {
				System.out.printf("Case %d: NO\n", i);
			}
		}
		scanner.close();
	}
}

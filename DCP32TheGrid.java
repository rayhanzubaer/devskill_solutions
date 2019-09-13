import java.util.Scanner;

public class DCP32TheGrid {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numTestCases = scanner.nextInt();
		
		for (int i = 1; i <= numTestCases; i++) {
			int x1 = scanner.nextInt();
			int y1 = scanner.nextInt();
			int x2 = scanner.nextInt();
			int y2 = scanner.nextInt();
			
			int minimumMovesRequired = Math.abs(x1 - x2) + Math.abs(y1 - y2);
			
			System.out.println(String.format("Case %d: %d", i, minimumMovesRequired));
		}
		scanner.close();
	}
}

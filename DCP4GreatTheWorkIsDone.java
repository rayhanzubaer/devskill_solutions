import java.util.Scanner;
class DCP4GreatTheWorkIsDone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			int ct = scanner.nextInt();
			int n = scanner.nextInt();
			int total = 0;
			for (int i = 0; i < n; i++) {
				total += scanner.nextInt();
			}

			int d = (int) Math.ceil((double) ct / (double) total);

			if (d == 1) {
				System.out.println("Project will finish within 1 day.");
			} else {
				System.out.println("Project will finish within " + d + " days.");
			}
		}
		scanner.close();
	}
}
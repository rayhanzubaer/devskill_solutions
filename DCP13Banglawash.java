import java.util.Scanner;

class DCP13Banglawash
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			int numberOfTestCases = scanner.nextInt();

			for (int i = 0; i < numberOfTestCases; i++) {
				int bangladeshFirstInningsFirstMatch = scanner.nextInt();
				int bangladeshSecondInningsFirstMatch = scanner.nextInt();
				int pakistanFirstInningsFirstMatch = scanner.nextInt();
				int pakistanSecondInningsFirstMatch = scanner.nextInt();
				
				int bangladeshFirstInningsSecondMatch = scanner.nextInt();
				int bangladeshSecondInningsSecondMatch = scanner.nextInt();
				int pakistanFirstInningsSecondMatch = scanner.nextInt();
				int pakistanSecondInningsSecondMatch = scanner.nextInt();

				int count = 0;

				if ((bangladeshFirstInningsFirstMatch + bangladeshSecondInningsFirstMatch) > 
							(pakistanFirstInningsFirstMatch + pakistanSecondInningsFirstMatch)) {
					count++;
				}

				if ((bangladeshFirstInningsSecondMatch + bangladeshSecondInningsSecondMatch) > 
							(pakistanFirstInningsSecondMatch + pakistanSecondInningsSecondMatch)) {
					count++;
				}

				if (count == 2) {
					System.out.println("Banglawash");
				} else {
					System.out.println("Miss");
				}
			}
		}
		scanner.close();
	}
}
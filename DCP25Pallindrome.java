import java.util.Scanner;

class DCP25Pallindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			int numberOfTestCases = scanner.nextInt();
		
			for (int i = 0; i < numberOfTestCases; i++) {
				String str = scanner.next();
				//scanner.next();
				str = str.toLowerCase();
				String reverseString = "";

				for (int j = str.length() - 1; j >= 0; j-- ) {
					reverseString += str.charAt(j);
				}
				

				if (reverseString.equals(str)) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		}
		scanner.close();
	}
}
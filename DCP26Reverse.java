import java.util.Scanner;

public class DCP26Reverse {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int numTestcases = Integer.parseInt(sc.nextLine());

			for (int i = 1; i <= numTestcases; i++) {
				String str = sc.nextLine();
				System.out.println(reverse(str));
			}
		}
		sc.close();
	}
	
	public static String reverse(String str) {
		int length = str.length() - 1;
		String reverse = "";
		
		for (int i = length; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		
		return reverse;
	}
}
/*
3
Reverse
eye
I am at home.
 */
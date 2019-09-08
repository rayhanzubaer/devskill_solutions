import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class DCP30CountIt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numTestCases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numTestCases; i++) {
			String str = sc.nextLine();
			Map<Character, Integer> map = new TreeMap<>();
			
			for (int index = 0; index < str.length(); index++) {
				char ch = str.charAt(index);
				if (map.containsKey(ch)) {
					int x = map.get(ch);
					x++;
					map.put(ch, x);
				} else {
					map.put(ch, 1);
				}
			}
			System.out.println("Case "+ (i + 1) +":");

			for (Map.Entry<Character, Integer> element : map.entrySet()) {
				System.out.println(element.getKey() + " " + element.getValue());
			}
		}
		sc.close();
	}
}


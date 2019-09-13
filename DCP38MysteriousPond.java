import java.util.Scanner;

public class DCP38MysteriousPond {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numTestCases = scanner.nextInt();
		
		for (int x = 0; x < numTestCases; x++) {
			int numFriends = scanner.nextInt();
			Friend[] friends = new Friend[numFriends];
			
			for (int i = 0; i < numFriends; i++) {
				String name = scanner.next();
				int minute = scanner.nextInt();
				friends[i] = new Friend(name, minute);
			}
			
			Friend first = friends[0];
			Friend last = friends[0];
			
			for (int i = 1; i < numFriends; i++) {
				if (first.minute < friends[i].minute) {
					first = friends[i];
				}
				if (last.minute > friends[i].minute) {
					last = friends[i];
				}
			}
			
			System.out.println(first.name + " " + last.name);
		}
		
		scanner.close();
	}
}

class Friend {
	String name;
	int minute;
	
	public Friend(String name, int minute) {
		this.name = name;
		this.minute = minute;
	}
}

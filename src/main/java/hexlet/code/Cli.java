package hexlet.code;

import java.util.Scanner;

class Cli {
	static String answer;
	public static String name() {
		Scanner scan = new Scanner(System.in);
		answer = scan.nextLine();
		return answer;
	}
}
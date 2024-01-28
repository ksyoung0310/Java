package Chapter04;

import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("1. easy game");
		System.out.println("2. hard game");
		System.out.println("3. exit");
		System.out.print("선택 >> ");
		int num = input.nextInt();
		
		if (num == 1) {
			System.out.println("easy game start!");
		}
		
		if (num == 2) {
			System.out.println("hard game start!");
		}
		
		if (num == 3) {
			System.out.println("exit!");
		}
		
		input.close();
	}

}
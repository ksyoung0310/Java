package Chapter04;

import java.util.Scanner;

public class EX08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("수 입력: ");
		int num1 = input.nextInt();
		System.out.print("수 입력: ");
		int num2 = input.nextInt();
		
		if (num1 > num2) {
			System.out.println("큰 수: " + num1);
		} else {
			System.out.println("큰 수: " + num2);
		}
		
		input.close();
	}

}
package Chapter04;

import java.util.Scanner;

public class EX11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("수 입력: ");
		int num1 = input.nextInt();
		System.out.print("수 입력: ");
		int num2 = input.nextInt();
		System.out.print("수 입력: ");
		int num3 = input.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("큰 수: " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("큰 수: " + num2);
		} else {
			System.out.println("큰 수: " + num3);
		}
		input.close();
	}

}
package Chapter04;

import java.util.Scanner;

public class EX10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("수 입력: ");
		int num1 = input.nextInt();
		System.out.print("수 입력: ");
		int num2 = input.nextInt();
		
		if (num1 > num2 && num1 % 2 == 0) {
			System.out.println(num1 + "큰 수 이며, 짝수");
		}
		
		if (num2 > num1 && num2 % 2 == 0) {
			System.out.println(num2 + "큰 수 이며, 짝수");
		}
		
		input.close();
	}

}
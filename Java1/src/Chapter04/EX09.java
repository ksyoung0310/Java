package Chapter04;

import java.util.Scanner;

public class EX09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("수 입력: ");
		int num1 = input.nextInt();
		System.out.print("수 입력: ");
		int num2 = input.nextInt();
		System.out.print("수 입력: ");
		int num3 = input.nextInt();
		
		// 1번
//		if (num1 > num2 && num1 > num3) {
//			System.out.println("큰 수: " + num1);
//		} if (num2 > num1 && num2 > num3) {
//			System.out.println("큰 수: " + num2);
//		} else {
//			System.out.println("큰 수: " + num3);
//		}
//		input.close();
		
		// 1,2,3 > OK(num3)
		// 1,3,2 > OK(num2)
		// 3,1,2 > NOT OK(num1)
		
		// 2번
		if (num1 > num2 && num1 > num3) {
			System.out.println("큰 수: " + num1);
		} if (num2 > num1 && num2 > num3) {
			System.out.println("큰 수: " + num2);
		} if (num3 > num1 && num3 > num2) {
			System.out.println("큰 수: " + num3);
		}
		input.close();
		
		
		// 3번
//		if (num1 > num2 && num1 > num3) {
//			System.out.println("큰 수: " + num1);
//		} else {
//			if (num2 > num1 && num2 > num3) {
//				System.out.println("큰 수: " + num2);
//			} else {
//				System.out.println("큰 수: " + num3);
//			}
//		}
//		input.close();
	}

}
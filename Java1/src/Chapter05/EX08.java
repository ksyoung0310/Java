package Chapter05;

import java.util.Scanner;

public class EX08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int iSum = 0;
		System.out.print("수 입력: ");
		int num1 = input.nextInt();
		System.out.print("수 입력: ");
		int num2 = input.nextInt();
		
		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				iSum += i;
			}
		} else if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				iSum += i;
			}
		} else {
			System.out.println("두 수는 같습니다.");
		}
		
		System.out.println("합: " + iSum);
		input.close();
	}

}
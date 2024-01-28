package Chapter04;

import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1000000
		// 1000001
		// 1000002
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("수입력: ");
		int num = input.nextInt();
		int lastNum = num % 10;
		System.out.println(lastNum);
		
		// 짝수
		if (lastNum == 0) {
			System.out.println(num + "은 짝수 입니다.");
		}
		if (lastNum == 2) {
			System.out.println(num + "은 짝수 입니다.");
		}
		if (lastNum == 4) {
			System.out.println(num + "은 짝수 입니다.");
		}
		if (lastNum == 6) {
			System.out.println(num + "은 짝수 입니다.");
		}
		if (lastNum == 8) {
			System.out.println(num + "은 짝수 입니다.");
		}
		// 홀수
		if (lastNum == 1) {
			System.out.println(num + "은 홀수 입니다.");
		}
		if (lastNum == 3) {
			System.out.println(num + "은 홀수 입니다.");
		}
		if (lastNum == 5) {
			System.out.println(num + "은 홀수 입니다.");
		}
		if (lastNum == 7) {
			System.out.println(num + "은 홀수 입니다.");
		}
		if (lastNum == 9) {
			System.out.println(num + "은 홀수 입니다.");
		}
		input.close();
	}

}
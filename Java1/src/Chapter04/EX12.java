package Chapter04;

import java.util.Scanner;

public class EX12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("월 입력: ");
		int month = input.nextInt();
		
		if (3 <= month && month <= 5) {
			System.out.println(month + "월은 봄 입니다.");
		} else if (6 <= month && month <= 8) {
			System.out.println(month + "월은 여름 입니다.");
		} else if (9 <= month && month <= 11) {
			System.out.println(month + "월은 가을 입니다.");
		} else if (12 == month || 1 == month || 2 == month) {
			System.out.println("겨울 입니다.");
		} else {
			System.out.println("잘 못 입력하셨습니다.");
		}
		input.close();
	}

}
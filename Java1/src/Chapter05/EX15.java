package Chapter05;

import java.util.Scanner;

public class EX15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("10보다 작은 정수 입력: ");
			int num = input.nextInt();
			
			if (num <= 10) {
				System.out.println(num + " 입니다.");
				break;
			} else {
				System.out.println("다시 입력해주세요!");
				continue;
			}
		}
		input.close();
	}

}
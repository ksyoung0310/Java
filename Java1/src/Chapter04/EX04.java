package Chapter04;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 연산자 사용 하여 짝수 홀수 구분
		Scanner input = new Scanner(System.in);
		
		System.out.print("수입력: ");
		int num = input.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num + "은 짝수 입니다.");
		}
		
		if (num % 2 == 1) {
			System.out.println(num + "은 홀수 입니다.");
		}
		input.close();
	}

}
package Chapter05;

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num, evenSum = 0, oddSum = 0;
		System.out.print("수 입력: ");
		num = input.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
		}
		System.out.println("짝수 합: " + evenSum + "\t" + "홀수 합: " + oddSum);
		input.close();
	}

}
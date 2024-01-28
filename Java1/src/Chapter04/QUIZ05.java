package Chapter04;

import java.util.Scanner;

public class QUIZ05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요: ");
		
		int year = input.nextInt();
		
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " 년은 윤년 입니다.");
				} 
				else {
					System.out.println(year + "년은 평년 입니다.");
				}
			} 
			else {
				System.out.println(year + " 년은 윤년 입니다.");
			}
		} 
		else {
			System.out.println(year + "년은 평년 입니다.");
		}
		
	input.close();
	}

}

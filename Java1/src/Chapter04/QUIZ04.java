package Chapter04;
import java.util.Scanner;

public class QUIZ04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("년도를 입력하세요 >> ");
		int year = input.nextInt();
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + "은 윤년입니다.");
        } 
		else if (year % 4 == 0 && year % 100 == 0) {
            System.out.println(year + "은 윤년이 아닙니다.");
        }
		else {
            System.out.println(year + "은 윤년이 아닙니다.");
        }
		
	}	

}

package Chapter03;
import java.util.Scanner;

public class QUIZ02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("출생 년도 8자리 입력: ");
		int year = scanner.nextInt();
		int y = year / 10000;
		int m = year % 10000 / 100;
		int d = year % 100;
		System.out.println("년 : "+ y);
		System.out.println("월 : "+ m);
		System.out.println("일 : "+ d);
		
		scanner.close();
	}

}

package Chapter03;
import java.util.Scanner;

public class QUIZ03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("출생 년도 8자리 입력: ");
		int year = scanner.nextInt();
		scanner.close();
		int y = year / 10000;
		int age = 2023 - y + 1;
		System.out.println("나이 : "+ age);
	}

}

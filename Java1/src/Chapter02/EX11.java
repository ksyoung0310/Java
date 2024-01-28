package Chapter02;

import java.util.Scanner;

public class EX11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력 > Scanner 사용
		Scanner scanner = new Scanner(System.in);
		String data;
		
		data = scanner.nextLine();
		System.out.println("저장 값: " + data);
		
		scanner.close();
	}

}

package Chapter04;

import java.util.Scanner;

public class EX13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("1 ~ 3 숫자를 입력하세요: ");
		int select = input.nextInt();
		
		switch(select) {
		case 1 : System.out.println("입력한 수: " + select);break;
		case 2 : System.out.println("입력한 수: " + select);break;
		case 3 : System.out.println("입력한 수: " + select);break;
		default : System.out.println("1~3 외 다른 수 입력");
		}
		input.close();
	}

}
package Chapter05;

public class EX07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("case1 : 3의 배수 이며, 5의 배수: " + i);
			}
		}
		System.out.println();
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				if (i % 5 == 0) {
				System.out.println("case1 : 3의 배수 이며, 5의 배수: " + i);
				}
			}
		}
	}

}
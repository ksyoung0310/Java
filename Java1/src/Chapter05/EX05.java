package Chapter05;

public class EX05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for + if
		for (int i = 1; i <= 25; i++) {
			System.out.print(i + "\t");
			if (i % 5 == 0) {
				System.out.println();
			}
		}
		
		// for + if - else
		for (int i = 1; i <= 25; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
			} else {
				System.out.print(i + "\t");
			}
		}
	}

}

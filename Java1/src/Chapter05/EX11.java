package Chapter05;

public class EX11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evenSum = 0, oddSum = 0;
		
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
		}
		
		System.out.println("짝수 합: " + evenSum + "홀수 합: " + oddSum);
	}

}
package Chapter06;
import java.util.StringTokenizer;

public class EX07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Java Study Hard";
		
		StringTokenizer st1 = new StringTokenizer(str1, " ");
		System.out.println(st1.countTokens());
		System.out.println(st1.nextToken());
		System.out.println(st1.nextToken());
		System.out.println(st1.nextToken());
		
		System.out.println();
		
		String str2 = "Java/Study/Easy";
		
		StringTokenizer st2 = new StringTokenizer(str2, "/");
		System.out.println(st2.countTokens());
		System.out.println(st2.nextToken());
		System.out.println(st2.nextToken());
		System.out.println(st2.nextToken());
	}

}

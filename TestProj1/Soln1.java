
import java.util.Scanner;

public class Soln1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner name = new Scanner(System.in);
		Scanner age = new Scanner(System.in);
		System.out.println("Please Enter candidates Name");
		String candname = name.nextLine();
		System.out.println("Please Enter candidates age");
		int candage	= age.nextInt();
		if (candage >=18) {
			System.out.println(candname + " is Eligible for voting");
		}
		else {
			System.out.println(candname+ "is Not-Eligible for voting");
		}
		
		
		}
	}

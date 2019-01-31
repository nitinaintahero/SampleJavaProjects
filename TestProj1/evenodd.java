
import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i = new Scanner(System.in);
		System.out.println("Please enter E/e for Even seris or O/o for odd series");
		Scanner ch = new Scanner(System.in);
		char cha = ch.next().charAt(0);
			
		if (cha == 'E' || cha == 'e') {
			System.out.println("Great! you have chosen an Even Series");			
			System.out.println("Where would you like your series to start from");
			int a = i.nextInt();
			if ((a % 2) == 0) {
			//a=+1;
			System.out.println("The required series is as below");
				for(int A = 0 ; A <= 9 ; A++ ) {
				System.out.println(a);
				a=a+2;
				}
			
			}
			
			else {
				    a=a+1;
				   // System.out.println("The required series starts from " +a);
				    System.out.println("The required series is as below");
					for(int A = 0 ; A < 9 ; A++ ) {
					System.out.println(a);
					a=a+2;
			}
			}
		}
	
		else if (cha == 'O' || cha == 'o') 
			{
			  System.out.println("Great! you have chosen an Odd Series");
			  System.out.println("Where would you like your series to start from");
			  int a = i.nextInt();
			  if ((a % 2) == 0) {
				a=a+1;
				System.out.println("The required series as below");
					for(int A = 0 ; A <= 9 ; A++ ) {
					System.out.println(a);	
					a=a+2;
					}
			  }
					else {
					    //a=a+1;
					    System.out.println("The required series starts from " +a);
					    System.out.println("The required series is as below");
						for(int A = 0 ; A < 9 ; A++ ) {
						System.out.println(a);
						a=a+2;
						
				}
			}
			}
				else {
					System.out.println("Abort! You have entered an Invalid Input");
					System.out.println("Please try again..");
				}
				}
				}
					    
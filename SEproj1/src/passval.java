
public class passval {

	void func1(int a) {
		System.out.println("print" +a);
		}
	
	void func1(int a, int b){
		
		System.out.println("print" +a +" " +b);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		passval obj1 = new passval();
		
		
		obj1.func1(10);
		obj1.func1(10, 30);
	}

}

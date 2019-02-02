
public class funcoverload {

	void func1(int a) {
		System.out.println("print" +a);
		}
	
	void func1(int a, int b){
		
		System.out.println("print" +a +" " +b);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		funcoverload obj1 = new funcoverload();
		
		
		obj1.func1(10);
		obj1.func1(10, 30);
	}

}

package constructors;
/*
 * constructor basics default constructor and parameter constructor
 */

public class ConstructorOne {
	
	 ConstructorOne()
	 {
		 System.out.println("from default constructor");
	 }
	 ConstructorOne(int i, int b){
		 this();//current class constructor
		 System.out.println( i + b);
	 }

	public static void main(String[] args) {
		
		ConstructorOne obj= new ConstructorOne(10,20);
		
	
		
		}

	

}

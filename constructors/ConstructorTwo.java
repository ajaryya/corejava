package constructors;
/*
 * program for calling child to parent using default and parameterized constructor
 */

class Parent {
	Parent() {
       this(2,4);
		System.out.println("from default parent constructor");
	}

	public Parent(int x, int y) {
		
		System.out.println("from the parameterized parent constructor");

	}

}

public class ConstructorTwo extends Parent {

	ConstructorTwo() {
		this(2,3);

		System.out.println("from child default constructor");
	}

	public ConstructorTwo(int i, int j) {
		super();

		System.out.println("from child parameterized constructor");
	}

	public static void main(String[] args) {

		ConstructorTwo objOne = new ConstructorTwo();
		

	}

}

package Casting;

public class CastingOne {

	public static void main(String[] args) {
		byte myByteValue;
		int myIntValue=10;
		double myDoubleValue=120.23;
		
		myByteValue= (byte)myIntValue;
		System.out.println(myByteValue);
		
		myIntValue= (int)myDoubleValue;
		System.out.println(myDoubleValue+ " "+ myIntValue);
		
		myDoubleValue=(int)myIntValue;
		System.out.println(myDoubleValue);
		
		

	}

}

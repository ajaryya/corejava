package basicProgramme;

public class Increment {

	public static void main(String[] args) {
		int i=25;
		System.out.println(i++);//25--26
		System.out.println(++i);//27
		
		int j=46;
		System.out.println(++j);//47
		System.out.println(j++);//47--48
		i=j;
		System.out.println(i); //47
		System.out.println(++i);//48 
		System.out.println(j++);//47--48
		System.out.println(i++);//48--49
		System.out.println(++j);//49
		
	}

}

25
27
47
47
48
49
48
49
50

package conditionalstatements;

public class Conditionalstatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=30;
		
		if(a>b)
		{
			System.out.println("A is greater than B");
		}
		else {
			System.out.println("A is less than or equal to B");
		}
		if(a>b)
		{
			System.out.println("A is greater than B");
		}
		else if(a>c) {
			System.out.println("A is greater than C");
		}
		else
			System.out.println("A is smallest or equal to other 2");
		
	}

}

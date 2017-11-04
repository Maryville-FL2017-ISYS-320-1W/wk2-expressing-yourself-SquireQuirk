/*
  	ISYS 320
  	Name(s): Patrick Quirk
  	Date: 11/4/17
*/

/*
 	Your predicted values for variables a, b, and c
	a => 6
	b => 9
	c => 15
 
 	After testing the statements in the main method, indicate above if your predictions were correct.

	C was 16 because the c = b assignment was made before b was changed through b-1.
*/

public class ReAssignment {

	public static void main(String[] args) {
		int a = 5; 
	        int b = 10; 
	        int c = b;
	        a = a + 1; 
	        b = b - 1; 
	        c = c + a;
	        b = c % a;
	        System.out.println(a);

	        System.out.println(b);

	        System.out.println(c);
	}

}

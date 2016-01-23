import com.rhairy.util.Input;

public class Test
{
	public static void main( String [] args )
	{
		int myInt = 0;
		
		myInt = Input.getIntRepeat("Please enter an intger: ", "Invalid Input." );
		myInt = Input.getIntRepeat("Please enter a number: ", "Nope." );
	}
}
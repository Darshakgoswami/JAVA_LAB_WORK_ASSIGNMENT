package basic;

class MyException extends Exception
{
	public MyException(String string)
	{
		super(string);
	}
}

public class Custom_Exception {
	
	int i=-10;
	void display() throws MyException
	{
		if(i>0)
		{
			System.out.println("Positive Number : "+i);
		}
		else
		{
			throw new MyException("Negative Number : "+i);
		}
	}

	public static void main(String[] args) throws MyException {
		Custom_Exception obj = new Custom_Exception();
		obj.display();
	}

}
package lab4_pqueue;

public class EmptyQueueException extends ArrayIndexOutOfBoundsException
{
	public EmptyQueueException()
	{
		super("Ures a sor!");
	}
	
	public EmptyQueueException(String error)
	{
		super(error);
	}
	
	public EmptyQueueException(int i)
	{
		super(i);
	}
}

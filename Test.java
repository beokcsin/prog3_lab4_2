package lab4_pqueue;

public class Test 
{
	public static void main(String[] args)
	{
		PQueue<String> q = new PQueue<>();
		q.push("alma");
		q.push("barack");
		q.push("korte");
		
		for(String s: q)
		{
			System.out.println(s);
		}
		
		System.out.println(q.size());
		System.out.println(q.top());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		
		PQueue<Integer> s = new PQueue<Integer>();
		s.push(1); 
		s.push(2); 
		s.push(3); 
		s.push(4);
		for (Integer i : s) 
		{
			System.out.println(i);
		}
		
	}
}

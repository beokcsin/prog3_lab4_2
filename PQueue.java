package lab4_pqueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class PQueue <T extends Comparable> implements Iterable<T>
{
	private ArrayList<T> f = null;
	
	
	public PQueue()
	{
		f = new ArrayList<>();
	}
	
	public int size()
	{
		return f.size();
	}
	
	void push(T t)
	{
		f.add(t);
	}
	
	T top()
	{
		if(size() < 1)
			throw new EmptyQueueException("Niincsen elem a listaban");
		return (T) Collections.max(f);
	}
	
	T pop()
	{
		T top = this.top();
		f.remove(top);
		return top;
	}
	
	void clear()
	{
		f.clear();
	}
	
	public Iterator<T> iterator()
	{
		Collections.sort(f, new ReverseComparator<T>());
		return f.iterator();
	}
}

package lab4_pqueue;

import java.util.Comparator;

public class ReverseComparator<T extends Comparable> implements Comparator<T>
{
	public int compare(T t, T t1)
	{
		return -1 * t.compareTo(t1);
	}
}

import java.io.IOException;
import java.lang.IndexOutOfBoundsException;
import java.util.AbstractList; 
import java.util.List;
import java.util.Collection;
import java.util.Iterator;

//mutable List of constant size
public class CollectionArrayList<E> extends AbstractList<E> 
  implements List<E>
{
  private int DEFAULTSIZE = 0;
  
  private E[] data;
  
  private int size;
  
  public CollectionArrayList() {
    data = (E[]) new Object[DEFAULTSIZE];
    size = DEFAULTSIZE;
  }
  
  public CollectionArrayList(int newSize) {
    data = (E[]) new Object[newSize];
    size = newSize;
  }
  
  public CollectionArrayList(Collection<? extends E> c) {
    this(c.size());
    Iterator<? extends E> itr = c.iterator();
    for (int index = 0; index < size; index++) {
      data[index] = itr.next();
    }
  }
  
  @Override
  public E get(int index) throws IndexOutOfBoundsException {
    if (index < size)
      return data[index];
    else 
    throw new IndexOutOfBoundsException();
  }
  
  @Override
  public int size() {
    return size;
  }
  
  @Override
  public E set(int index, E element) throws IndexOutOfBoundsException{
      if (index < size) {
	E tmp = data[index];
	data[index] = element;
	return tmp;
      } else 
	throw new IndexOutOfBoundsException();
  }


}
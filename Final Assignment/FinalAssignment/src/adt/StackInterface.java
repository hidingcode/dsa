// Lim Yong Chien
package adt;

import java.util.Iterator;

public interface StackInterface<T> {
  public boolean push(T newEntry);
  public boolean pop();
  public T peek();
  public boolean isEmpty();
  public void clear();
  public boolean match(T anEntry);
  public Iterator<T> getIterator();
}

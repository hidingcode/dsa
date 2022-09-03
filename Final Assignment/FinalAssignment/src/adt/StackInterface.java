package adt;

public interface StackInterface<T> {

  public boolean push(T newEntry);
  public boolean pop();
  public T peek();
  public boolean isEmpty();
  public void clear();
}

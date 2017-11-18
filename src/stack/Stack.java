package stack;

import java.util.Iterator;

import nodo.node;

public class Stack<T> implements iStack<T>, Iterable<T> {
	
	private node<T> start=null, end=null;
	private int top = -1;
	private int count = 0;
	private int tamaño;
	
	public Stack(int i){
		
		tamaño=i;
		start = new node<T>();
		end = new node<T>();
		
		start.setIndex(-1);
		end.setIndex(-1);
		
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			node<T> tmp = start;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				tmp = tmp.getNext();
				return (tmp != null)?true:false;
			}
			@Override
			public T next() {
				// TODO Auto-generated method stub
				return tmp.getValue();
			}
		};
	}

	@Override
	public T pop() throws StackEmptyException {
		
		if(isEmpty()) throw new StackEmptyException("La pila esta vacia");
		
		T tmp = end.getBack().getValue(); 
		end.setBack(end.getBack().getBack());
		
		count--;
		return tmp;
		
		
	}

	@Override
	public void push(T value) throws StackFullException {
		if(isFull()) throw new StackFullException("La pila esta llena");
		node<T> tmp=end.getBack();
		end.setBack(new node<T>(value));
		
		if(tmp==null) {
			
			start.setNext(end.getBack());
			//end.getBack().setIndex(0);
		}else {
			end.getBack().setBack(tmp);
			tmp.setNext(end.getBack());
		}
		count++;
		
	}

	@Override
	public boolean isEmpty() {

		if (end.getBack()==null)
			return true;
		
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return (count == tamaño);
	}

	@Override
	public T peek() throws StackEmptyException {
		if(isEmpty()) throw new StackEmptyException("La pila esta vacia");
		return end.getBack().getValue();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public void clear() {
		start.setNext(null);
		end.setBack(null);
		count=0;
		
	}

	@Override
	public T search(T value) throws StackEmptyException {
		if(isEmpty()) throw new StackEmptyException("La pila esta vacia");
		
		node<T> tmp = end;
		
		while(tmp.getBack()!=null){
			
			tmp=tmp.getBack();
			
			if(tmp.getValue().equals(value))
				return tmp.getValue();
		}
		
		return null;
	}
	
	
	

	

}

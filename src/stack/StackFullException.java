package stack;

public class StackFullException extends Exception {
	 public StackFullException() {
		 
	 }
	
	public StackFullException(String causa) {
		super(causa);
	}
	
	public StackFullException(Throwable causa) {
		super (causa);
	}
}

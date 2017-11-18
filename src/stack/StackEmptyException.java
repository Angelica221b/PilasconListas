package stack;

public class StackEmptyException extends Exception {
	public StackEmptyException() {
		
	}
	
	public StackEmptyException(String causa) {
		super(causa);
	}
	
	public StackEmptyException(Throwable causa) {
		super (causa);
	}
}

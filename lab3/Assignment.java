package lab3;

public class Assignment extends Expression{
	 private Variable target;
	    private Expression source;
	    
	    public Assignment(Variable target, Expression term_main) {
	        this.target = target;
	        this.source = term_main;
	    }
	    
	    public String toString() {
	        return String.format("[target=%s, source=%s]", target, source);
	    }
}

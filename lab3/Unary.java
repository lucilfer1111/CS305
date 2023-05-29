package lab3;

public abstract class Unary extends Expression{
	    private Unary operator;
	    private Expression term;
	    
	    public Unary(Unary operator, Expression term) {
	        this.operator = operator;
	        this.term = term;
	    }
}

package lab3;

public class Binary extends Expression{
	private String op;
    private Expression term1;
    private Expression term2;
    
    public Binary(String op, Expression term1, Expression term2) {
        this.op = op;
        this.term1 = term1;
        this.term2 = term2;
    }
    
    public String toString() {
        return String.format("[op=\"%s\", term1=%s, term2=%s]", op, term1, term2);
    }

}

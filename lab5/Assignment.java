package lab5;

public class Assignment {
	 String target;
	    String source;

	    public Assignment(String target, String source) {
	        this.target = target;
	        this.source = source;
	    }

	    public String toString() {
	        return String.format("Assignment:\n  target: %s\n  source: %s", target, source);
	    }
}

package lab5;

public class Declaration {
	    String type;
	    String name;

	    public Declaration(String type, String name) {
	        this.type = type;
	        this.name = name;
	    }

	    public String toString() {
	        return String.format("type: %s, name=%s", type, name);
	    }
}

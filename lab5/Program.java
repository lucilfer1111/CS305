package lab5;

import java.util.ArrayList;
import java.util.List;
public class Program {
	    List<Declaration> declarations = new ArrayList<>();
	    List<Assignment> statements = new ArrayList<>();

	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        sb.append("Program:\n");
	        sb.append("Declarations:\n");
	        for (Declaration decl : declarations) {
	            sb.append(decl.toString()).append("\n");
	        }
	        sb.append("Statements:\n");
	        for (Assignment assign : statements) {
	            sb.append(assign.toString()).append("\n");
	        }
	        return sb.toString();
	    }
}

package bd1;
import java.util.List;

public class Main {
    
	public static void main(String[] args) {
		String input = "for (int i = i; i < 10; i++)";
		Lexer lexer = new Lexer();
		if (lexer.isValidForLoop(input)) {
		    Token token = lexer.analyze(input);
		    if (token != null && token.getType().equals("FOR")) {
		        List<Token> children = token.getChildren();
		        For forLoop = new For(children.get(0).toString(), children.get(1).toString(), children.get(2).toString());
		        System.out.println(forLoop);
		        System.out.println("true");
		    }
		} else {
	           System.out.println(input);
		       System.out.println("false");
		} 
    }

}

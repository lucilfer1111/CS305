package lab4;

import java.util.List;

public class Main {
	public static void main(String[] args) {
	    String input1 = "int main(){}";
	    String input2 = "int main){(}";

	    Lexer lexer1 = new Lexer(input1);
	    List<Token> tokens1 = lexer1.tokenize();
	    System.out.println(input1 + " " + lexer1.matchTokens(tokens1));

	    Lexer lexer2 = new Lexer(input2);
	    List<Token> tokens2 = lexer2.tokenize();
	    System.out.println(input2 + " " + lexer2.matchTokens(tokens2));
	}
}

                    
	
	 


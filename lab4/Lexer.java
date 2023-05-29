package lab4;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Lexer {
	  private final List<Token> tokens = new ArrayList<>();
	    private final String input;
	    private int currentPos = 0;

	    public Lexer(String input) {
	        this.input = input;
	    }

	    public List<Token> tokenize() {
	        while (currentPos < input.length()) {
	            char currentChar = input.charAt(currentPos);
	            if (Character.isWhitespace(currentChar)) {
	                currentPos++;
	                continue;
	            }
	            if (currentChar == '(') {
	                tokens.add(new Token(TokenType.LEFT_PARENT, "("));
	                currentPos++;
	                continue;
	            }
	            if (currentChar == ')') {
	                tokens.add(new Token(TokenType.RIGHT_PARENT, ")"));
	                currentPos++;
	                continue;
	            }
	            if (Character.isLetter(currentChar)) {
	                String identifier = readIdentifier();
	                if (identifier.equals("int") || identifier.equals("char") ||
	                        identifier.equals("float") || identifier.equals("double") ||
	                        identifier.equals("long")) {
	                    tokens.add(new Token(TokenType.TYPE, identifier));
	                } else {
	                    tokens.add(new Token(TokenType.IDENTIFIER, identifier));
	                }
	                continue;
	            }
	            if (currentChar == '{') {
	                tokens.add(new Token(TokenType.LEFT_BRACE, "{"));
	                currentPos++;
	                continue;
	            }
	            if (currentChar == '}') {
	                tokens.add(new Token(TokenType.RIGHT_BRACE, "}"));
	                currentPos++;
	                continue;
	            }
	            throw new RuntimeException("Invalid character: " + currentChar);
	        }
	        return tokens;
	    }

	    private String readIdentifier() {
	        int startPos = currentPos;
	        while (currentPos < input.length() && Character.isLetterOrDigit(input.charAt(currentPos))) {
	            currentPos++;
	        }
	        return input.substring(startPos, currentPos);
	    }

		public boolean matchTokens(List<Token> tokens1) {
			Stack<Token> stack = new Stack<>();
		    for (Token token : tokens) {
		        TokenType type = token.getType();
		        if (type == TokenType.LEFT_PARENT) {
		            stack.push(token);
		        } else if (type == TokenType.RIGHT_PARENT) {
		            if (stack.isEmpty() || stack.peek().getType() != TokenType.LEFT_PARENT) {
		                return false;
		            }
		            stack.pop();
		        }
		    }
		    return stack.isEmpty();
		}
}

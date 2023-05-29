package bd1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lexer {
	private static final String FOR_REGEX = "for\\s*\\(\\s*(.*);\\s*(.*);\\s*(.*)\\s*\\)";

    public Token analyze(String input) {
        Pattern pattern = Pattern.compile(FOR_REGEX);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            Token token = new Token("FOR");
            token.addChild(new Token(matcher.group(1).trim()));
            token.addChild(new Token(matcher.group(2).trim()));
            token.addChild(new Token(matcher.group(3).trim()));
            return token;
        }

        return null;
    }
    public boolean isValidForLoop(String input) {
        Pattern pattern = Pattern.compile(FOR_REGEX);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

}

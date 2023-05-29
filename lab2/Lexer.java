package lab2;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Lexer {
    private static final Pattern pattern = Pattern.compile("\\s*([A-Za-z]+|[0-9]+|\\+|-|\\*|/|\\(|\\))");
    // pattern object bolgon emhtgesn 
    public static ArrayList<Token> lex(String input) {
        ArrayList<Token> tokens = new ArrayList<Token>();
        Matcher matcher = pattern.matcher(input);//pattern d emhtegsn obj n matcher eer damjulj a-z 0-9 edr gdgin olno
        while (matcher.find()) {//matcher funts oltol dawtana
            String value = matcher.group(1);
            if (value.matches("[0-9]+")) {
                tokens.add(new Token(TokenType.NUMBER, value));
            } else if (value.matches("[A-Za-z]+")) {
                tokens.add(new Token(TokenType.IDENTIFIER, value));
            } else {
                tokens.add(new Token(TokenType.OPERATOR, value));
            }
        }
        return tokens;
    }
}
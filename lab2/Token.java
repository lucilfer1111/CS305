package lab2;
public class Token {

	private TokenType type;//tokentype -s type hvisagc uusgene
    private String value;

    public Token(TokenType type, String value) {//baiguulgc function 
        this.type = type;
        this.value = value;
    }

    public TokenType getType() {
        return type;
    }

    public String getValue() {
        return value;
    }
}
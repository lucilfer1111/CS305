package bd1;

import java.util.ArrayList;
import java.util.List;

class Token {
    private String type;
    private List<Token> children;

    public Token(String type) {
        this.type = type;
        this.children = new ArrayList<>();
    }

    public void addChild(Token child) {
        children.add(child);
    }

    public String getType() {
        return type;
    }

    public List<Token> getChildren() {
        return children;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(type).append(" ");

        for (Token child : children) {
            sb.append(child).append(" ");
        }

        return sb.toString().trim();
    }
}

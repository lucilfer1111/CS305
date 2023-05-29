package lab2;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        
        String input1 = "int x=2*5";
        ArrayList<Token> tokens1 = Lexer.lex(input1);
        int x = Integer.parseInt(tokens1.get(2).getValue()) * Integer.parseInt(tokens1.get(4).getValue());
        System.out.println("x=" + x);

        String input2 = "string s=\"hello\" + \"world\"";
        ArrayList<Token> tokens2 = Lexer.lex(input2);
        String s = tokens2.get(2).getValue() + tokens2.get(4).getValue();
        System.out.println("s=" + s);
    }
}

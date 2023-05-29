package lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.ArrayList;

public class lexer {
    String line;
    int counter = 0;
    ArrayList<token> tokens = new ArrayList<token>();
    public lexer(String line){
        this.line = line;
    }
    public ArrayList<token> parseLine(){
        while(counter<line.length()){
            char currentChar = line.charAt(counter);
            if(Character.isDigit(currentChar)){
                token t = lex_num(line.substring(counter));
                counter+=t.getConsumed();
                tokens.add(t);
            }
            else if(currentChar=='"' || currentChar=='\''){
                token t = lex_str(line.substring(counter));
                counter += t.getConsumed();
                tokens.add(t);
            }   
            else if(Character.isAlphabetic(currentChar)){
                token t = lex_id(line.substring(counter));
                counter +=t.getConsumed();
                tokens.add(t);
            }
            else if(currentChar=='('){
                token t = new token("Open_round_bracket","(",1);
                tokens.add(t);
                counter+=1;
            }
            else if(currentChar==')'){
                token t = new token("Close_round_bracket",")",1);
                tokens.add(t);
                counter+=1;
            }
            else if(currentChar=='{'){
                token t = new token("Open_curly_bracket","{",1);
                tokens.add(t);
                counter+=1;  
            }
            else if(currentChar=='}'){
                token t = new token("Close_curly_bracket","}",1);
                tokens.add(t);
                counter+=1;
            }
            else if(currentChar=='='){
                token t = new token("Assign","=",1);
                counter+=1;
                tokens.add(t);
            }
            else if(currentChar=='+'){
                token t = new token("Operation","+",1);
                tokens.add(t);
                counter+=1;
            }
            else if(currentChar=='-'){
                token t = new token("Operation","-",1);
                tokens.add(t);
                counter+=1;
            }
            else if(currentChar=='*'){
                token t = new token("Operation","*",1);
                tokens.add(t);
                counter+=1;
            }
            else if(currentChar=='/'){
                token t = new token("Operation","/",1);
                tokens.add(t);
                counter+=1;
            }
            else if(currentChar==';'){
                token t = new token("Semicolon",";",1);
                tokens.add(t);
                counter+=1;
            }
            else { 
                counter+=1;
            }
        }
        return tokens;
    }
    private token lex_num(String line){
        String num="";
        for(char c : line.toCharArray()){
            if(!Character.isDigit(c)){
                break;
            }
            else {
                num+=c;
            }
        }
        token t = new token("int", num ,num.length());
        return t;
    }
    private token lex_str(String line){
        char delimiter = line.charAt(0);
        String string = "";
        line = line.substring(1);
        for(char c : line.toCharArray()){
            if(c==delimiter){
                break;
            }
            string+=c;
        }
        token t = new token("String", string, string.length());
        return t;
    }
    private token lex_id(String line){
        String[] keywords = {"String","int","boolean","while","if","if","else","main"};
        String id="";
        for(char c : line.toCharArray()){
            if(!Character.isDigit(c) && !Character.isAlphabetic(c) || c==' ' || c=='=') {
                break;
            }
            else id+=c;
        }
        for (String keyword : keywords) {
            if (id.equals(keyword)) {
                token t = new token("keyword", id, id.length());
                return t;
            }
        }
        token t = new token("ID",id,id.length());
                return t;
    }
    
}
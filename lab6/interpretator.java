package lab6;

import java.util.ArrayList;


public class interpretator {
    String line;
    ArrayList<token> tokens;
    ArrayList<decleration1> dec = new ArrayList<decleration1>();
    int b;
    
    public interpretator(String line){
        this.line=line;
        lexer lexer = new lexer(line);
        tokens = lexer.parseLine();
    }
    
    private boolean match(String token_type, String type){
        if(token_type.equals(type)){
            return true;
        }
        else return false;
    }
    public  boolean evaluate(){
        boolean a = false;
        for(int i=0;i<tokens.size();i++){
            if(match("Open_round_bracket", tokens.get(i).getType())){
                for(int j=i; j<tokens.size();j++){
                    if(match("Close_round_bracket", tokens.get(j).getType())){
                        for(int k=j;k<tokens.size();k++){
                            if(match("Open_curly_bracket", tokens.get(k).getType())){
                                b = k;
                                for(int p=k; p<tokens.size();p++){
                                    if(match("Close_curly_bracket", tokens.get(p).getType())){
                                        a= true;
                                    }
                                }
                            }
                        }
                    }
                }

            }
        }
        return a;
    }
    public ArrayList<decleration1> declaration(){
        while(b<tokens.size()){
            if(tokens.get(b).getValue().equals("int")||tokens.get(b).getValue().equals("String")||tokens.get(b).getValue().equals("boolean")){
                Object type = tokens.get(b).getValue();
                b++;
                decleration1 decs = new decleration1(type, tokens.get(b).getValue());
                dec.add(decs);
            } else b++;
        }
        return dec;
    }
    public boolean V_decs(){
        for (int i=0 ;i < dec.size();i++){
            for(int j=i+1;j<dec.size();j++){
                if(dec.get(i).getName().equals(dec.get(j).getName())){
                    return false;
                }
            }
        }
        return true;
        
    }
    public Object  typeOf(Object value){
        for(int i=0; i<dec.size();i++){
            if(value.equals(dec.get(i).getName())){
                return dec.get(i).getType();
            }
        }
        return "bhgu bna ";
        
    }
    public String typing (){
        String a ="{ ";
        for(int i=0; i<dec.size()-1;i++){
            a = a + dec.get(i).getName() + ":"+ dec.get(i).getType() +",";
        }
       return a= a + dec.get(dec.size()-1).getName() + ":" + dec.get(dec.size()-1).getType()+ "}";
    }
    }

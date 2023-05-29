package lab6;

public class token {

    private String type;
    private Object  value;
    private int consumed;
    public token(String type, Object value,int consumed){
        this.type=type;
        this.value=value;
        this.consumed = consumed;
    }
    public String getType(){
        return type;
    }
    public Object getValue(){
        return value;
    }
    public int getConsumed(){
        return consumed;
    }
  
    public String toString(){
        return "Token("+type+","+value+")";
    }
}
  
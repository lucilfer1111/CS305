package lab6;

public class decleration1 {
    private Object type;
    private Object name;

    public decleration1(Object type , Object name){
        this.type = type;
        this.name = name;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public String toString() {
        return "type= " + type + "   name= " + name ;
    }
}
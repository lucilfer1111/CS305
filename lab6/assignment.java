package lab6;

public class assignment {
    Object source;
    Object target;
    assignment(Object source, Object target){
        this.source = source;
        this.target = target;
    }
    public Object getSource() {
        return source;
    }
    public void setSource(Object source) {
        this.source = source;
    }
    public Object getTarget() {
        return target;
    }
    public void setTarget(Object target) {
        this.target = target;
    }
    public String toString() {
        return "source= " + source +"   target= " + target;
    }
    

}
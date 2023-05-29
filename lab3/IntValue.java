package lab3;

public class IntValue extends Value {
private int intValue;
    
private int val;

public IntValue(int val) {
    this.val = val;
}

public String toString() {
    return Integer.toString(val);
}
}

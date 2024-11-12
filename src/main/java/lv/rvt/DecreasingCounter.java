package lv.rvt;

public class DecreasingCounter {

    private int value;   // a variable that remembers the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        // write the method implementation here
        // the aim is to decrement the value of the counter by one
        if (value > 0) {
        value -= 1; 
        }
    }
    
    // and the other methods go here
    public void reset() {
        this.value = 0;
    }
}

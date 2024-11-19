package lv.rvt;

public class Statistics {
    // initialize the variable numberCount here
    private int count;
    private int sum;



    public Statistics() {
        this.count = 0;
    }
    
    public void addNumber(int number) {
        // write code here
        this.count += 1;
        this.list.add(number);

        int total = 0;
        for (int i = 0; i <list.size();  i++) {
            total += list.get(i);
        }
        this.sum = total;
    }

    public int getCount() {
        // write code here
        return this.count;
    }
    
    public int sum() {
        // write code here
        if (this.count == 0) {
            return 0;
        }
        else {
            return this.sum;
        }
    }

    public double average() {
        // write code here
        double average;
        if(this.count == 0) {
            average = 0;
        }
        else {
            average = 1.0 * this.sum / this.count;
        }
        return average;
    }
}
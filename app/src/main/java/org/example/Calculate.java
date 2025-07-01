package org.example;
public class Calculate {
    public int sum(int x, int y){
        return x + y;
    }
    
    public double average(int x, int y) {
        return (double)(x + y) / 2;
    }
    
    public int sumRange(int start, int end) {
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
    
    public double averageRange(int start, int end) {
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        int count = end - start + 1;
        return (double)sumRange(start, end) / count;
    }
    
    public int sumOdd(int start, int end) {
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }
    
    public int sumEven(int start, int end) {
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
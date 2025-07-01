package org.example;
import org.junit.Test;
import static org.junit.Assert.*;
public class CalculateTest {
    @Test
    public void testSum() {
        Calculate calculate = new Calculate();
        int expected = 5;
        assertEquals(expected, calculate.sum(2, 3));
    }
    
    @Test
    public void testAverage() {
        Calculate calculate = new Calculate();
        // 2と3の平均は2.5
        double expected = 2.5;
        assertEquals(expected, calculate.average(2, 3), 0.001);
    }
    
    @Test
    public void testSumRange() {
        Calculate calculate = new Calculate();
        // 1から10までの合計は55
        int expected = 55;
        assertEquals(expected, calculate.sumRange(1, 10));
        
        // 順序が逆でも同じ結果
        assertEquals(expected, calculate.sumRange(10, 1));
    }
    
    @Test
    public void testAverageRange() {
        Calculate calculate = new Calculate();
        // 1から10までの平均は5.5
        double expected = 5.5;
        assertEquals(expected, calculate.averageRange(1, 10), 0.001);
    }
    
    @Test
    public void testSumOdd() {
        Calculate calculate = new Calculate();
        // 1から10までの奇数の合計は25 (1+3+5+7+9)
        int expected = 25;
        assertEquals(expected, calculate.sumOdd(1, 10));
        
        // 2から9までの奇数の合計は24 (3+5+7+9)
        assertEquals(24, calculate.sumOdd(2, 9));
    }
    
    @Test
    public void testSumEven() {
        Calculate calculate = new Calculate();
        // 1から10までの偶数の合計は30 (2+4+6+8+10)
        int expected = 30;
        assertEquals(expected, calculate.sumEven(1, 10));
        
        // 1から9までの偶数の合計は20 (2+4+6+8)
        assertEquals(20, calculate.sumEven(1, 9));
    }
    
    @Test
    public void testEdgeCases() {
        Calculate calculate = new Calculate();
        
        // 同じ数の場合
        assertEquals(5, calculate.sumRange(5, 5));
        assertEquals(5.0, calculate.averageRange(5, 5), 0.001);
        
        // 奇数1つの場合
        assertEquals(5, calculate.sumOdd(5, 5));
        assertEquals(0, calculate.sumEven(5, 5));
        
        // 偶数1つの場合
        assertEquals(0, calculate.sumOdd(4, 4));
        assertEquals(4, calculate.sumEven(4, 4));
    }
}
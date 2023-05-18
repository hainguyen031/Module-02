import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {


    @Test
    void testGetNextDayMonthYear() {
        int day=1,month=1,year=2018;
        int[] example={2,1,2018};
        NextDayCalculator nextDayCalculator=new NextDayCalculator();
        nextDayCalculator.setDayMonthYear(day,month,year);
        int[] result=nextDayCalculator.getNextDayMonthYear();
        assertArrayEquals(example,result);
    }
    @Test
    void testGetNextDayMonthYear2() {
        int day=31,month=1,year=2018;
        int[] example={1,2,2018};
        NextDayCalculator nextDayCalculator=new NextDayCalculator();
        nextDayCalculator.setDayMonthYear(day,month,year);
        int[] result=nextDayCalculator.getNextDayMonthYear();
        assertArrayEquals(example,result);
    }
    @Test
    void testGetNextDayMonthYear3() {
        int day=30,month=4,year=2018;
        int[] example={1,5,2018};
        NextDayCalculator nextDayCalculator=new NextDayCalculator();
        nextDayCalculator.setDayMonthYear(day,month,year);
        int[] result=nextDayCalculator.getNextDayMonthYear();
        assertArrayEquals(example,result);
    }
    @Test
    void testGetNextDayMonthYear4() {
        int day=28,month=2,year=2018;
        int[] example={1,3,2018};
        NextDayCalculator nextDayCalculator=new NextDayCalculator();
        nextDayCalculator.setDayMonthYear(day,month,year);
        int[] result=nextDayCalculator.getNextDayMonthYear();
        assertArrayEquals(example,result);
    }
    @Test
    void testGetNextDayMonthYear5() {
        int day=29,month=2,year=2020;
        int[] example={1,3,2020};
        NextDayCalculator nextDayCalculator=new NextDayCalculator();
        nextDayCalculator.setDayMonthYear(day,month,year);
        int[] result=nextDayCalculator.getNextDayMonthYear();
        assertArrayEquals(example,result);
    }
    @Test
    void testGetNextDayMonthYear6() {
        int day=31,month=12,year=2018;
        int[] example={1,1,2019};
        NextDayCalculator nextDayCalculator=new NextDayCalculator();
        nextDayCalculator.setDayMonthYear(day,month,year);
        int[] result=nextDayCalculator.getNextDayMonthYear();
        assertArrayEquals(example,result);
    }
}
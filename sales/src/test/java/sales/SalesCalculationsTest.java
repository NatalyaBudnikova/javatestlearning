package sales;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SalesCalculationsTest {

    SalesCalculations salesCalculations = new SalesCalculations();

    @Test
    void sumTest(){
        int[] a = new int[]{7, 15, 13, 15, 17, 20, 19, 20, 8, 14, 14, 18};
        int actual = salesCalculations.sum(a);
        int expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void avgTest(){
        int[] a = new int[]{7, 15, 13, 15, 17, 20, 19, 20, 8, 14, 14, 18};
        int actual = salesCalculations.avg(a);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void maxTest(){
        int[] a = new int[]{7, 15, 13, 15, 17, 20, 19, 20, 8, 14, 14, 18};
        int actual = salesCalculations.max(a);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void minTest(){
        int[] a = new int[]{15, 7, 13, 15, 17, 20, 19, 20, 8, 14, 14, 18};
        int actual = salesCalculations.min(a);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void lessAvgTest(){
        int[] a = new int[]{7, 15, 13, 15, 17, 20, 19, 20, 8, 14, 14, 18};
        List<Integer> actual = salesCalculations.lessAvg(a);
        List<Integer> expected = Arrays.asList(1,3,9,10,11);
        assertEquals(expected.size(), actual.size());
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void moreAvgTest(){
        int[] a = new int[]{7, 15, 13, 15, 17, 20, 19, 20, 8, 14, 14, 18};
        List<Integer> actual = salesCalculations.moreAvg(a);
        List<Integer> expected = Arrays.asList(5,6,7,8,12);
        assertEquals(expected.size(), actual.size());
        assertArrayEquals(expected.toArray(), actual.toArray());
    }
}

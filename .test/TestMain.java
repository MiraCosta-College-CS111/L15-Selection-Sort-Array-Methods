import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMain {
    @Test
    @DisplayName("testArrayString")
    void testArrayString() {
        int[] copyOdd= {42, 16, 12, 84, 77, 26, 53};
        int[] copyRep= {2, 5, 2, 9, 2, 5, 2, 9, 5};

        String answerOdd = "{ 42, 16, 12, 84, 77, 26, 53 }";
        String answerRep = "{ 2, 5, 2, 9, 2, 5, 2, 9, 5 }";

        assertEquals(answerOdd, ArrayMethods.arrayString(copyOdd));
        assertEquals(answerRep, ArrayMethods.arrayString(copyRep));
    }

    @Test
    @DisplayName("testSelectionSort")
    void testSelectionSort() {
        int[] copyOdd= {42, 16, 12, 84, 77, 26, 53};
        int[] copyEven= {5, 7, 9, 6, 8, 3};
        int[] copyNeg = {24, 0, -13, 5, -4, 17, -20, -10};
        int[] copyRep= {2, 5, 2, 9, 2, 5, 2, 9, 5};

        int[] answerOdd = { 12, 16, 26, 42, 53, 77, 84 };
        int[] answerEven = { 3, 5, 6, 7, 8, 9 };
        int[] answerNeg = { -20, -13, -10, -4, 0, 5, 17, 24 };
        int[] answerRep = { 2, 2, 2, 2, 5, 5, 5, 9, 9 };

        ArrayMethods.selectionSort(copyOdd);
        ArrayMethods.selectionSort(copyEven);
        ArrayMethods.selectionSort(copyNeg);
        ArrayMethods.selectionSort(copyRep);

        assertArrayEquals(answerOdd, copyOdd);
        assertArrayEquals(answerEven, copyEven);
        assertArrayEquals(answerNeg, copyNeg);
        assertArrayEquals(answerRep, copyRep);
    }

    @Test
    @DisplayName("testSwap")
    void testSwap() {
        int[] copyNeg = {24, 0, -13, 5, -4, 17, -20, -10};
        int[] copyRep= {2, 5, 2, 9, 2, 5, 2, 9, 5};

        int[] answerNeg = { 24, 0, -20, 5, -4, 17, -13, -10 };
        int[] answerRep = { 2, 5, 9, 9, 2, 5, 2, 2, 5 };

        ArrayMethods.swap(copyNeg, 2, 6);
        ArrayMethods.swap(copyRep, 7, 2);

        assertArrayEquals(answerNeg, copyNeg);
        assertArrayEquals(answerRep, copyRep);
    }

    @Test
    @DisplayName("testReverse")
    void testReverse() {
        int[] copyOdd= {42, 16, 12, 84, 77, 26, 53};
        int[] copyEven= {5, 7, 9, 6, 8, 3};

        int[] answerOdd = { 53, 26, 77, 84, 12, 16, 42 };
        int[] answerEven = { 3, 8, 6, 9, 7, 5 };

        ArrayMethods.reverse(copyOdd);
        ArrayMethods.reverse(copyEven);

        assertArrayEquals(answerOdd, copyOdd);
        assertArrayEquals(answerEven, copyEven);
    }

    @Test
    @DisplayName("testIndexOfMin")
    void testIndexOfMin() {

        int[] copyOdd= {42, 16, 12, 84, 77, 26, 53};
        int[] copyEven= {5, 7, 9, 6, 8, 3};
        int[] copyNeg = {24, 0, -13, 5, -4, 17, -20, -10};

        assertFalse(-20 == ArrayMethods.indexOfMin(copyNeg,0));
        assertEquals(6, ArrayMethods.indexOfMin(copyNeg,0));
        assertEquals(2, ArrayMethods.indexOfMin(copyOdd,0));
        assertEquals(5, ArrayMethods.indexOfMin(copyOdd,3));
        assertEquals(5, ArrayMethods.indexOfMin(copyEven,2));
    }
}
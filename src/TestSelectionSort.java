import org.junit.Assert;
import org.junit.Test;

public class TestSelectionSort {

    private SelectionSort selectionSort = new SelectionSort();

    @Test
    public void test() {
        testPositive();
        testNegative();
        testMixed();
        testDuplicates();
    }

    public void testPositive() {
        int[] arr = {11, 19, 17, 20, 12};
        int[] sortedArr = {11, 12, 17, 19, 20};
        selectionSort.basicSelectionSort(arr);
        Assert.assertArrayEquals("Positive numbers not sorted correctly", sortedArr, arr);
    }
    


    public void testNegative() {
        int[] arr = {-18, -19, -17, -20, -12};
        int[] sortedArr = {-20, -19, -18, -17,-12};
        selectionSort.basicSelectionSort(arr);
        Assert.assertArrayEquals("Negative numbers not sorted correctly", sortedArr, arr);
    }

    public void testMixed() {
        int[] arr = {15, -13, 20, -14, 12};
        int[] sortedArr = {-14, -13, 12, 15, 20};
        selectionSort.basicSelectionSort(arr);
        Assert.assertArrayEquals("Mixed numbers not sorted correctly", sortedArr, arr);
    }

    public void testDuplicates() {
        int[] arr = {15, 13, 15, -11, 20, -11};
        int[] sortedArr = {-11, -11, 13, 15, 15, 20};
        selectionSort.basicSelectionSort(arr);
        Assert.assertArrayEquals("Array with duplicates not sorted correctly", sortedArr, arr);
    }
}

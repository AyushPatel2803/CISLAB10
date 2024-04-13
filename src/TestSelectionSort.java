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
        int[] arr = {8, 9, 7, 10, 2};
        int[] sortedArr = {2, 7, 8, 9, 10};
        selectionSort.basicSelectionSort(arr);
        Assert.assertArrayEquals("Positive numbers not sorted correctly", sortedArr, arr);
    }


    public void testNegative() {
        int[] arr = {-8, -9, -7, -10, -2};
        int[] sortedArr = {-10, -9, -8, -7, -2};
        selectionSort.basicSelectionSort(arr);
        Assert.assertArrayEquals("Negative numbers not sorted correctly", sortedArr, arr);
    }

    public void testMixed() {
        int[] arr = {5, -3, 0, -4, 2};
        int[] sortedArr = {-4, -3, 0, 2, 5};
        selectionSort.basicSelectionSort(arr);
        Assert.assertArrayEquals("Mixed numbers not sorted correctly", sortedArr, arr);
    }

    public void testDuplicates() {
        int[] arr = {5, 3, 5, -1, 0, -1};
        int[] sortedArr = {-1, -1, 0, 3, 5, 5};
        selectionSort.basicSelectionSort(arr);
        Assert.assertArrayEquals("Array with duplicates not sorted correctly", sortedArr, arr);
    }
}

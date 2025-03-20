import java.util.Arrays;

public class Productprices {
    
    public static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(prices, low, high);
            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }
    
    private static int partition(int[] prices, int low, int high) {
        int pivot = prices[high]; 
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (prices[j] < pivot) {
                i++;
                swap(prices, i, j);
            }
        }
        swap(prices, i + 1, high);
        return i + 1;
    }
    
    private static void swap(int[] prices, int i, int j) {
        int temp = prices[i];
        prices[i] = prices[j];
        prices[j] = temp;
    }
    
    public static void main(String[] args) {
        int[] productPrices = {1500, 1200, 2500, 800, 3000, 1800};
        System.out.println("Original Prices: " + Arrays.toString(productPrices));
        
        quickSort(productPrices, 0, productPrices.length - 1);
        
        System.out.println("Sorted Prices: " + Arrays.toString(productPrices));
    }
}

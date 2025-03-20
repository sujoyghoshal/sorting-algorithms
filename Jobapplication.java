import java.util.Scanner;

public class Jobapplication {
    public static void display(int arr[]){
        int n=arr.length;
        System.out.println("The sortest slary of job appliaction :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void heapsort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The total Employee :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter The salary :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        heapsort(arr);
        display(arr);
    }
}

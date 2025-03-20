import java.util.Scanner;

public class Examsore {
    public static void display(int arr[],int n){
        System.out.println("The sort Exam scores is :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Selectionsort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int smallest = i;
            for(int j=i+1;j<n;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        display(arr, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number of student :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter The Exam score :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Selectionsort(arr, n);
    }
}

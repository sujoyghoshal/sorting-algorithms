import java.util.Scanner;

public class Sortemployeeid {
    public static void display(int arr[],int n){
        System.out.println("The sort Employee Ids :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void insertionsort(int arr[],int n){
        //*unsoreted array;
        for(int i=1;i<n;i++){
            int curr=arr[i];
            int j=i-1;
            while(j>=0 && curr<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
        display(arr, n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total Employee :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter The employee id :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        insertionsort(arr, n);
    }
}

import java.util.Scanner;
public class MultiValue {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=10;
        int arr[]= new int[n];
        int i=0;
        while(i<n){
            int c= sc.nextInt();
            if(c<0 || c==0){
                break;
            }
            arr[i]=c;
            i++;
        }
        for(int b=0;b<arr.length;b++){
            System.out.println(arr[b]);
        }
    }
}
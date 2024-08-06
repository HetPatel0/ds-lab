import java.util.Scanner;


public class Q90 {
    public static void main(String[] args) {
        int arr[] = {4,5,8,90,88,78};
        System.out.println("Which element to be find from the array");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int index =0;
        
        for(int i=0;i<=arr.length-1;i++) {
            if(value==arr[i] ) {
                index =i;
                break;
            }
            else{
              index =-1;
             
            }

        }
        if(index == -1) {
            System.out.println("Element is not there");
        }
        else{
            System.out.println(("elment :"  + value + " is at index : " + index));
        }
    }
}

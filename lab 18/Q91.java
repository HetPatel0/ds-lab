//binary search

import java.util.Scanner;

public class Q91 {
    public static void main(String[] args) {
        int arr[] ={21,34,43,55,67,88};
        System.out.println("enter element to be find");
        Scanner  sc = new Scanner(System.in);
        int value = sc.nextInt();
        int left=0, right = arr.length-1;
        int index =-1;
        while(right>=left) {
            int mid = (left+right) / 2;
            if(value == arr[mid]) {
                index = mid;
                break;

            }
            else if (value>arr[mid]) {
                left=mid+1;

            }
            else{//valye<arr[mid]
                right = mid -1;
            }
        }

        if(index==-1) {
            System.out.println("Element not found");

        }
        else{
            System.out.println("element :" + value +" is at :" + index);
        }


        
    }
    
}

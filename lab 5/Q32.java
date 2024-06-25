import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Q32 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter how many words to be enter");
        int n = sc.nextInt();
        String[] words = new String[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter word "+(i));
            words[i] = sc.next();
    }
    Random r =  new Random();
    int randomNo = r.nextInt(n);
    System.out.println("Random word is "+words[randomNo]);
    System.out.println("Enter an anagram word  of it :");
    String anagram = sc.next();
    int[] ch1 =new int[words[randomNo].length()];
    int[] ch2 =new int[anagram.length()];
    for(int i=0; i<words[randomNo].length(); i++){
        ch1[i]=words[randomNo].charAt(i);
    }

    for(int i=0; i<anagram.length(); i++){
        ch2[i]=anagram.charAt(i);
    }
    Arrays.sort(ch1);
    Arrays.sort(ch2);
    int count =0;
for(int i=0;i<anagram.length();i++) {
    if(ch1[i]==ch2[i]){
        count++;
    }
    else{
        count=0;
    }

}
if (count>0){
    System.out.println("Yes, it is an anagram");
}
 else{
    System.out.println("No, it is not an anagram");
 }
   
}

}

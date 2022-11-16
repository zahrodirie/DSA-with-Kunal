package examplesday5;

import java.util.Scanner;

public class Example2 {
    public Example2(){
        Scanner sc =new Scanner(System.in);
        int[] arr =new int[5];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt() ;
            System.out.println(arr[i]);
            
        }
    
}
}

// Main Class

package examplesday5;
public class ExamplesDay5 {
    public static void main(String[] args) {
        // TODO code application logic here
        new Example2();
    }
    
}

package examplesday5;

import java.util.Scanner;

public class Example4 {
    public Example4(){
        Scanner sc = new Scanner(System.in);
        int[] [] arr = new  int[3][3];
        System.out.println(arr.length);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++){
                arr [row][col] = sc.nextInt();
                 }
 
        }
         for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++){
                System.out.println(arr[row][col] + " ");
                
                 }
             System.out.println();
        } 
    }
    
}

package examplesday5;
public class ExamplesDay5 {
    public static void main(String[] args) {
        // TODO code application logic here
        new Example4();
    }
    
}

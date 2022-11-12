package assigment_day3;

import java.util.Scanner;

public class Odd_Even_Numbers {
    public Odd_Even_Numbers(){
     Scanner scanner = new Scanner(System.in);
      System.out.println("Soo Gali Numberka Koowaad :");
          int num = scanner.nextInt();  
        if (num % 2 == 0) {
            System.out.println("Numberka Soo Gelisay Waa Dhaban");
        }
        else {
            System.out.println("Numberkaa Soo nGalisay Waa Kinsi");
        }
    }
    
}

///runnig
package assigment_day3;
public class Assigment_Day3 {
    public static void main(String[] args) {
    new Odd_Even_Numbers();
    }
    
}
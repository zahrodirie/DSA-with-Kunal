package assigment_day3;

import java.util.Scanner;

public class ProductOfTwoNumbers {
    public ProductOfTwoNumbers(){
         Scanner sc = new Scanner(System.in);
        System.out.print("Soo Gali Numberka Koowaad: ");
         int num1=sc.nextInt();
         System.out.print("Soo Geli Numberka Labaad: ");
         int num2=sc.nextInt();
         sc.close();
         Product(num1,num2); 
}
public static void Product(int num1,int num2){
int result;
result=num1*num2;
System.out.println("Isku Dhufashada Labada Tiro Waa "+result);
}
    }
    
///runnig
package assigment_day3;
public class Assigment_Day3 {
    public static void main(String[] args) {
    new ProductOfTwoNumbers();
    }
    
}


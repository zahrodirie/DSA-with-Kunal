package assigment_day3;
import java.util.Scanner;
public class SumOfNumbes {
    public SumOfNumbes(){
       Scanner sc = new Scanner(System.in);
        System.out.print("Soo Gali Numberka Koowaad: ");
         int num1=sc.nextInt();
         System.out.print("Soo Geli Numberka Labaad: ");
         int num2=sc.nextInt();
         sc.close();
         Total(num1,num2); 
}
public static void Total(int num1,int num2){
int result;
result=num1+num2;
System.out.println("Isku Darka Labada Tiro  "+result);
}
    }
    

///runnig
package assigment_day3;
public class Assigment_Day3 {
    public static void main(String[] args) {
    new SumOfNumbes();
    }
    
}


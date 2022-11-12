package assigment_day3;
import java.util.Scanner;
public class Min_and_Max_Number {
    public Min_and_Max_Number(){
          Scanner scanner = new Scanner(System.in);
          System.out.println("Soo Gali Numberka Koowaad :");
          int kow = scanner.nextInt();  
          System.out.println("Soo Gali Numberka Labaad:");
          int Labo = scanner.nextInt(); 
          System.out.println("Soo Gali Numberka Sadexaad");
          int Sadex = scanner.nextInt(); 
          int max = max (kow, Labo, Sadex);
          int min = min (kow, Labo, Sadex); 
          System.out.printf("Sadexda Number Kan Ugu Ween %d, %d, iyo %d Waa : %d %n", kow, Labo, Sadex, max); 
          System.out.printf("Sadexda Number Kan Ugu Yar %d, %d, iyo %d Waa : %d %n", kow, Labo, Sadex, min); 
          scanner.close(); 
    } 
    
    /** * Java method to calculate largest of three numbers */ 
    public static int max(int kow, int labo, int sadex)
    { 
        int max = kow; 
        if (labo > max) { 
            max = sadex; 
        }  
    if (sadex > max) {
        max = sadex; 
    }  
    return max;
    } 
    
    /** * Java method to calculate smallest of three numbers */ 
    
    public static int min(int kow, int labo, int sadex) {
        int min = kow; 
        if (labo < min) { 
            min = labo;
        }   
    if (sadex < min) {
        min = sadex; 
    }   
    return min;
    
    } 
}

///runnig
package assigment_day3;
public class Assigment_Day3 {
    public static void main(String[] args) {
    new Min_and_Max_Number();
    }
    
}
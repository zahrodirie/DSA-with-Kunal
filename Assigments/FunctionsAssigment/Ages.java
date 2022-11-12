import java.util.Scanner;

public class Ages {
    public Ages(){
        
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Soo Gali Da'daada ");
        age = sc.nextInt();
        if (age >= 18)
        {
            System.out.println("Waxaa Tahay Qaan Gaar , Waxaana Codeenkartaa");
        }
        else
        {
            System.out.println("Waxaa Tahay Caruur , Mana Codeenkartid");
        }
    }
    
}
///runnig
package assigment_day3;
public class Assigment_Day3 {
    public static void main(String[] args) {
    new Ages();
    }
    
}
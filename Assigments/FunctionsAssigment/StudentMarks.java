
package assigment_day3;

import java.util.Scanner;
public class StudentGrades {
    public StudentGrades(){
        int i;
  float totalMarks =0 ,percentage , Avarage;
  Scanner sc = new Scanner(System.in);
   System.out.println("Enter Name of Student");
      String name = sc.nextLine();
   System.out.println("Enter number of Subjects");
       int count = sc.nextInt();
        System.out.println("Enter Marks Of  "+count+" Subjects");
        for (i = 0; i < count; i++) {
            totalMarks = sc.nextInt();
        }
    }
}

///runnig
package assigment_day3;
public class Assigment_Day3 {
    public static void main(String[] args) {
    new StudentGrades();
    }
    
}
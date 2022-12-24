package oop1;
public class Example1 {
    public Example1(){
        Student[] Student  = new  Student[5];
        Student zahro = new Student(2 , "Zahro Dirie Ahmed" , 95.2f);
//        zahro.rno =1;
//         zahro.name= "Zahro Dirie";
//         zahro.marks = 92.67f;

//zahro.ChangeName("Zahro Ahmed Dirie (Eng Keyf)");
//zahro.greating();
        System.out.println(zahro.rno);
         System.out.println(zahro.name);
          System.out.println(zahro.marks);
          
          Student rondom = new Student(zahro);
          System.out.println(rondom.name);
          Student rondom2 = new Student(zahro);
          System.out.println(rondom2.name);
          
          Student one = new Student();
          Student two = one;
          one.name = "Samething Samething";
          System.out.println(two.name);
    
}
    class Student{
            int rno ;
            String name;
            float marks;
            
            void greating(){
                
//               System.out.println("Hellow My Name is" +name);
                System.out.println("Hellow My Name is " +this.name);
                }
            
           void ChangeName(String newName){
               name = newName;
           }
            Student (Student other){
                this.name=other.name;
                 this.rno=other.rno;
                  this.marks=other.marks;
                
            }
            Student(){ 
//              this.rno =1;
//         this.name= "Zahro Dirie";
//         this.marks = 92.67f;
//Calling Constructure inside a Constructure
             this ( 2 ,"Default Persone" , 100.0f);
             
            }
               Student(int rno, String name, float marks) { 
           this.rno =rno;
         this.name= name;
         this.marks = marks;
            }
        }
}


// Main Class
package oop1;
public class OOP1 {
public static void main(String[] args) {
        // TODO code application logic here
        new Example1();
    }
    
}

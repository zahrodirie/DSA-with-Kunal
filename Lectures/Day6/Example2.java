package oop1;
public class Example2 {
    public Example2(){
    int a = 10;
    int b = 20;
    Integer num = 45;
    
    swap(a ,b);
    
    System.out.println(a+ " " +b);
    A zahro = new A("Zahro Ahmed Dirie");
    zahro.name = "Other Name";
//    zahro = new A("new Object");

      A obj;
      
        for (int i = 0; i < 1000000000 ; i++) {
            obj = new A("Random Name");
        }

    
    
}
    public void swap(int a , int b ){
        int Tamp = a;
        a=b;
        b=Tamp;
        
    }
    class A{
        final int num = 13;
        String name;
        
        public A(String name){
//              System.out.println("object is created");
        this.name = name;
    }

        @Override
        protected void finalize() throws Throwable {
           System.out.println("object is destroyed");
        }
        
        
    }
}

//main Class

package oop1;
public class OOP1 {
public static void main(String[] args) {
        // TODO code application logic here
        new Example2();
    }
    
}

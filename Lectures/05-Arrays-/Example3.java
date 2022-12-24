package examplesday5;

import java.util.Arrays;

public class Example3 {
    public Example3(){
        
        int [] nums ={12 ,4 ,7,8};
        System.out.println(Arrays .toString(nums));
        change(nums);
    }
    public static void change(int[] arr){
        arr[0] = 90;
    }
}
// Main Class

package examplesday5;
public class ExamplesDay5 {
    public static void main(String[] args) {
        // TODO code application logic here
        new Example3();
    }
    
}

package assigmentarraysday5;
public class HighestAltitude {
    public HighestAltitude(){
         class Solution {
    public int largestAltitude(int[] nums) {
       int max = 0;
        int Current = 0;
        for(int i=0; i < nums.length; i++)
        {
           Current +=nums[i];
           max = Math.max(Current , max);
        }
        
        return max;  
    }
}
    }
}
// main Java

package assigmentarraysday5;
public class AssigmentArraysDay5 {
    public static void main(String[] args) {
        // TODO code application logic here
        new HighestAltitude();
    }
    
}

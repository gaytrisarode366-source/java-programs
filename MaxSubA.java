//kadanse algorithm Time complexity=O(n)

public class MaxSubA {
    public static void kadanes(int num[]){
        int MS=Integer.MIN_VALUE;
        int CS=0;
    
        for(int i=0;i<num.length;i++){
            CS += num[i];
            if(CS<0){
                CS=0;
            }
            MS = Math.max(CS, MS);
        } 
        System.out.println("Our max Subarray :"+MS);    
    }
    public static void main(String args[]){
        int num[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(num);
    }

}

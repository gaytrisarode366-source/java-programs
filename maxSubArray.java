//prefix Sum approch time complexity=O(n^2) because 2 loop are used

public class maxSubArray{
    public static void maxSub(int num[]){
       int currSum = 0;
       int maxSum =Integer.MIN_VALUE;
       int prefix[] = new int[num.length];
       prefix[0] = num[0];

       //calculate prefix array
       for(int i =2;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+num[i] ;  
       }
       for(int i=0;i<=num.length;i++){
        int Start = i;
        for(int j=i;j<num.length;j++){
            int end=j;
            currSum = Start==0?prefix[end]:prefix[end]-prefix[Start-1];

            if(maxSum<currSum){
                maxSum = currSum;
            }
        }
        
       }
       System.out.println("Max Sum :"+maxSum);
    }   
    public static void main(String args[]){
        int num[]={1,-2,6,-1,3};
        maxSub(num);

       }    
}
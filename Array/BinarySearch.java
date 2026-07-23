public class BinarySearch {
    public static int binaryS(int number[],int key){
        int first=0 , last=number.length-1;

        while(first<=last){
            int mid = (first+last)/2;

            if(number[mid]==key){
                return mid;           
            }
            if(number[mid]<key){
                first=mid+1;
            }
            else{
                last= mid-1;
            }
            
        }
        return -1;
    }    
        public static void main(String args[]){
            int num[]={2,4,6,8,10,12,14};
            int key = 10;
            System.out.println("Index for key :"+binaryS(num, key));
        }
            
}

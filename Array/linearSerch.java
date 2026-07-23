public class linearSerch {
    public static int LinearS(int num[] , int key){
        for(int i=0;i<=num.length;i++){
            if (num[i]==key){
                return i;
            }
            
        }return -1;
    }
    public static void main(String args[]){
        int num[] = {2,4,6,8,10,12,14,16};
        int key = 10;
        int idx = LinearS(num, key);
        if(idx == -1){
            System.out.println("NOT found");
        }
        else{
            System.out.println("Key at index :"+ idx);
        }
    }
    
}

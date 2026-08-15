class Solution {
    public static int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int nums[] ={1,3,5,6};
        int key = 4;
        int idx = searchInsert(nums,key);
        if(idx == -1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]<key && nums[i+1]>key){
                    System.out.println("index is :"+(i+1));
                    break;
                }
            }
        }
        else{
            System.out.println("key at index :"+idx);
        }

    }
}
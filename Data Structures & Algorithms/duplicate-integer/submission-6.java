class Solution {
    public boolean hasDuplicate(int[] nums) {
     Hashmap<Integer,Integer> map= new Hashmap<>();
        for(int i:nums){
            if(map.contains[i]){
                return true;
            }
            else{
                return false;
            }
        }
    }
}
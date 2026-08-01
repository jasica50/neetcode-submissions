class Solution {
    public boolean hasDuplicate(int[] nums) {
      map= new Hashmap<Integer>();
        for(int i=0;i<nums;i++){
            if(map.containsa[i]){
                int value=map.get(a[i]);
                map.put(a[i],value+1);
            }
            else{
                map.put(a[i],1);
            }
        }
    }
}
class Solution {
    public int minOperations(int[] nums, int k) {
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            ans=ans^nums[i];
        }
         String res1=Integer.toBinaryString(ans);
         String res2=Integer.toBinaryString(k);
        // System.out.println(res1+","+res2);
        if(res1.length()>res2.length()){
            String add="";
            for(int i=0;i<res1.length()-res2.length();i++){
                add=add+'0';
            }
            res2=add+res2;
        }
          if(res1.length()<res2.length()){
            String add="";
            for(int i=0;i<res2.length()-res1.length();i++){
                add=add+'0';
            }
            res1=add+res1;
        }
        int count=0;
        int i=0;
       while(i<res1.length()){
        if(res1.charAt(i)!=res2.charAt(i)){
            count++;
        }
        i++;
       }
       
        return count;
        
    }
}
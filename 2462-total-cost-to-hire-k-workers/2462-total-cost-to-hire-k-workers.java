class Solution {
    public long totalCost(int[] arr, int k, int candidates) {
        
        int n = arr.length;
        long ans = 0;
        int leftbound = candidates;
        int rightbound = n-candidates-1;
        
        PriorityQueue<Integer> left = new PriorityQueue<>();
        PriorityQueue<Integer> right = new PriorityQueue<>();
        
        for(int i=0;i<candidates;i++)
            left.add(arr[i]);
        
        
        
         for(int i=n-1; i>=Math.max(candidates,n-candidates); i--)
             right.add(arr[i]);
        
        
            
            while(k>0){
                
                if(left.size()!=0 && right.size()!=0){
                    if(left.peek()<=right.peek()){
                        ans+=left.peek();
                        left.remove();
                        
                        if(leftbound<=rightbound){
                            left.add(arr[leftbound]);
                            leftbound++;
                        }
                        
                    }
                    
                    else{
                        ans+=right.peek();
                        right.remove();
                        
                        if(leftbound<=rightbound){
                            right.add(arr[rightbound]);
                            rightbound--;
                        }
                    }
                    
                    
                }
                
                
                else if(left.size()!=0){
                    ans+=left.peek();
                    left.remove();
                }
                
                else{
                    ans+=right.peek();
                    right.remove();
                }
                
                k--;
            }
        
        return ans;
        
    }
}
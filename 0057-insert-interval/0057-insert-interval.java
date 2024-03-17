class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n=intervals.length;
        if(n==0){
            return new int[][]{newInterval};
        }
        ArrayList<int[]>list=new ArrayList<>();
        int newS=newInterval[0];
        int newE=newInterval[1];
        int index=-1;
        for(int i=0;i<n;i++){
            int currS=intervals[i][0];
            int currE=intervals[i][1];
            if(currS>newE){
                 list.add(new int[]{newS,newE});
                 index=i;
                 break;
            }
            else if(currS<newS && currE>newE){
                index=i;
                break;
            }
            else if(currS>= newS && newE>=currS ){
                newS=Math.min(currS,newS);
                newE=Math.max(currE,newE);
            }
            else if(currS<=newS && currE>=newE){
                newS=Math.min(currS,newS);
                newE=Math.max(currE,newE);
            }
            else if(currS<=newS && currE>=newS){
                newS=Math.min(currS,newS);
                newE=Math.max(currE,newE);
            }
            else if(currS==newS && currE==newE){
                index=i;
                break;
            }
            else{
                list.add(new int[]{currS,currE});
            }
        }
        if(index==-1){
            System.out.println(list.size());
             list.add(new int[]{newS,newE});
             int ans1[][]=new int[list.size()][2];
              for(int i=0;i<list.size();i++){
            //int temp[]=list.get()
            ans1[i][0]=list.get(i)[0];
            ans1[i][1]=list.get(i)[1];
        }
        return ans1;
        }
        
        int len=list.size()+(n-index);
        int ans[][]=new int[len][2];
        for(int i=0;i<list.size();i++){
            //int temp[]=list.get()
            ans[i][0]=list.get(i)[0];
            ans[i][1]=list.get(i)[1];
           
        }
        
        int ansIndex=list.size();
         for(int i=index;i<n;i++){
            ans[ansIndex][0]=intervals[i][0];
            ans[ansIndex][1]=intervals[i][1];
            ansIndex++;
         }
         
        System.out.println(index);
        return ans;
    }
}
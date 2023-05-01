class Solution {
    public double average(int[] salary) {
        int max=Integer. MIN_VALUE;
        int min=Integer. MAX_VALUE;
        double sum=0;
        for(int i: salary){
            if(i<min){
                min=i;
            }
            if(i>max){
                max=i;
            }
        }
        for(int i: salary){
            if(i==max || i==min){
                continue;
            }
            else{
                sum=sum+i;
            }
        }
        return sum/(salary.length-2);
    }
}
import java.util.Arrays;
class Solution {
    public String[] findRelativeRanks(int[] score) {
        String ans[]=new String[score.length];
        String str="";
        int arr[]=new int[score.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=score[i];
        }
        Arrays.sort(arr);
        int pos=arr.length;
        HashMap<Integer,Integer>map =new HashMap<>();
        for(int i: arr){
             map.put(i,pos);
             pos--;
        }
        for(int i=0;i<score.length;i++){
            if(map.containsKey(score[i])){
                 if(map.get(score[i])==1){
                     ans[i]="Gold Medal";
                 }
                 else if(map.get(score[i])==2){
                     ans[i]="Silver Medal";
                 }
                 else if(map.get(score[i])==3){
                     ans[i]="Bronze Medal";
                 }
                 else{
                     ans[i]=str+map.get(score[i]);
                     str="";
                 }
            }
        }
        return ans;
       
    }
}
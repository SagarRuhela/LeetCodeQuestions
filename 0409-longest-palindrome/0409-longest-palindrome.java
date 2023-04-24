class Solution {
    public int longestPalindrome(String s) {
        int count=0;
        char ch[]=s.toCharArray();
        Set<Character> map=new HashSet<>();
        for(char i:ch){
            if(map.contains(i)){
                count=count+2;
                map.remove(i);
            }
            else{
                map.add(i);
            }
        }
        if(map.isEmpty()){
            return count;
        }
        else{
            return count+1;
        }
    }
}
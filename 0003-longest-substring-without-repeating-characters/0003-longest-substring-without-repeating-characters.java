class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int i=0;// index for adding the elment 
        int j=0; // index for removing the element when it comes agian
        int length=0;
        while(i<s.length()){
            if(set.contains(s.charAt(i))){// if the charcter is contained in the set then we remove the ith elment so that we can check for upcoming element.
                set.remove(s.charAt(j));
                j++;
            }
            else{
                set.add(s.charAt(i));// if the character is not present inside the set then just add and find the maximum length becuse that what we want in the end.
                i++;
                length=Math.max(length,set.size());
            }
        }
        return length;
    }
}
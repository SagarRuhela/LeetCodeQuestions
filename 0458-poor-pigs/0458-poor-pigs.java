class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int numberOfTimes=minutesToTest/minutesToDie;
        int i=0;
        while(Math.pow(numberOfTimes+1,i)< buckets)
        {
            i++;
        }
        return i;
    }
}
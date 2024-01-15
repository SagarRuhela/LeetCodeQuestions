class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans=new ArrayList<>();
        // hashmap for storing the lostplayer number and ther lost matches
        HashMap<Integer,Integer> lostPlayer=new HashMap<>();
        for(int i=0;i<matches.length;i++){
            int curr=matches[i][1];
            if(lostPlayer.containsKey(curr)){
                lostPlayer.put(curr,lostPlayer.get(curr)+1);
            }
            else{
                lostPlayer.put(curr,1);
            }
        }
        // list for players that has not lost any matches
        HashSet<Integer> winnerset = new HashSet<>();
        List<Integer> winners=new ArrayList<>();
        for(int i=0;i<matches.length;i++){
            int winner=matches[i][0];
            if(lostPlayer.containsKey(winner)){
                continue;
            }
            else{
                winnerset.add(winner);
            }
        }
         Iterator<Integer> iterator = winnerset.iterator();
         while (iterator.hasNext())
        {
            winners.add(iterator.next());
        }
         Collections.sort(winners);
        ans.add(winners);
        // lit for player who lost exactly one match
        List<Integer> lostone =new ArrayList<>();
         for(int i=0;i<matches.length;i++){
            int looser=matches[i][1];
           if(lostPlayer.get(looser)==1){
               lostone.add(looser);
           }
        }
        Collections.sort(lostone);
        ans.add(lostone);
        return ans;
    }
}
import java.util.Random;
class RandomizedSet {
      HashSet<Integer> set;
      ArrayList<Integer> list;
    public RandomizedSet() {
        this.set=new HashSet<>();
    }
    
    public boolean insert(int val) {
        if(set.contains(val)){
            return false;
        }
        else{
        set.add(val);
        return true;}
    }
    
    public boolean remove(int val) {
        if(set.contains(val)){
            set.remove(val);
            return true;
        }
        else{
            return false;
        }
    }
    
    public int getRandom() {
        this.list=new ArrayList<>();
        for(int i:set){
            list.add(i);
        }
        Random rand = new Random();
        int rand1 = rand.nextInt(list.size());
        return list.get(rand1);

    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
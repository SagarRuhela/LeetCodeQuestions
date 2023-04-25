class SmallestInfiniteSet {
    public HashSet<Integer>set=new HashSet<>();
    public int smallest;
    public SmallestInfiniteSet() {
        for(int i=1;i<=1000;i++){
            set.add(i);
        }
        this.smallest=1;
    }
    
    public int popSmallest() {
        int temp=this.smallest;
        while(!(set.remove(temp))){
            temp++;
        }
        this.smallest++;
        return temp;
    }
    
    public void addBack(int num) {
        if(!(set.contains(num))){
            set.add(num);
            if(num<this.smallest){
                smallest=num;
            }
        }

    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
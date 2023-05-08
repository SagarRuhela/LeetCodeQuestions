// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    int pointer;
    ArrayList<Integer> arr;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        arr=new ArrayList<>();
       while(iterator.hasNext()){
            this.arr.add(iterator.next());
       }
        this.pointer=0;
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return arr.get(pointer);
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    int ans= arr.get(pointer);
        pointer++;
        return ans;
	}
	
	@Override
	public boolean hasNext() {
	    if(pointer<arr.size()){
            return true;
        }
        else{
            return false;
        }
	}
}
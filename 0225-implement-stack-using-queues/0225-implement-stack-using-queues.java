class MyStack {
      Queue<Integer> q1;
      Queue<Integer> q2;
    public MyStack() {
      q1=new LinkedList<>();
      q2=new LinkedList<>(); 
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        int size=q1.size()-1;
        for(int i=0;i<size;i++){
            q2.add(q1.remove());
        }
        int temp=q1.remove();
        for(int i=0;i<size;i++){
             q1.add(q2.remove());
        }
        return temp;
    }
    
    public int top() {
        int size=q1.size()-1;
        for(int i=0;i<size;i++){
            q2.add(q1.remove());
        }
        int temp=q1.remove();
        for(int i=0;i<q2.size();i++){
             q1.add(q2.remove());
        }
        q1.add(temp);
        return temp;
    }
    
    
    public boolean empty() {
        if(q1.size()==0){
            return true;
        }
        else{
            return false;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
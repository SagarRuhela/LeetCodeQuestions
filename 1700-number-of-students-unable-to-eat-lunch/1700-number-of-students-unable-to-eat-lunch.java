class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n=students.length;
    Queue<Integer> q=new LinkedList<>();
    for(int i:students){
        q.add(i);
    }
   // q.addAll(students);
    int i=0;
    int count=100*100+1;
    while(!q.isEmpty() && count>0 && i<n){
        int studentChoice=q.poll();
        int sandwichAtTop=sandwiches[i];
        // System.out.println(studentChoice);
        // System.out.println(sandwichAtTop);
        if(studentChoice==sandwichAtTop){
           // System.out.println("here");
            i++;
        }
        else{
            q.add(studentChoice);
        }
        count--;
    }
    return n-i;
    }
}
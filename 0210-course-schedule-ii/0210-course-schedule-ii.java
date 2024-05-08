class Solution {
    public int [] findOrder(int numCourses, int[][] prerequisites) {
        // her ewe need to fing to find wheather we are albe to complte all thse course or not
        // if yes then print the course we taken in order 
        // so to check if we can complete all the course or not we need the fing the cycle in the graph 
        // made by the prerequisites array if cycle is forming then we con't complete it 
        // so for finding cycle we can ether use dfs or topological sorting but dor finging the order we need to find 
        // use the topological sorting algo aka khans algo.
        // her is the code for topological sort which give us the one of the linear order of the nodes of the graph
        // graph
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        ArrayList<Integer> ans=new ArrayList<>(); 
        int inDegree[]=new int [numCourses];
        for(int i=0;i<prerequisites.length;i++){
            int v1=prerequisites[i][0];
            int v2=prerequisites[i][1];
            inDegree[v1]++;
            graph.get(v2).add(v1);
        }
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(inDegree[i]==0){
                queue.add(i);
               
            }
        }
        
        while(!queue.isEmpty()){
            int curr=queue.poll();
             ans.add(curr);
            for(int i:graph.get(curr)){
                inDegree[i]--;
                if(inDegree[i]==0){
                    queue.add(i);
                }
            }
        }
        if(ans.size()==numCourses){
            int arr[]=new int[numCourses];
            for(int i=0;i<ans.size();i++){
                arr[i]=ans.get(i);
            }
            return arr;
        }
        else{
            return new int[0];
        }
    }
}
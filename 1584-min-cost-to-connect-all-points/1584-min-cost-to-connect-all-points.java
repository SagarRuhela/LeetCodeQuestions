class Solution {
    public int minCostConnectPoints(int[][] points) {
        // Keep track of visited nodes
        HashSet<Integer> visited = new HashSet<>();
        
        //Min Heap
        PriorityQueue<int[]> minH = new PriorityQueue<>((a, b) -> a[1]-b[1]);
        
        // Each int[] will contain {node index in points[][], distance}
        // Initially, node at index 0 will be distance 0 from itself.
        minH.add(new int[]{0, 0});
        
        // Total distance
        int tD = 0; 
        
        // Keep going until we have visited all nodes.
        while (visited.size() < points.length) {
            // The node with the shortest distance to visit
            int[] toVisit = minH.poll();
            
            // Skip if already visited
            if (!visited.add(toVisit[0])) continue;
            
            // Unvisited node, so update total distance
            tD += toVisit[1];
            
            // Get distance to all UNVISITED neighbors to add to queue
            for (int i = 0 ; i < points.length; i++) {
                
                // Already visited
                if (visited.contains(i)) continue;
                
                // curr point to visit
                int[] cP = points[i];
                
                // Get source point by accessing point[][] array
                int[] sP = points[toVisit[0]];
                
                // Calculate distance from source point to curr point
                // and adding it to queue
                int distance = Math.abs(sP[0]-cP[0]) + Math.abs(sP[1]-cP[1]);
                minH.add(new int[]{i, distance});
            }
        }
        
        // Visited all nodes, so return total distance
        return tD;
    }
}
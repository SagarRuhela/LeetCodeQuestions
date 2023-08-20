class Solution {
    public int numIslands(char[][] grid) {
        int count = 0; // Initialize the count of islands to 0.
        
        // Loop through each cell in the grid.
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    DFS(grid, i, j); // Start DFS traversal if a '1' cell is found.
                    count++; // Increment the count of islands.
                }
            }
        }
        
        return count; // Return the final count of islands.
    }
    
    // Depth-First Search function to explore an island and mark it as visited.
    public void DFS(char grid[][], int i, int j) {
        // Base cases for stopping the DFS traversal.
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0') {
            return;
        }
        
        // Mark the current cell as visited by changing '1' to '0'.
        grid[i][j] = '0';
        
        // Recursively explore adjacent cells in all four directions.
        DFS(grid, i - 1, j); // Up
        DFS(grid, i + 1, j); // Down
        DFS(grid, i, j + 1); // Right
        DFS(grid, i, j - 1); // Left
    }
}
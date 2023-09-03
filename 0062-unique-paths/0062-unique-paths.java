class Solution {
    public int uniquePaths(int m, int n) {
 
  int[][] mem = new int[m][n];
  for (int i = 0; i < m; ++i) { // init
    for (int j = 0; j < n; ++j) {
      mem[i][j] = -1;
    }
  }
  return numPaths(m - 1, n - 1, mem);
}

private int numPaths(int i, int j, int[][] mem) {
  if (i == 0 || j == 0) {
    return 1;
  }
  if (mem[i - 1][j] == -1) mem[i - 1][j] = numPaths(i - 1, j, mem);
  if (mem[i][j - 1] == -1) mem[i][j - 1] = numPaths(i, j - 1, mem);
  return mem[i - 1][j] + mem[i][j - 1];
}
}
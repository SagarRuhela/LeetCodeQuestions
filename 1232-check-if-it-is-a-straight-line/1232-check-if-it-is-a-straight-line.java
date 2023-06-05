class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length<=2){
            return true;
        }
        int x1=coordinates[0][0];
        int x2=coordinates[1][0];
        int y1=coordinates[0][1];
        int y2=coordinates[1][1];
       int a = (y2 - y1);
	   int b = (x1 - x2);
	   int c = a * x1 + b * y1;

	  for(int i = 2; i < coordinates.length; i++) {
		int cnew = a * coordinates[i][0] + b * coordinates[i][1];
		if(cnew != c){
			return false;
	}
    }
            
        return true;
    }
}
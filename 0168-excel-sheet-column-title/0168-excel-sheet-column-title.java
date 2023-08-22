class Solution {
    public String convertToTitle(int columnNumber) {
        
        StringBuilder output = new StringBuilder();
        
        while(columnNumber > 0){
           
            columnNumber--;
          
            char c = (char) (columnNumber % 26 + 'A');
         
            columnNumber /= 26;
          
            output.append(c);
        }
        output.reverse();
        
        return output.toString();
    }
}
class Solution {
    public boolean winnerOfGame(String colors) {
        int alice=0;
        int bob=0;
        int count=1;
        // for alice
        for(int i=1;i<colors.length();i++){
            if(colors.charAt(i)=='A'){
                if(colors.charAt(i-1)==colors.charAt(i)){
                    count++;
                }
            }
            else{
                if(count>=3){
                    alice=alice+count-2;
                    count=1;
                }
                else{
                    count=1;
                }
            }
            
        }
         if(count>=3){
                    alice=alice+count-2;
                    count=1;
                }
                else{
                    count=1;
                }
        // for bob
        for(int i=1;i<colors.length();i++){
            if(colors.charAt(i)=='B'){
                if(colors.charAt(i-1)==colors.charAt(i)){
                    count++;
                }
            }
            else{
                if(count>=3){
                    bob=bob+count-2;
                    count=1;
                }
                else{
                    count=1;
                }
            }
            
        }
        if(count>=3){
                    bob=bob+count-2;
                    count=1;
                }
                else{
                    count=1;

                }
        
        if(alice>bob){
            return true;
        }
        else{
            return false;
        }
    }
}
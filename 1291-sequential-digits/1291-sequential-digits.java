class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String arr[]={"12","123","1234","12345","123456","1234567","12345678","123456789"};
        int i=0;
        String start=""+low;
        String end=""+high;
        List<Integer> ans=new ArrayList<>();
        String str=arr[start.length()-2];
        i=start.length()-2;
        
        while(true){
           int temp=Integer.parseInt(str);
           if(temp<low){
                if(i==7){
                if(Integer.parseInt(str)>low && Integer.parseInt(str)<high){
                 ans.add(Integer.parseInt(str));
                }
                return ans;
            }

               String n=str.substring(1);
               n=n+(Integer.parseInt(str.substring(str.length()-1))+1);
               str=n;
               if(str.substring(str.length()-1).equals("9")){
                i++;
                if(Integer.parseInt(str)>=low && Integer.parseInt(str)<=high){
                 ans.add(Integer.parseInt(str));
                }
                str=arr[i];
            }
            if(i==7){
                if(Integer.parseInt(str)>low && Integer.parseInt(str)<high){
                 ans.add(Integer.parseInt(str));
                }
                return ans;
            }
               continue;
           }
           if(temp>high){
                break;
            }
           
            if(str.substring(str.length()-1).equals("9")){
                i++;
                ans.add(Integer.parseInt(str));
                str=arr[i];
            }
            else{
                 ans.add(temp);
            String n=str.substring(1);
               n=n+(Integer.parseInt(str.substring(str.length()-1))+1);
               str=n;
            }
            
            if(i==7){
                if(Integer.parseInt(str)>=low && Integer.parseInt(str)<=high){
                 ans.add(Integer.parseInt(str));
                }
                break;
               }
           


        }
        return ans;

    }
}
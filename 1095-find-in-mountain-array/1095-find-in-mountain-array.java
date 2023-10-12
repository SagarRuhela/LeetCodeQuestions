/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findIndex(int left,int right,MountainArray mountainArr){
        while(left<right){
            int mid=(left+right)/2;
            int temp=mountainArr.get(mid);
            if(temp>mountainArr.get(mid-1) && temp<mountainArr.get(mid+1)){
                left=mid;
            }
            else if(temp>mountainArr.get(mid-1) && temp>mountainArr.get(mid+1)){
                return mid;
            }
            else{
                right=mid;
            }
        }
        return -1;
    }
    public int binarySearch1(int left,int right,MountainArray mountainArr,int target){
        if(left==right){
            if(mountainArr.get(left)==target){
                return left;
            }
        }
        while(left<=right){
            int mid=(left+right)/2;
            if(mountainArr.get(mid)==target){
                return mid;
            }
            else if(mountainArr.get(mid)>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
    }
     public int binarySearch2(int left,int right,MountainArray mountainArr,int target){
        if(left==right){
            if(mountainArr.get(left)==target){
                return left;
            }
        }
        while(right<=left){
            int mid=(left+right)/2;
            if(mountainArr.get(mid)==target){
                return mid;
            }
            else if(mountainArr.get(mid)>target){
                right=mid+1;
            }
            else{
                left=mid-1;
            }
        }
        return -1;
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        // first we have to find the i so that we can start our seach using binary search
        int indexi=findIndex(0,mountainArr.length()-1,mountainArr);
        // now after finding the i now we have just search the both section of mountain array with binary search
        
        if(mountainArr.get(indexi)==target){
            return indexi;
        }
        int firstArray=binarySearch1(0,indexi, mountainArr, target);
        int secondArray=binarySearch2(mountainArr.length()-1,indexi+1,mountainArr, target); 
        if(firstArray==-1 && secondArray==-1){
            return -1;
        }
        else if(firstArray==-1){
            return secondArray;
        }
        else{
            return firstArray;
        }
    }
}
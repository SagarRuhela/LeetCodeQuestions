//{ Driver Code Starts
import java.util.*;
class Heap_Sort
{
    void printArray(int arr[],int n)
    {
        //int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        Heap_Sort hs = new Heap_Sort();
        int arr[] = new int[1000000];
        int T = sc.nextInt();
        while(T>0)
        {
            int n = sc.nextInt();
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
                
            Solution ob=new Solution();
            ob.heapSort(arr,n);
            hs.printArray(arr,n);
            T--;
        }
    }
    
}



// } Driver Code Ends


class Solution
{
    //Function to build a Heap from array.
    void buildHeap(int arr[], int n)
    {
        // Your code here
        for(int i=1;i<n;i++){
            int childIndex=i;
            int parentIndex=(i-1)/2;
            while(childIndex>0){
                if(arr[childIndex]<arr[parentIndex]){
                    int temp=arr[childIndex];
                    arr[childIndex]=arr[parentIndex];
                    arr[parentIndex]=temp;
                    childIndex=parentIndex;
                    parentIndex=(childIndex-1)/2;
                }
                else{
                    break;
                }
                
            }
        }
    }
 
    //Heapify function to maintain heap property.
    void heapify(int arr[], int n, int i)
    {
        // Your code here
        for(int j=n-1;j>=0;j--){
            int temp1=arr[0];
            arr[0]=arr[j];
            arr[j]=temp1;
            int parentIndex=0;
            int leftC=(2*parentIndex)+1;
            int rightC=(2*parentIndex)+2;
            while(parentIndex<j){
                int minIndex=parentIndex;
                if(leftC<j && arr[leftC]<arr[minIndex]){
                    minIndex=leftC;
                }
                if(rightC<j && arr[rightC]<arr[minIndex]){
                    minIndex=rightC;
                }
                if(minIndex==parentIndex){
                    break;
                }
                int temp2=arr[minIndex];
                arr[minIndex]=arr[parentIndex];
                arr[parentIndex]=temp2;
                parentIndex=minIndex;
                leftC=2*parentIndex+1;
                rightC=2*parentIndex+2;
            }
        }
    }
    
    //Function to sort an array using Heap Sort.
    public void heapSort(int arr[], int n)
    {
        //code here
        buildHeap(arr,n);
        heapify(arr,n,0);
        int k=0;
        int l=n-1;
        while(k<l){
            int temp=arr[k];
            arr[k]=arr[l];
            arr[l]=temp;
            k++;
            l--;
        }
    }
 }
 
 

//divide and conquer
// divid down until a size of 1, it then puts them back into the array in order
// recursive
//jesus christ

public class MergeSort{
   public static void main(String[] args){
      
      int[] array = {9,8,2,5,3,4,7,6,1};
      
      mergeSort(array);
      
      for(int i = 0; i < array.length; i++){
         System.out.print(array[i] +" ");
      }
      
      System.out.println();
      
      for(int i : array){
         System.out.print(i + " ");
      }
      
   }
   
   private static void mergeSort(int[] array){
      
      int length = array.length;
      if (length <=1) return; //base case
      
      int middle = length/2;
      
      int[] leftArray = new int[middle];
      int[] rightArray = new int[length - middle];
      
      int i = 0;// left array
      int j = 0; //right array
      
      for(; i < length; i++){
         if(i < middle){
            leftArray[i] = array[i];
         }else{
            rightArray[j] = array[i];
            j++;
         }
      }
      mergeSort(leftArray);
      mergeSort(rightArray);
      merge(leftArray, rightArray, array);
      
   }
   
   //helper method - helps merge sort
   private static void merge(int[] leftArray, int[] rightArray, int[] array){
      
      int leftSize = array.length/2;
      int rightSize = array.length - leftSize;
      int i = 0, l = 0, r = 0;
      
      //check the condiotns for merging
      while( l < leftSize&& r < rightSize){
         if(leftArray[l] < rightArray[r]){
            array[i] = leftArray[l];
            i++;
            l++;
         }
         else {
            array[i] = rightArray[r];
            i++;
            r++;
         }
      }
      while (l < leftSize){
         array[i] = leftArray[l];
         i++;
         l++;
      }
      while(r < rightSize){
         array[i] = rightArray[r];
         i++;
         r++;
      }
   }
   
   
}
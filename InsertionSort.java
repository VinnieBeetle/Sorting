// start at index 1 and check element to left, shift and insert
// if num to left > temp shift until num < temp
public class InsertionSort{

   public static void main(String[] args){
      
      int[] array = {9,1,8,2,7,3,6,5,4};
      
      insertSort(array);
      
      
      for(int i :array){
         System.out.print(i + " ");
      }   
   }
   
   public static void insertSort(int[] array){
      
      for(int i = 1; i < array.length; i++){
         int temp = array[i];
         int j = i -1;
         
         while(j >= 0 && array[j] >  temp){
            array[j +1] = array[j];
            j--;
         }
         array[j+1] = temp;
      }
      
   }
   
   
}
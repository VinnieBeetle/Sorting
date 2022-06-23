// a pivot is choosen, often at the end of the array to find where the pivot should go
// ie 10 nums, if 5 is at the end once it runs 5 will be in the middle
// all to the left will be less than pivot, right is greater than pivot
//bro code does good videos
// recursively divide array into two partions at the pivot
public class QuickSort{
   public static void main(String[] args){
      
      int[] array = {8,2,5,3,9,4,7,6,1};
      
      quickSort(array, 0, array.length -1);
      
      for(int i : array){
         System.out.print(i + " ");
      }
            
   }
   //can use privaate (prob should since it's void any ways)
   public static void quickSort (int[] array, int start, int end){
      
      if(end <= start) return; //base case
      
      int pivot = partition(array, start, end);
      quickSort(array, start, pivot-1);
      quickSort(array, pivot+1, end);
      
   }
   
   public static int partition(int[] array, int start, int end){
      
      int pivot = array[end];
      int i = start -1;
      
      for(int j = start; j <=end -1; j++){
         if(array[j] < pivot){
            i++;
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
         }
      }
      i++;
      int temp = array[i];
      array[i] = array[end];
      array[end] = temp;
      
      
      return i;
   }
   
}
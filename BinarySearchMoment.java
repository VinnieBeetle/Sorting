public class BinarySearchMoment{
   
   //iterative version
   public static boolean binarySearchIterative(int[] array, int x){
      int left = 0;
      int right = array.length - 1;
      while (left <= right){
         int mid = left + ((right-left))/2;
         if (array[mid] == x){
            return true;
         } else if (x < array[mid]){
             return binarySearchRecursive(array, x, left, mid - 1);
         } else{
             return binarySearchRecursive(array, x, mid + 1, right);
         }
      }
      return false;
   }
   
   
   
   
   public static boolean binarySearchRecursive(int[] array, int x, int left, int right){
      if (left > right){
         return false;
      }
      int mid = left + ((right-left))/2;
      if (array[mid] == x){
         return true;
      } else if (x < array[mid]){
          return binarySearchRecursive(array, x, left, mid - 1);
      } else{
          return binarySearchRecursive(array, x, mid + 1, right);
      }
      
   }
   
   //initizing method
   public static boolean binarySearchRecursive(int[] array, int x){
      return binarySearchRecursive(array, x, 0, array.length-1);
   }
   
   public static void main(String[] args){
   //has to be in order for this recursive search to work
   // so probably write code to order the array but for now i put in order
      int[] num = {1,2,3,4,11,18,24,33,45, 55, 63,67,71, 82};
      
      System.out.println(binarySearchRecursive(num, 4) + " recursive");
      System.out.println(binarySearchIterative(num, 55) + " iterative");
      
      System.out.println(binarySearchRecursive(num, 1000) + " recursive");
      System.out.println(binarySearchIterative(num, 1000) + " iterative");
   }
}   
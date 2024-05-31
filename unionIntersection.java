package leetcode;
import java.util.HashSet;

public class unionIntersection {
    //this function finds the number of elements in the union set
   public static int  union(int arr1[],int arr2[]){
    HashSet<Integer> set=new HashSet<>();
    for(int i=0;i<arr1.length;i++){
        set.add(arr1[i]);
    }
    for(int i=0;i<arr2.length;i++){
        set.add(arr2[i]);
    }
    System.out.println(set.size());
    return set.size();
   }
   //this function finds the number of elements common in bith the array
   public static int intersect(int arr1[],int arr2[]){
    HashSet<Integer> set=new HashSet<>();
    int count=0;
    for(int i=0;i<arr1.length;i++){
        set.add(arr1[i]);
    }
    for(int i=0;i<arr2.length;i++){
        if(set.contains(arr2[i])){
            count++;
            set.remove(arr2[i]);
        }
        
    }
    System.out.print(count);
    return count;
    
   }
   public static void main(String[] args) {
    int arr1[]={ 1,2,3,4   };
    int arr2[]={1,2,5,6,7,4};
    union(arr1, arr2);
    intersect(arr1, arr2);
   }
}

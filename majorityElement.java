package leetcode;

import java.util.HashMap;

// We are given an integer array of size n,We have to find all 
// the elements that appeared more than n/3 times
public class majorityElement{
    public static void maj(int nums[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){//if true or if the element is there
                map.put(nums[i],map.get(nums[i])+1);
                //increase the frequency of the element by one
            }
            else {
                map.put(nums[i],1);
            }

        }
        //Now check the condition
        for(int key :map.keySet()){
         if(map.get(key)>n/3){
            System.out.println(key);
         }
        }
    }
    public static void main(String[] args) {
        int nums[]={1,2,1,3,1,4,1};
        maj(nums);
    }
}
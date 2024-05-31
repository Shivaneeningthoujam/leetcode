package leetcode;
public class isAnagram {
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// An Anagram is a word or phrase formed by rearranging the letters of
// a different word or phrase, typically using all the original letters exactly once.
public static boolean anagram(String s,String t){
int[] count=new int[26];
//count size is 26 for 27 letters in the alphabet
for(char c: s.toCharArray()){
    //Adding the character frequencies of each letters in string s
    count[c-'a']++;
}
for(char c: t.toCharArray()){
    count[c-'a']--;
    //decreasing the frequency of each letter of t in the string s 
}
for(int val: count ){
    if(val!=0){
        //return false if there exist any val which is non zero
        return false;
    }

}
return true;
}
}

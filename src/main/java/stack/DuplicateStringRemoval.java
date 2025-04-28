package stack;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateStringRemoval {

    /*
    * Given an array of n strings arr[].
    * The task is to determine the number of words remaining after pairwise destruction.
    * If two consecutive words in the array are identical, they cancel each other out.
    * This process continues until no more eliminations are possible.
     */
    /*
    Input: arr[] = [“gfg”, “for”, “geeks”, “geeks”, “for”]
    Output: 1
     */

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("ab", "aa","aa"));
        ArrayList<String> stack = new ArrayList<String>();

        for(String word : stringList) {
            if(stack.isEmpty()){
                stack.add(word);
                break;
            }
               if( stack.getLast().equals(word)){
                   stack.removeLast();
               }else{
                   stack.add(word);
               }

        }

        System.out.println(stack.toArray().length);
    }

}

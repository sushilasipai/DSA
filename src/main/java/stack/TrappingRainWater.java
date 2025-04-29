package stack;

import java.util.ArrayList;
import java.util.Arrays;

public class TrappingRainWater {
    /*
    Trapping Rainwater Problem states that given an array of n non-negative integers arr[]
    representing an elevation map where the width of each bar is 1,
    compute how much water it can trap after rain.

    Input: arr[] = [3, 0, 1, 0, 4, 0, 2]
    Output: 10


    Input: arr[] = [3, 0, 2, 0, 4]
    Output: 7
    Explanation: We trap 0 + 3 + 1 + 3 + 0 = 7 units.


    Input: arr[] = [1, 2, 3, 4]
    Output: 0
    Explanation: We cannot trap water as there is no height bound on both sides


     */

    public static void main(String[] args) {


        int total_water=0;
        ArrayList<Integer> stack = new ArrayList<Integer>();

        ArrayList<Integer> water_heights = new ArrayList<Integer>(Arrays.asList(4,0,1,0,3,0,2));

        int current_index = 0;
        for(Integer current_height : water_heights){

                while(!stack.isEmpty() && water_heights.get(stack.getLast()) < current_height){
                    int pop_height = (int) water_heights.get(stack.removeLast());
                    if(!stack.isEmpty()){
                        int distance = current_index - stack.getLast() - 1;
                       int  water_level = (Math.min(current_height,water_heights.get(stack.getLast())) - pop_height) * distance;
                        total_water+=water_level;
                    }
                }
                stack.add(current_index);
                current_index++;

        }
        System.out.println(total_water);


    }
}

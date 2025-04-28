package stack;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckParanthesis {
    private int top;
    private String[] object;

    public static void main(String[] args) {
        String pattern = "())(";
        CheckIfParanthesisComplete(pattern);
    }
    private static void CheckIfParanthesisComplete(String pattern) {
        ArrayList<Character> stack = new ArrayList<Character>();
        System.out.println(pattern);
        for(char c : pattern.toCharArray()) {
            System.out.println(stack);

            if(stack.toArray().length <= 0){
                if(c == ')'){
                    System.out.println(pattern+ " Is not complete");
                    return;
                }
                stack.add(c);

            }else if(stack.toArray().length > 0){

                if(stack.get((stack.toArray().length - 1)) == ')' && c == '('){
                    stack.remove(stack.toArray().length - 1);
                }else if(stack.get((stack.toArray().length - 1)) == '(' && c == ')'){
                    stack.remove(stack.toArray().length - 1);
                }else{
                   stack.add(c);
                }

            }

        }

        if(stack.size() == 0){
            System.out.println(pattern+ " Is  complete");
        }else {
            System.out.println(pattern+ " Is not complete");
        }
    }

    public static class TrainStack {
        public static void main(String[] args) {
            ArrayList<Character> incomingTrains = new ArrayList<Character>(Arrays.asList('A', 'B', 'C', 'D'));
            ArrayList<Character> outGoingTrains = new ArrayList<Character>(Arrays.asList('B', 'D', 'A', 'C'));
            ArrayList<Character> stack = new ArrayList<Character>();
            int j = 0;
            for(Character train : incomingTrains) {

                if(train.equals(outGoingTrains.get(j))) {
                    j++;
                    while(!stack.isEmpty()){
                        if(stack.get(stack.size() - 1) == outGoingTrains.get(j)) {
                            stack.remove(stack.size() - 1);
                        }else{
                            break;
                        }

                        System.out.println("Size of J is " + j + " Size of stack is " + stack.size());
                    }
                }else{
                    stack.add(train);
                }


            }
            System.out.println(stack);
            if(stack.isEmpty()){
                System.out.println("Solution Found");
            }
            else{
                System.out.println("Solution Not Found");
            }
        }
    }
}

package stack;

import java.util.ArrayList;

public class TrainQueue {

    public static void main(String[] args) {
        ArrayList<Character> incomingTrains = new ArrayList<Character>();
        ArrayList<Character> outgoingTrains = new ArrayList<Character>();
        ArrayList<Character> bufferTrains = new ArrayList<Character>();

        incomingTrains.add('A');
        incomingTrains.add('B');
        incomingTrains.add('C');
        incomingTrains.add('D');

        outgoingTrains.add('B');
        outgoingTrains.add('A');
        outgoingTrains.add('D');
        outgoingTrains.add('C');

       System.out.println(incomingTrains);
       System.out.println(outgoingTrains);

       while(!incomingTrains.isEmpty()) {
           if(incomingTrains.get(0) == outgoingTrains.get(0)) {
                incomingTrains.remove(0);
                outgoingTrains.remove(0);

                if(!bufferTrains.isEmpty()){
                    if(String.valueOf(bufferTrains.get(0)).equals(String.valueOf(outgoingTrains.get(0)))) {
                        bufferTrains.remove(0);
                        outgoingTrains.remove(0);
                    }
                }
           }else{
               bufferTrains.add(incomingTrains.remove(0));
           }
       }

       if(bufferTrains.isEmpty()){
           System.out.println("Solution found");
       }else{
           System.out.println("Solution not found");
       }
    }
}

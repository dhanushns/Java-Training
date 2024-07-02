package Problems;

import java.util.*;
public class CircularFriends {

    public static void find_winner(ArrayList<Integer> friends, int k){

        int pos = 0;
        while(friends.size() != 1){
            pos += k - 1;
            while(pos >= friends.size())
                pos = pos - friends.size();
            friends.remove(pos);
        }
    }

    //Recursion
    public static void recursion_method(ArrayList<Integer> friends, int k,int pos){

        if(friends.size() == 1)
            return;
        pos += k - 1;
        while(pos >= friends.size())
            pos = pos - friends.size();
        friends.remove(pos);
        recursion_method(friends,k,pos);
    }

    public static void main(String[] args) {

        ArrayList<Integer> friends = new ArrayList<>();
        for(int i = 1 ; i <= 6; i++)
            friends.add(i);
        //find_winner(friends,2);
        recursion_method(friends,5,0);
        System.out.println(friends.get(0));
    }

}

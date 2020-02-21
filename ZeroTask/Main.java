package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        MyList fst = new MyList(Arrays.asList(1,2,3));
        MyList scn = new MyList(Arrays.asList(3,4,5));

        System.out.println("Node: " + FindNode(fst,scn));
    }

    static public Integer FindNode(MyList fst, MyList scn){
        HashMap<Integer, Integer> map = new HashMap<>();

        while(fst.isEmpty() == false){
            map.put(fst.Print(), fst.Del());
        }

        while(scn.isEmpty() == false){
            if (map.containsKey(scn.Print())){
                return scn.Del();
            }
            scn.Del();
        }
        return null;
    }
}

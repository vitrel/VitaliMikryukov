package com.company;

import java.util.List;

public class MyList {
    private ForwardList head;

    public boolean isEmpty(){
        return head == null;
    }

    public MyList(List<Integer> arr){
        head = new ForwardList();
        head.setData(arr.get(0));

        for(int i = 0; i < arr.size(); i++){
            this.Add(arr.get(i));
        }
    }

    public void Add(Integer data){
        if (head == null){
            head = new ForwardList();
            head.setData(data);
        }else{
            ForwardList n_head = new ForwardList();
            n_head.setData(data);
            n_head.setNextElement(head);
            head = n_head;
        }
    }

    public Integer Del() {
        if (head == null){
            return null;
        }else{
            Integer elem = head.getData();
            head = head.next();
            return elem;
        }
    }

    public Integer Print(){
        return head.getData();
    }

}



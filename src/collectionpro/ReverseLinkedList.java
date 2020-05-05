package collectionpro;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.print("Before Reverse : ");
        for (int i : list){
            System.out.print(i+" ");
        }
        System.out.print("\n After Reverse : ");
        for (int i = 0; i < list.size()/2; i++) {
            int temp = list.get(i);
            list.set(i,list.get(list.size()-i-1));
            list.set(list.size()-i-1,temp);
        }
        for (int i : list){
            System.out.print(i+" ");
        }

    }
}

package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args){
        ArrayList<String> myList=new ArrayList<String>();
        myList.add("apple");
        myList.add("orange");
        myList.add("grapes");
        myList.add("banana");
        myList.add("mango");
       for(int i=0;i< myList.size();i++){
            System.out.println(myList);
       }
        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("element in the list is contains: " + myList.contains("banana"));
        System.out.println("size of list is: " + myList.size());
        myList.remove("mango");
        System.out.println("size of list is: " + myList.size());

    }

}

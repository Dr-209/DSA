// package ArrayList;
// javac ClassRoom.java;

import java.util.ArrayList;

public class ClassRoom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list.add(2);
        list.add(3);
        list.add(1);
        list.add(3,5);

        System.out.println(list);

        list.remove(3);

        list.get(2);

        list.set(2, 10);

        System.out.println(list.contains(2));  
        System.out.println(list.contains(2));  
        System.out.println(list);

//  print ArrayList
        for( int i = 0; i<=list.size(); i++){
            System.out.print(i + " ");
        }
        
        System.out.println(" ");
        // reverse ArrayList
        for(int i =list.size(); i>=0; i--){
            System.out.print(i + " ");
        }
    }
}

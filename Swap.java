import java.util.ArrayList;
public class Swap {

    void SwapElement(ArrayList<Integer> list, int i1,int i2){
      int temp =  list.get(i1);
      list.set(i1, list.get(i2));
      list.set(i2,temp);

    }

    public static void main(String[] args) {
        Swap obj = new Swap();

        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(3);
        list.add(7);
        list.add(9);
        list.add(1);

        int idx1= 1;
        int idx2 =3;
        System.out.println(list);
        // SwapElement(list ,idx1 ,idx2);
        obj.SwapElement(list, idx1, idx2);
        System.out.println(list);
       
    }

}

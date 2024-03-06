import java.util.ArrayList;
public class MultiDimentional {

    public static void main(String[] args) {
        ArrayList <ArrayList <Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(5);
        list1.add(0);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(41);
        list2.add(51);
        list2.add(10);

        mainList.add(list1);
        mainList.add(list2);

        System.out.println(mainList);

        for(int i = 0; i<mainList.size(); i++){
            ArrayList<Integer> CurrList =mainList.get(i);
                        for(int j=0; j<CurrList.size(); j++){
System.out.print(CurrList.get(j));
            }
        }
    }
    
}

package teju;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListEg {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(10);
       /*  list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);
        System.out.println(list);
        System.out.println(list.contains(45));
        list.set(0,99);
        list.remove(3);*/
        Scanner in=new Scanner(System.in);
        for(int i=0;i<5;i++){
           list.add(in.nextInt());
        }
        for(int i=0;i<5;i++){
            System.out.print(list.get(i)+" ");
        }









    }
}


package Task3;

import java.util.ArrayList;
import java.util.HashSet;

public class Task3 {


    public static void main(String[] args) throws Exception {
        MyList<Integer> list = new MyList<Integer>();
        Myset<Integer> set = new Myset<Integer>();
        ArrayList<Integer> unsafeList = new ArrayList<>(1000);
        HashSet<Integer> unsafeSet = new HashSet<>(1000);
        Thread tread1=new Thread(()-> {
            for (int i=0;i<500;i++){
                list.add(i);
                unsafeList.add(i);
            }
        });
        Thread tread2=new Thread(()-> {
            for (int i=500;i<1000;i++){
                list.add(i);
                unsafeList.add(i);
            }
        });
        tread1.start();
        tread2.start();
        Thread.sleep(1000);
//      for (Integer i : list) {
//            System.out.print(i + " ");
//      }
        System.out.println();
        System.out.println("Size of my list: "+ list.size());
        System.out.println("Size of my unsafe list: "+ unsafeList.size());
        Thread tread3=new Thread(()-> {
            for (int i=0;i<499;i++){
                set.add(i);
                unsafeSet.add(i);
            }
        });
        Thread tread4=new Thread(()-> {
            for (int i=499;i<700;i++){
                set.add(i);
                unsafeSet.add(i);
            }
        });
        tread3.start();
        tread4.start();
        Thread.sleep(1000);
//        for (Inter i : set) {
//            Sysgetem.out.print(i + " ");
//        }
//        System.out.println();
//        for (Integer i : unsafeSet) {
//           System.out.print(i + " ");
//        }
        System.out.println();
        System.out.println("Size of my set: "+ set.size());
        System.out.println("Size of my unsafe set: "+ unsafeSet.size());

     };


}



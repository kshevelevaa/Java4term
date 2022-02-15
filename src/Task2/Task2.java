package Task2;

import java.util.*;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args){
        System.out.println("Enter a number of people");
        Scanner sc=new Scanner(System.in);
        int count= sc.nextInt();
        List<Human> people= new ArrayList<>();
        for( int i=0; i<count;i++){
            Human h=new Human();
            people.add(h);
        };
        System.out.println(people);

        Stream stream=people.stream();
        System.out.println("After sorting: ");
        people.stream().sorted(Comparator.comparing(Human::getSum)).forEach(System.out::println);
        System.out.println("After filter: ");
        people.stream().filter(x->x.getWeight()%5==0).forEach(System.out::println);
        System.out.println("After limit: ");
        people.stream().limit(4).forEach(System.out::println);
        System.out.println("First names: ");
        String result=people.stream().map(Human::getFirstName).reduce(" ", (x,y)->x+y+" ");
        System.out.print(result);

    }
}

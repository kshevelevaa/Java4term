package Task1;
import java.util.Scanner;
import java.util.function.*;

public class Task1 {
    public static String findString(String[] array){
        int maxLetter=0;
        String searchString="";
        for (int i=0; i<array.length;i++){//цикл по массиву строк
            int congruenceCount=0;
            int letterCount=0;
            for(int j=0; j<array[i].length() ; j++){//цикл по длине строки
                for(int k=0;k<array[i].length();k++) {
                    if (array[i].charAt(j) == array[i].charAt(k)) {
                        congruenceCount++;
                    }
                }
                if(congruenceCount==1) letterCount++;//если найден уникальный символ
            }
            if (letterCount>maxLetter) {
                searchString=array[i];
                maxLetter=letterCount;
            }
        }
        return searchString;
    };
    public static void main(String[] args){
        Consumer <String[]> result = array -> System.out.println("Search string: " + findString(array));
        System.out.println("Enter a number of strings");
        Scanner sc= new Scanner(System.in);
        int count=sc.nextInt();
        String[] stringArray= new String[count+1];
        System.out.println("Enter strings");
        for( int i= 0; i<=count; i++) stringArray[i]=sc.nextLine();
        System.out.println(findString(stringArray));
        result.accept(stringArray);
    }
}

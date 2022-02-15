package Task2;
import java.time.LocalDate;

public class Human {
    int  age;
    String firstName;
    String lastName;
    LocalDate birthDate;
    int weight;
    Human(){
        age=(int)(Math.random()*(100+1)+1);
        firstName="firstName" + age%10+ weight%10;
        lastName="lastName" + age%10+ weight%10;
        birthDate=LocalDate.of(1980, 11, 30);
        weight=(int)(Math.random()*(100+1)+1);
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getSum() {
        return weight+age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", weight=" + weight +
                '}'+"\n";
    }
}



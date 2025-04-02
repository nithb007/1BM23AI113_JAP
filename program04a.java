import java.util.Scanner;
public class program04a {
    public enum dayofweek{
        monday,
        tuesday,
        wednesday,
        thursday,
        friday,
        saturday,
        sunday;

        public boolean workday(){
            return(this!=saturday && this!=sunday);
        }

    }
    public static void main(String[]args){
        System.out.println("Is monday a working day?"+dayofweek.monday.workday());
        System.out.println("Is tuesday a working day?"+dayofweek.tuesday.workday());
        System.out.println("Is wednesday a working day?"+dayofweek.wednesday.workday());
        System.out.println("Is thursday a working day?"+dayofweek.thursday.workday());
        System.out.println("Is friday a working day?"+dayofweek.friday.workday());
        System.out.println("Is saturday a working day?"+dayofweek.saturday.workday());
        System.out.println("Is sunday a working day?"+dayofweek.sunday.workday());


    }
}


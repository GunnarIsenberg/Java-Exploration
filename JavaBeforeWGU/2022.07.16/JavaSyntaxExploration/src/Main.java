import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String firstName = getItemFromConsole("First Name", sc);
        String lastName = getItemFromConsole("Last Name", sc);

        System.out.println(firstName + lastName);

        printSeveralNumbers(100);

        sc.close();
    }

    public static String getItemFromConsole(String wanted, Scanner reader){

        System.out.println("Please enter your " + wanted + "");

        String toReturn = reader.next();
        System.out.println(toReturn);

        return toReturn;
    }

    public static void printSeveralNumbers(int countTo){
        int index = 0;
        for(int x = 0; x < countTo; x += 1){
            index++;
            System.out.println(index);
        }
    }

}
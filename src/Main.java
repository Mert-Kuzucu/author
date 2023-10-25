
import java.util.ArrayList;
import java.util.Scanner;
public class Main {



    public static void main(String[] args) {
        arrLEX();
    }
    private static void arrLEX(){
        Scanner scan = new Scanner(System.in);
        ArrayList<Author> aut = new ArrayList<Author>();
        for (int i = 0; i < 4; i++){
            System.out.println("Write a name");
            String name = scan.nextLine();

            System.out.println("Whats the e-mail?");
            String email = scan.nextLine();
            System.out.println("Write the gender M or F");
            char gender = scan.nextLine().charAt(0);
            Author au = new Author(name,email, gender);
            aut.add(au);
        }
        System.out.println("Write the author you would like to work with" +
                "");
        for (int i = 0; i < 4; i++){
            Author au = aut.get(i);
            System.out.println(au.getName() +", "+au.getEmail() +","+ au.getGender());
        }
    }

}
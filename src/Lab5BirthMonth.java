import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Lab5BirthMonth {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        // new scanner, estblish birthmonth as int as any other designation doesent make sense

        System.out.print("Enter the your birth month number: ");
        birthMonth = in.nextInt();
        // set up scanner for user input



        if (birthMonth > 0){
            if (birthMonth <= 12){
                System.out.println("Your birth month is: " + birthMonth);
            }
            else{
                System.out.println("Your input is invalid");
        }
        }
        else{
            System.out.println("Your input is invalid");
        }
        // nested loop used to keep the range between 1 and 12

    }
}
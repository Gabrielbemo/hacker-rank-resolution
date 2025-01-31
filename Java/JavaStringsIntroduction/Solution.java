package JavaStringsIntroduction;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner  =new Scanner(System.in);
        String myFirstString = scanner.nextLine();
        String mySecondString = scanner.nextLine();
        scanner.close();

        int quantity = 0;

        quantity = myFirstString.length() + mySecondString.length();
        System.out.println(quantity);

        if(myFirstString.compareTo(mySecondString) > 0){
            System.out.println("Yes");
        }else if (myFirstString.compareTo(mySecondString) < 0){
            System.out.println("No");
        }else{
            System.out.println("No");
        }

        myFirstString = myFirstString.substring(0, 1).toUpperCase() + myFirstString.substring(1);
        mySecondString = mySecondString.substring(0, 1).toUpperCase() + mySecondString.substring(1);

        System.out.println(myFirstString + " " +  mySecondString);
    }
}

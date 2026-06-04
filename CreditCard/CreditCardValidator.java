import java.util.Scanner;

public class CreditCardValidator {
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter card details to verify: ");
        String card = scanner.nextLine();

        System.out.println("Enter Credit Card Type: ");
        String cardType = scanner.nextLine();

        System.out.println("Enter Credit Card Number: ");
        int cardNumber = scanner.nextInt();
    
        System.out.println("Credit Card Digit Length: ");
        int cardLength = scanner.nextInt();

        System.out.println("Credit Card Validity Status: ");
        String cardStatus = scanner.nextInt();

    
    public static String getCardType(String cardNumber){

        if(cardNumber.startsWith("4")){
            return "Visa";
        }

        if(cardNumber.startsWith("5")){
            return "MasterCard";
        }

        if(cardNumber.startsWith("37")){
            return "American Express";
        }

        if(cardNumber.startsWith("6")){
            return "Discover";
        }

        return "Unknown";
    }

     public static boolean isValidLength(int cardNumber){

        int length = cardNumber.length();

        if(length >= 13 && length <= 16){

            return true;
        }

        return false;
    }


    public static int cardValidity(String cardNumber){
     
    int length = cardNumber.length();
    for (int counter = length - 1; counter >= 0; counter--) {



}















}
    }

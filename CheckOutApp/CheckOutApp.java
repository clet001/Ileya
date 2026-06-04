import java.util.Scanner;
import java.util.ArrayList;

public class CheckOutApp{
    public static void main(String... args) {

        Scanner input = new Scanner(System.in);
        
        String cashiersName;
        String customersName;
        int discount = 0;

        ArrayList<String> nameOfGoods = new ArrayList<>();
        ArrayList<Integer> quantitiesOfGoods = new ArrayList<>();
        ArrayList<Float> pricesOfGoods = new ArrayList<>();

        System.out.print("What is customer's name: ");
        customersName = input.nextLine();

        while (true) {
            System.out.print("What did the user buy: ");
            String productBought = input.nextLine();
            nameOfGoods.add(productBought);

            System.out.print("How many pieces: ");
            int numbersOfProduct = input.nextInt();
            quantitiesOfGoods.add(numbersOfProduct);

            System.out.print("How much per unit: ");
            float priceOfProduct = input.nextFloat();
            pricesOfGoods.add(priceOfProduct);    

            input.nextLine(); 
            System.out.print("Add more items (yes/no): ");
            String addItem = input.nextLine();

            if (addItem.equalsIgnoreCase("no")) break;
        }

        System.out.print("How much discount: ");
        discount = input.nextInt(); 
        
        input.nextLine(); 
        
        System.out.print("What is your name: ");
        cashiersName = input.nextLine();

        
        double subTotal = 0;
        for (int count = 0; count < nameOfGoods.size(); count++) {
            
            subTotal += quantitiesOfGoods.get(count) * pricesOfGoods.get(count);
        }
        System.out.println("Subtotal: " + subTotal);
        
        
        double vat = subTotal * 0.175; 
        System.out.println("VAT: " + vat);
        
        double billTotal = (subTotal - discount) + vat;
        System.out.println("Bill Total: " + billTotal);
    }
}


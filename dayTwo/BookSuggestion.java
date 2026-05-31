import java.util.Scanner;
import java.util.Random;

public class BookSuggestion{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        String[] books = {"The Hobbit", "Animal Farm", "The Mystery"};

        String menu = """

            ....WELCOME TO BOOK SUGGESTION APP.....

            Enter 1 - showBooks
            Enter 2 - addBook
            Enter 3 - removeBook
            Enter 4 - updateBook
            Enter 5 - suggestBook
            Enter 0 - cancelOption

            """;

        System.out.println(menu);
        System.out.println("Enter Option");

        int option = inputCollector.nextInt();
        

        switch(option){

            case 1:

                System.out.println("showBooks");
                System.out.println("Available Books");

                for(int count = 0; count < books.length; count++){
                    System.out.println(books[count]);
                }

                break;

            case 2:

                System.out.println("addBook");

                System.out.println("Enter Book Title ");

                String newBook = inputCollector.nextLine();

                boolean found = false;

                for(int count = 0; count < books.length; count++){

                    if(books[count].equalsIgnoreCase(newBook)){
                        found = true;
                    }

                }

                if(found){
                    System.out.println("Book already exists");
                }
                else{
                    System.out.println("Book added successfully");
                }

                break;

            case 3:

                System.out.println("removeBooks");

                System.out.println("To delete, enter title: ");

                String removeBook = inputCollector.nextLine();

                boolean removed = false;

                for(int count = 0; count < books.length; count++){

                    if(books[count].equalsIgnoreCase(removeBook)){

                        books[count] = "";

                        removed = true;
                    }

                }

                if(removed){
                    System.out.println("Book removed successfully");
                }
                else{
                    System.out.println("Book not found");
                }

                break;

            case 4:

                System.out.println("updateBook");

                System.out.println("Enter Old Title");

                String oldTitle = inputCollector.nextLine();

                System.out.println("Enter New Title");

                String newTitle = inputCollector.nextLine();

                boolean updated = false;

                for(int count = 0; count < books.length; count++){

                    if(books[count].equalsIgnoreCase(oldTitle)){

                        books[count] = newTitle;

                        updated = true;
                    }

                }

                if(updated){
                    System.out.println("Book updated successfully");
                }
                else{
                    System.out.println("Book not found");
                }

                break;

            case 5:

                System.out.println("suggestBook");

                Random rand = new Random();

                int randomIndex = rand.nextInt(books.length);

                int randomPage = rand.nextInt(100) + 1;

                System.out.println("Book Title: " + books[randomIndex]);
                System.out.println("Page: " + randomPage);

                break;

            

        }

    }

}

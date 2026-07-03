package Library;

import java.util.Scanner;

public class Borrow {

    Scanner input = new Scanner(System.in);

    public void borrowBook() {

        System.out.print("Enter Book ID: ");
        String id = input.nextLine();

        for (Book b : BookManager.books) {

            if (b.getBookId().equals(id)) {

                if (b.isAvailable()) {

                    b.setAvailable(false);

                    System.out.println("Book borrowed successfully.");

                } else {

                    System.out.println("Sorry, this book is already borrowed.");

                }

                return;
            }
        }

        System.out.println("Book not found.");
    }

}
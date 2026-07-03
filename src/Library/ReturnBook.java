package Library;

import java.util.Scanner;

public class ReturnBook {

    Scanner input = new Scanner(System.in);

    public void returnBook() {

        System.out.print("Enter Book ID: ");
        String id = input.nextLine();

        for (Book b : BookManager.books) {

            if (b.getBookId().equals(id)) {

                if (!b.isAvailable()) {

                    b.setAvailable(true);

                    System.out.println("Book returned successfully.");

                } else {

                    System.out.println("This book was not borrowed.");

                }

                return;
            }

        }

        System.out.println("Book not found.");

    }

}
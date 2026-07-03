package Library;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Library library = new Library("KCA UNIVERSITY");

        User user = new User();

        Login login = new Login();

        BookManager book = new BookManager();

        Borrow borrow = new Borrow();

        ReturnBook ret = new ReturnBook();

        Report report = new Report();

        int choice;

        do {

            library.displayWelcome();

            System.out.println("1. Register Student");
            System.out.println("2. Login");
            System.out.println("3. Add Book");
            System.out.println("4. Display Books");
            System.out.println("5. Search Book");
            System.out.println("6. Update Book");
            System.out.println("7. Delete Book");
            System.out.println("8. Borrow Book");
            System.out.println("9. Return Book");
            System.out.println("10. View Student");
            System.out.println("11. Update Student");
            System.out.println("12. Library Report");
            System.out.println("13. Exit");

            System.out.print("\nEnter Choice: ");

            choice = input.nextInt();

            input.nextLine();

            switch(choice) {

            case 1:
                user.registerStudent();
                break;

            case 2:
                login.login();
                break;

            case 3:
                book.addBook();
                break;

            case 4:
                book.displayBooks();
                break;

            case 5:
                book.searchBook();
                break;

            case 6:
                book.updateBook();
                break;

            case 7:
                book.deleteBook();
                break;

            case 8:
                borrow.borrowBook();
                break;

            case 9:
                ret.returnBook();
                break;

            case 10:
                user.viewStudent();
                break;

            case 11:
                user.updateStudent();
                break;

            case 12:
                report.generateReport();
                break;

            case 13:
                System.out.println("Thank you for using the Library Management System.");
                break;

            default:
                System.out.println("Invalid choice.");

            }

        } while(choice != 13);

        input.close();

    }

}
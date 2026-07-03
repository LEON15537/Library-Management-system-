package Library;

public class Report {

    public void generateReport() {

        System.out.println("\n========== LIBRARY REPORT ==========");

        System.out.println("Total Students : " + User.students.size());

        System.out.println("Total Books    : " + BookManager.books.size());

        int borrowed = 0;

        for (Book b : BookManager.books) {

            if (!b.isAvailable()) {

                borrowed++;

            }

        }

        System.out.println("Borrowed Books : " + borrowed);

        System.out.println("Available Books: " + (BookManager.books.size() - borrowed));

        System.out.println("====================================");

    }

}

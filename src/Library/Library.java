package Library;

public class Library {

    private String libraryName;

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    public void displayWelcome() {

        System.out.println("======================================");
        System.out.println("     " + libraryName);
        System.out.println("   LIBRARY MANAGEMENT SYSTEM");
        System.out.println("======================================");
    }
}
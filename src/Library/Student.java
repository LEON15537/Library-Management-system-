package Library;

public class Student {

    private String studentId;
    private String name;
    private String course;
    private String phone;
    private String username;
    private String password;

    // Constructor
    public Student(String studentId, String name, String course, String phone,
                   String username, String password) {

        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.phone = phone;
        this.username = username;
        this.password = password;
    }

    // Getters
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public String getPhone() {
        return phone;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Display Student Profile
    public void displayProfile() {

        System.out.println("\n==============================");
        System.out.println("      STUDENT PROFILE");
        System.out.println("==============================");
        System.out.println("Student ID : " + studentId);
        System.out.println("Name       : " + name);
        System.out.println("Course     : " + course);
        System.out.println("Phone      : " + phone);
        System.out.println("Username   : " + username);
        System.out.println("==============================");
    }

}

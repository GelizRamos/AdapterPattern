package school;

public class Main {
    public static void main(String[] args) {
        AttendanceSystem attendance = new AttendanceSystem();
        GradingSystem grading = new GradingSystem();
        LibrarySystem library = new LibrarySystem();

        SchoolManagementApp adapter1 = new AttendanceSystemAdapter(attendance);
        SchoolManagementApp adapter2 = new GradingSystemAdapter(grading);
        SchoolManagementApp adapter3 = new LibrarySystemAdapter(library);

        adapter1.integrateSystem();
        adapter2.integrateSystem();
        adapter3.integrateSystem();
    }
}
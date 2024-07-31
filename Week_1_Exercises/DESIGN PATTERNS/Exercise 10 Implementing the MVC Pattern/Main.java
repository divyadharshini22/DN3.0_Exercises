public class Main {
    public static void main(String[] args) {
        // Create a model
        Student student = new Student("1", "John Doe", "A");

        // Create a view
        StudentView view = new StudentView();

        // Create a controller
        StudentController controller = new StudentController(student, view);

        // Display initial details
        controller.updateView();

        // Update student details
        controller.setStudentName("Jane Doe");
        controller.setStudentGrade("B");

        // Display updated details
        controller.updateView();
    }
}

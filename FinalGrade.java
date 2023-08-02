import javax.swing.JOptionPane;

public class FinalGrade {
    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            String studentName = JOptionPane.showInputDialog("Enter the student's name:");

            Assignment[] assignments = new Assignment[10];
            int assignmentCount = 0;

            while (assignmentCount < 10) {
                String assignmentName = JOptionPane.showInputDialog("Enter assignment name or type 'exit' to finish: ");
                if (assignmentName.equalsIgnoreCase("exit")) {
                    break;
                }

                double assignmentScore = Double.parseDouble(JOptionPane.showInputDialog("Enter the score for " + assignmentName + ":"));
                assignmentCount++;
                assignments[assignmentCount] = new Assignment(assignmentName, assignmentScore);
                
            }

            Student student = new Student(studentName, assignments);
            JOptionPane.showMessageDialog(null, student.toString());

            String input = JOptionPane.showInputDialog("Enter 'exit' to finish or press Enter to continue:");
            if (input.equalsIgnoreCase("exit")) {
                exit = true;
            }
        }
    }
}
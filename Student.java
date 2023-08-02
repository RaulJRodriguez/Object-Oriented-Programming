public class Student {
    private String name;
    private Grade finalGrade;

    public Student(String name, Assignment[] assignments) {
        this.name = name;
        double average = calculateAverage(assignments);
        this.finalGrade = new Grade(average);
    }
   
   
    private double calculateAverage(Assignment[] assignments) {
        double sum = 0.0;
        int count = 0;
        for (Assignment assignment : assignments) {
         if (assignment != null){ 
            sum += assignment.getMeasure();
            count++;
          }
        }
       //if the user doesnt create 10 assignments, it would still return average
       if (count > 0){
        return sum / count;
      } else{
      return 0.0;
      }
    }

    public String toString() {
        return name + ": " + finalGrade.toString();
    }
}
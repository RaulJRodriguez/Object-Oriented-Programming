public class Grade {
    private double numericalScore;
    private char letterGrade;

    public Grade(double numericalScore) {
        this.numericalScore = numericalScore;
        setLetterGrade();
    }

    private void setLetterGrade() {
        if (numericalScore < 60) {
            letterGrade = 'F';
        } else if (numericalScore < 70) {
            letterGrade = 'D';
        } else if (numericalScore < 80) {
            letterGrade = 'C';
        } else if (numericalScore < 90) {
            letterGrade = 'B';
        } else {
            letterGrade = 'A';
        }
    }

    public String toString() {
        return numericalScore + " (" + letterGrade + ")";
    }
}
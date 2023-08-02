public class Assignment implements Measurable {
    private String name;
    private double score;

    public Assignment(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public double getMeasure() {
        return score;
    }
}
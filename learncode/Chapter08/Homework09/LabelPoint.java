package learncode.Chapter08.Homework09;

public class LabelPoint extends Point {
    private String label;

    public LabelPoint(double x, double y, String label) {
        super(x, y);
        this.label = label;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.print(" label： " + label);
    }

    public String getLabel() {
        return label;
    }
}

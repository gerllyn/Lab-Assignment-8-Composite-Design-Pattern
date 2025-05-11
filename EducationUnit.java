public abstract class EducationUnit {
    protected String name;

    public EducationUnit(String name) {
        this.name = name;
    }

    public abstract void displayDetails();
    public abstract int getStudentCount();
    public abstract double getBudget();
}

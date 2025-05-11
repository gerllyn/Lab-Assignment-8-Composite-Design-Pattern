import java.util.ArrayList;
import java.util.List;
public class Department extends EducationUnit {
    private List<EducationUnit> components = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    public void add(EducationUnit unit) {
        components.add(unit);
    }

    public void remove(EducationUnit unit) {
        components.remove(unit);
    }

    @Override
    public void displayDetails() {
        System.out.println("  Department: " + name);
        for (EducationUnit unit : components) {
            unit.displayDetails();
        }
    }

    @Override
    public int getStudentCount() {
        int count = 0;
        for (EducationUnit unit : components) {
            count += unit.getStudentCount();
        }
        return count;
    }

    @Override
    public double getBudget() {
        double total = 0;
        for (EducationUnit unit : components) {
            total += unit.getBudget();
        }
        return total;
    }
}

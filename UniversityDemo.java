public class UniversityDemo {
    public static void main(String[] args) {
        College mainCollege = new College("New Era University");

        College engCollege = new College("College of Informatics in Computing Studies");
        Department csDept = new Department("Department of Computer Science");

        Teacher t1 = new Teacher("Prof. Reyes", "OOP", 50000);
        Teacher t2 = new Teacher("Prof. Santos", "Data Structures", 55000);

        Student s1 = new Student("Alice", "20-12543-461", 30000);
        Student s2 = new Student("Bob", "23-34521-164", 30000);

        csDept.add(t1);
        csDept.add(t2);
        csDept.add(s1);
        csDept.add(s2);

        engCollege.add(csDept);

        mainCollege.add(engCollege);

        mainCollege.displayDetails();

        System.out.println("\nTotal Students: " + mainCollege.getStudentCount());
        System.out.println("Total Budget: $" + mainCollege.getBudget());
    }
}

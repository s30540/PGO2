import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Sebastian", "Stokowski", "s30540",
                "s30540@pjwstk.edu.pl", "address", List.of(3.0, 5.0));
        StudentGroup group = new StudentGroup("11", List.of(student1));
        System.out.printf(student1.calculateMean().toString());
        Student student2 = new Student("Sebastian", "Stokowski", "s30540",
                "s30540@pjwstk.edu.pl", "address", List.of(3.0, 5.0));
    }
}
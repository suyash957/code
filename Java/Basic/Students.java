class Students {
    private String name;
    private int prn;
    private double GPA;

    // Default constructor
    public Students() {
        this.name = "Not Set";
        this.prn = 0;
        this.GPA = 0.0;
    }

    // Parameterized constructor
    public Students(String name, int prn, double GPA) {
        this.name = name;
        this.prn = prn;
        this.GPA = GPA;
    }

    // Copy constructor
    public Students(Student other) {
        this.name = other.name;
        this.prn = other.prn;
        this.GPA = other.GPA;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrn() {
        return prn;
    }

    public void setPrn(int prn) {
        this.prn = prn;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", prn=" + prn +
                ", GPA=" + GPA +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // Default constructor
        Student defaultStudent = new Students();
        System.out.println(defaultStudent);

        // Parameterized constructor
        Student parameterizedStudent = new Students("Shreyas", 12345, 3.5);
        System.out.println(parameterizedStudent);

        // Copy constructor
        Student copyStudent = new Students(parameterizedStudent);
        System.out.println(copyStudent);
    }
}

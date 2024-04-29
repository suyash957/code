import java.util.*;

class Student {
    private int rollNumber;
    private String name;
    private String gender;

    public Student(int rollNumber, String name, String gender) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.gender = gender;
    }
    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }
}

public class StudentOperations {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", "Female");
        Student s2 = new Student(102, "Bob", "Male");
        Student s3 = new Student(103, "Charlie", "Male");

        List<Student> arrayList = new ArrayList<>();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);

        List<Student> linkedList = new LinkedList<>(arrayList);

        Deque<Student> arrayDeque = new ArrayDeque<>(arrayList);

        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(arrayList.size(), Comparator.comparing(Student::getName));

        Set<Student> hashSet = new HashSet<>(arrayList);

        Set<Student> treeSet = new TreeSet<>(Comparator.comparing(Student::getName));
        treeSet.addAll(arrayList);

        Map<Integer, Student> hashMap = new HashMap<>();
        for (Student student : arrayList) {
            hashMap.put(student.getRollNumber(), student);
        }

        Map<Integer, Student> linkedHashMap = new LinkedHashMap<>();
        for (Student student : arrayList) {
            linkedHashMap.put(student.getRollNumber(), student);
        }

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
        System.out.println("ArrayDeque: " + arrayDeque);
        System.out.println("PriorityQueue: " + priorityQueue);
        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);
        System.out.println("HashMap: " + hashMap);
        System.out.println("LinkedHashMap: " + linkedHashMap);
    }
}

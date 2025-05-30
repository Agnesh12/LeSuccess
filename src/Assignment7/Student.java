package Assignment7;

public class Student {
    int rollNo;
    String name;


    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }


    public Student(int rollNo) {
        this.rollNo = rollNo;
        this.name = "Unknown";
    }

    public void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice");
        Student s2 = new Student(102);

        s1.display();
        s2.display();
    }
}

class Student {
    int rollno;
    String name;
    int age;
    String gender;

static int totalStudent = 0;
    static int totalAge = 0;
    void getData(int r, String n, int a, String g) {
        rollno = r;
        name = n;
        age = a;
        gender = g;
        totalStudent++;
        totalAge += age;
    }
    void dispData() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("----------------------");
    }
    static double averageAge() {
        return (double) totalAge / totalStudent;
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getData(1, "ajay", 20, "Male");
        Student s2 = new Student();
        s2.getData(2, "Akash", 22, "Female");
        Student s3 = new Student();
        s3.getData(3, "Rahul", 21, "Male");
        s1.dispData();
        s2.dispData();
        s3.dispData();
        System.out.println("Total students: " + Student.totalStudent);
        System.out.println("Average age: " + Student.averageAge());
    }
}
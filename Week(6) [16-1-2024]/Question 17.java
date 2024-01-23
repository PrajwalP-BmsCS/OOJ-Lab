import java.util.Scanner;
class Student{
    int regNo;
    String fName;
    short sem;
    float cgpa;
   
    Student(){
        this.regNo = 0;
        this.fName = "Nil";
        this.sem = 1;
        this.cgpa = 0;
    }
   
    Student(int regNo, String fName, short sem, float cgpa){
        this.regNo = regNo;
        this.fName = fName;
        this.sem = sem;
        this.cgpa = cgpa;
    }
   
    void display(){
        System.out.print("Register Number: " + regNo);
        System.out.print("Full Name: " + fName);
        System.out.print("Semester: " + sem);
        System.out.print("CGPA: " + cgpa);
    }
}

class Main{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] records = new Student[5];
        for(int i = 0; i < 5; i++){
            int no;
            String name;
            short sem;
            float cgpa;
            System.out.println("Enter name: ");
            name = sc.next();
            System.out.println("Enter reg no: ");
            no = sc.nextInt();
            System.out.println("Enter sem: ");
            sem = sc.nextShort();
            System.out.println("Enter cgpa: ");
            cgpa = sc.nextFloat();
            records[i] = new Student(no, name, sem, cgpa);
        }
       
        for (Student student : records) {
            student.display();
            System.out.println();
        }
    }
}

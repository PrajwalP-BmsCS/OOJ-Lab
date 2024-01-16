import java.util.Scanner;
class Student{
   String name;
   int reg_no;
   short sem;
   float cgpa;
   
   Student(){
       this.reg_no=0;
       this.name="Invalid";
       this.sem=0;
       this.cgpa=0;
   }
   
   Student(String name,int reg_no,short sem,float cgpa){
       this.reg_no=reg_no;
       this.name=name;
       this.sem=sem;
       this.cgpa=cgpa;
   }
   
   void display(){
       System.out.println("Registration Number: " + reg_no);
        System.out.println("Full Name: " + name);
        System.out.println("Semester: " + sem);
        System.out.println("CGPA: " + cgpa);
        System.out.println();
   }
}
class Main{
    static Student s[]=new Student[5];
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name;
        int reg_no;
        short sem;
        float cgpa;
        for(int i=0;i<1;i++){
            System.out.println("Enter details of "+(i+1)+" student in order\nName\nRegister Number\nSemester\nCGPA");
            name=sc.nextLine();
            reg_no=sc.nextInt();
            sem=sc.nextShort();
            cgpa=sc.nextFloat();
            s[i]=new Student(name,reg_no,sem,cgpa);
        }
        
        for(int i=0;i<5;i++){
            s[i].display();  
        }
        
    }
    
    public static void sortC(Student s[]){
        String cgpa[]=new String[5];
        for(int i=0;i<1;i++){
            cgpa[i]=Float.toString(s[i].cgpa);
        }
        System.out.println(cgpa);
    }
}

import java.util.Scanner;
class WrongAge extends Exception {
    public WrongAge(String e) {
        super(e);
    }
}

// Base class
class Father {
    private int age;

    // Constructor in Father class
    public Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Age cant be less than 0");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

// Derived class
class Son extends Father {
    private int sonAge;

    // Constructor in Son class
    public Son(int fatherAge, int sonAge) throws WrongAge {
        super(fatherAge);

        if (sonAge >= fatherAge) {
            throw new WrongAge("Son's age cant be more than Father's age");
        }

        if(sonAge<0){
            throw new WrongAge("Age cant be negative");
        }
        this.sonAge = sonAge;
    }

    public int getSonAge() {
        return sonAge;
    }
}

public class ExceptionInheritanceDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Fage,Sage;
        try {
            System.out.println("Enter Father's age: ");
            Fage=sc.nextInt();
            Father father = new Father(Fage);
            
            System.out.println("Enter Son's age: ");
            Sage=sc.nextInt();
            Son son = new Son(Fage,Sage);
            
            System.out.println("Father's age: "+father.getAge()+"\nSon's Age: "+son.getSonAge());
        } catch (WrongAge e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

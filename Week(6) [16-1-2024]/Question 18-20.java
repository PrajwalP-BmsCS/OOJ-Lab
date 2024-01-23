18.
public class Main {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
       
        System.out.println("Length: " + stringBuffer.length());
        stringBuffer.setLength(3);
        System.out.println("Length: " + stringBuffer.length());
        stringBuffer = new StringBuffer("Hello");
       
        char c = stringBuffer.charAt(1);
        System.out.println("Character at index 1: " + c);
       
        stringBuffer.setCharAt(1, 'a');
        System.out.println("Updated string: " + stringBuffer);
       
        char[] chars = new char[3];
        stringBuffer.getChars(1, 4, chars, 0);
        System.out.print("Extracted characters: ");
        for (char ch : chars) {
            System.out.print(ch + " ");
        }
        System.out.println();
       
        stringBuffer.append(" World");
        System.out.println("Appended string: " + stringBuffer);
       
        stringBuffer.insert(6, "Java ");
        System.out.println("Inserted string: " + stringBuffer);
       
        stringBuffer.reverse();
        System.out.println("Reversed string: " + stringBuffer);
       
        stringBuffer.delete(5, 9);
        System.out.println("Deleted string: " + stringBuffer);
       
        stringBuffer.deleteCharAt(0);
        System.out.println("Deleted character: " + stringBuffer);
       
        stringBuffer.replace(2, 5, "llo");
        System.out.println("Replaced string: " + stringBuffer);
       
        String substring = stringBuffer.substring(1, 4);
        System.out.println("Substring: " + substring);
    }
}

19.
abstract class Bird {
    public abstract void fly();
   
    public abstract void makeSound();
}

class Eagle extends Bird {
    public void fly() {
        System.out.println("Eagle flies high in the sky");
    }
   
    public void makeSound() {
        System.out.println("Eagle makes screeching sound");
    }
}

class Hawk extends Bird {
    public void fly() {
        System.out.println("Hawk flies fast and agile");
    }
   
    public void makeSound() {
        System.out.println("Hawk makes high-pitched sound");
    }
}

public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.fly();
        eagle.makeSound();
       
        Hawk hawk = new Hawk();
        hawk.fly();
        hawk.makeSound();
    }
}

20.
abstract class Shape {
    public abstract double calculateArea();
   
    public abstract double calculatePerimeter();
}

class Circle extends Shape {
    private double radius;
   
    public Circle(double radius) {
        this.radius = radius;
    }
   
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
   
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;
   
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
   
    public double calculateArea() {
        return 0.5 * base * height;
    }
   
    public double calculatePerimeter() {
        return base + (2 * Math.sqrt(Math.pow((base / 2), 2) + Math.pow(height, 2)));
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
       
        Triangle triangle = new Triangle(4, 6);
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}

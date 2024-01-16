class Main{
    public static void main(String args[]){
        
        //Q1
        String string = "Hello";
        System.out.println(string);
        
        String literalString = new String("Hello World");
        System.out.println(literalString);
        
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String charArrayString = new String(charArray);
        System.out.println(charArrayString);
        
        byte[] byteArray = {72, 101, 108, 108, 111};
        String byteArrayString = new String(byteArray);
        System.out.println(byteArrayString); 
        
        String charArrayString1 = new String(charArray,2,3);
        System.out.println(charArrayString1);
        
        //Q2
        System.out.println(string.length());
        
        System.out.println(string+literalString);
        
        //Q3
        int q=10;
        int u=20;
        System.out.println(toString(q,u));
        
       //Q4
       char get[]=new char[3-0];
       literalString.getChars(0,3,get,0);
       System.out.println(get);
       
       //Q5
       byte gex[]=literalString.getBytes();
       for(byte b : gex)
       System.out.print(b+ " ");
       System.out.println();
       
       char g[]=literalString.toCharArray();
       for(char b : g)
       System.out.print(b+ " ");
       System.out.println();
       
       
       //Q6
       String a="Bmsce";
       String b="Bmsce";
       String c="College";
       String d="BMSCE";
       System.out.println(a.equals(b));
       System.out.println(a.equals(c));
       System.out.println(a.equals(d));
       System.out.println(a.equalsIgnoreCase(d));
       
       //Q7
       String str = "Welcome to Bmsce College of Engineering";
        String substring = "Bmsce college";

        if (str.regionMatches(11, substring, 0, substring.length())) {
            System.out.println("Substring is matched");
        } else {
            System.out.println("Substring is not matched");
        }
        
        //Q8
        String str1 = "Hello World";

        System.out.println(str1.startsWith("Hello")); // true
        System.out.println(str1.startsWith("World")); // false
        
        //Q9
        String str2 = "Hello World";

        System.out.println(str2.endsWith("World")); // true
        System.out.println(str2.endsWith("Hello")); // false
        
        //Q10
        String str3 = new String("Hello");
        String str4 = new String("Hello");
        String str5 = str3;

        System.out.println(str3.equals(str4)); // true
        System.out.println(str3 == str4); // false
        System.out.println(str3 == str5); // true
    }
    public static String toString(int a,int b){
        return "String"+a+b;
    }
}

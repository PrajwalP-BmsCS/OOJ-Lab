class Main{
    public static void main(String args[]){
    //Q11
         String[] arr = {"van", "watch", "ball", "cat", "xmas", "yatch", "zee",
                "apple", "ice", "jug", "kite", "lift", "man", "net", "orange",
                "dog", "ent", "free", "gun", "hen", "parrot", "queen", "ring",
                "star", "tree", "umbrella"};                
        for(int j = 0; j < arr.length; j++) {
        for(int i = j + 1; i < arr.length; i++) {
        if(arr[i].compareTo(arr[j]) < 0) {
            String t = arr[j];
            arr[j] = arr[i]; arr[i] = t;
            
        }
    } System.out.println(arr[j]); }
    
    //Q12
       String[] arr1 = {"1","2","3","4","5","6","7","8","9"};                
        for(int j = 0; j < arr1.length; j++) {
        for(int i = j + 1; i < arr1.length; i++) {
        if(arr1[i].compareTo(arr1[j]) < 0) {
            String u = arr1[j];
            arr1[j] = arr1[i]; arr1[i] = u;
            
        }
    } System.out.println(arr1[j]); }   
    
    //Q13
    
    String org = "Thwas was a test. Thwas was, too.";
    String search = "was";
    String sub = "is";
    String result = "";
    int i;

    do { // replace all matching substrings
    i = org.indexOf(search);
    if(i != -1) {
    result = org.substring(0, i);
    result = result + sub;
    result = result + org.substring(i + search.length());
    org = result;
    }
    } while(i != -1);
    System.out.println(org);
    }
    
    //Q14
    
    String s1 = "hello";
    String s2 = "world";

    String z = s1.concat(s2);
    System.out.println(z);

     //Q15
    String str = "Welcome to Bmsce College";

        String replacedString = str.replace("College", "Commege");
        System.out.println(replacedString);

    //Q16
    String str1= " Hello Friends ";

        String trimmedString = str1.trim();
        System.out.println(trimmedString);
    }

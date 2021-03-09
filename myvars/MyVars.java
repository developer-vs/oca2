package myvars;

class MyVars {

    int x1;
    static String x2;

    public static void main(String[] args) {

        //int x1;
        // error: variable x might not have been initialized
        // to call x1 we need to do inizialization
        // System.out.println(x1);

        // non-static variable x1 cannot be referenced 
        // from a static context
        // System.out.println(x1);

        System.out.println(x2); // null
        x2 = "Hello";
        
        int x;
        // error: variable x might not have been initialized
        // System.out.println(x); 

        System.out.println(speak()); // hello


        MyVars myvars = new MyVars();
        System.out.println(myvars.x1); // 0

        // error: we can't call method with void' type
        // System.out.println(myvars.speak2());

        System.out.println(myvars.speak3()); // speack3: 0

        // error: non-static method speak3() cannot be 
        // referenced from a static context
        // speak3();
    }

    public static String speak() {
        String s1 = "Hi";
        String s2;
        
        String s3;
        // error: variable x might not have been initialized
        // return s3;

        // non-static variable x1 cannot be referenced 
        // from a static context
        // System.out.println(x1);

        return x2;
    }

    public void speak2() {
        System.out.println("speack2: " + x1);
    }

    public String speak3() {
        int i;
        // error: variable i might not have been initialized
        // System.out.println(i);
        return "speack3: " + x1;
    }
}
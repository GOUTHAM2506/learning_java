class A {
    void m3() {

    }
}

class Example extends A{
    void m1() {
        System.out.println("I am m1");
    }

    void m2() {
        System.out.println("I am m2");
    }
    
    public static void main(String[] args) {
        System.out.println("Hello world");
        Example ob1 = new Example();
        ob1.m1();
        ob1.m2();
    }
}
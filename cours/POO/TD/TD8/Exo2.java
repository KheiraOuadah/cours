
class A {
    public String f(B obj) { return ("A et B");}
    public String f(A obj) { return ("A et A");}
}

class B extends A {
    public String f(B obj) { return ("B et B");}
    public String f(A obj) { return ("B et A");}
}
        
class test {
    public static void main (String [] args){
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        System.out.println(a1.f(a1)); // -> a1.f(A)
        System.out.println(a1.f(a2)); // -> a1.f(A)
        System.out.println(a2.f(a1)); // -> a2.f(A) B.f(A)
        System.out.println(a2.f(a2)); // -> a2.f(A) B.f(A)
        System.out.println(a2.f(b));  // -> a2.f(B) B.f(B) 
        System.out.println(b.f(a2));  // -> b.f(A)  B.f(A)
    }
}


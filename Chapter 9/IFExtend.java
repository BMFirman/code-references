// one interface can extend another
interface A {
    void meth1();
    void meth2();
}

// B now includes meth1/2(), it adds meth3()
interface B extends A {
    void meth3();
}

// this class must implement all of A or B
class MyClass implements B {
    public void meth1() {
        System.out.println("MyClass.meth1");
    }

    public void meth2() {
        System.out.println("MyClass.meth2");
    }

    public void meth3() {
        System.out.println("MyClass.meth3");
    }
}

class IFExtend {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
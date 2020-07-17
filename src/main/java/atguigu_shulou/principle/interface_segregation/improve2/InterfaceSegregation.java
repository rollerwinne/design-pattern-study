package atguigu_shulou.principle.interface_segregation.improve2;

public class InterfaceSegregation {

    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());
        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());

    }

}

interface Interface1 {
    void operation1();

}

interface Interface2 {
    void operation2();

    void operation3();
}

interface Interface3 {
    void operation4();

    void operation5();
}

interface Interface1and2 extends Interface1, Interface2 {
}

interface Interface1and3 extends Interface1, Interface3 {
}

class B implements Interface1and2 {
    public void operation1() {
        System.out.println("B 实现了 operation1");
    }

    public void operation2() {
        System.out.println("B 实现了 operation2");
    }

    public void operation3() {
        System.out.println("B 实现了 operation3");
    }

}

class D implements Interface1and3 {
    public void operation1() {
        System.out.println("D 实现了 operation1");
    }

    public void operation4() {
        System.out.println("D 实现了 operation4");
    }

    public void operation5() {
        System.out.println("D 实现了 operation5");
    }
}

class A {
    public void depend1(Interface1and2 i) {
        i.operation1();
    }

    public void depend2(Interface1and2 i) {
        i.operation2();
    }

    public void depend3(Interface1and2 i) {
        i.operation3();
    }
}

class C {
    public void depend1(Interface1and3 i) {
        i.operation1();
    }

    public void depend4(Interface1and3 i) {
        i.operation4();
    }

    public void depend5(Interface1and3 i) {
        i.operation5();
    }
}
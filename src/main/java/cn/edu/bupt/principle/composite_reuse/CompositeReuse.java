package cn.edu.bupt.principle.composite_reuse;

public class CompositeReuse {
}

/**
 * 继承
 */
class A1 {
}

class B1 extends A1 {
}

/**
 * 依赖
 */
class A2 {
}

class B2 {
    void oper(A2 a2) {
    }
}

/**
 * 聚合
 */
class A3 {
}

class B3 {
    A3 a3;

    void setA3(A3 a3) {
        this.a3 = a3;
    }
}

/**
 * 组合
 */
class A4 {
}

class B4 {
    A4 a4 = new A4();
}
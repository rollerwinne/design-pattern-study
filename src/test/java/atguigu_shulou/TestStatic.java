package atguigu_shulou;

public class TestStatic {
    public static void main(String[] args) {
        System.out.println(Static1.i);
        System.out.println(Static2.i);
        System.out.println(Static3.i);
        System.out.println(Static4.i);
    }
}

class Static1 {
    static int i = 10;

    static {
        i = 20;
    }
}

class Static2 {
    static {
        i = 20;
    }

    static int i = 10;
}

class Static3 {
    static final int i = 30;

    static {
        System.out.println("static3 code");
    }
}

class Static4 {
    static final int i = new Integer(40);

    static {
        System.out.println("static4 code");
    }
}



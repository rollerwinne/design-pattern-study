package atguigu_shulou;

public class TestSingletonTriple {
    private TestSingletonTriple[] triple = new TestSingletonTriple[]{
        new TestSingletonTriple(0),
        new TestSingletonTriple(1),
        new TestSingletonTriple(2),
    };
    private int id;
    private TestSingletonTriple(int id) {
        System.out.println("The instance " + id + " is created.");
        this.id = id;
    }

    public static void main(String[] args) {
        TestSingletonTriple triple = new TestSingletonTriple(1);
        System.out.println(triple);
    }

}

package atguigu_shulou.principle.dependence_inversion;

public class DependenceInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }

}


class Email {
    public String getInfo() {
        return "电子邮件信息: hello,world";
    }
}

class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}

package ituring_shulou.interpreter;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(new File("").getCanonicalPath()+"/src/main/java/ituring_shulou/interpreter","program.txt")));
            String text;
            while ((text = reader.readLine()) != null) {
                System.out.println("text = \"" + text + "\"");
                Node node = new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node = " + node);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

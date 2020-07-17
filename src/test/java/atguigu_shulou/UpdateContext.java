package atguigu_shulou;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class UpdateContext {
    @Test
    public void updateContext() throws Exception{
        String courseFile = new File("").getCanonicalPath();
        File file1=new File(courseFile+"/资料/目录.txt");
        File file2=new File(courseFile+"/资料/目录2.txt");
        FileReader fileReader=new FileReader(file2);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        PrintWriter printWriter=new PrintWriter(file1);

        String temp;
        int p=0;
        while ((temp=bufferedReader.readLine())!=null){
            //System.out.println(temp);
            temp="P"+String.format("%03d\t",++p)+temp;
            System.out.println(temp);
            printWriter.println(temp);
        }
        bufferedReader.close();
        fileReader.close();
        printWriter.close();
    }
}

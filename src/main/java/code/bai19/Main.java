package code.bai19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {// Note: the file that FileInputStream read is located at root project where the pom.xml located
            //realative path ./ // liux
            //absolute path 'C:/User/' :V
            in = new FileInputStream("src/main/java/code/bai19/input.txt");
            out = new FileOutputStream("src/main/java/code/bai19/output.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            System.out.println("End");
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}

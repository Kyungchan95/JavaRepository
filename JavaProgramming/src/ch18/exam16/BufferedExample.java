package ch18.exam16;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class BufferedExample {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        OutputStream os = new FileOutputStream("src/ch18/exam16/test.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        for (int i = 0; i < 1000; i++) {
            bw.write("장성근");
        }

        bw.flush();
        osw.flush();
        os.flush();

        bw.close();
        osw.close();
        os.close();

    }

}

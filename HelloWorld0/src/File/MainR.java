package File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainR {
    public static void main(String[] args) throws IOException {
        FileReader reader=new FileReader("src//File//b.txt");
        int data=reader.read();
        System.out.print("test= "+(char)data+"\n");
        while (data!=-1){
            System.out.print((char)data);
            data=reader.read();
        }
    }
}

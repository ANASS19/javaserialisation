package File;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter writer=new FileWriter("src//File//b.txt");
        writer.write("anasox is awsom\nhacker life");
        writer.append("\nhello from essaouira");
        writer.close();
    }
}

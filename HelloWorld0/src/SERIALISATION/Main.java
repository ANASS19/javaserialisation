package SERIALISATION;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user =new User();
        user.name="anass";
        user.password="123456ans";

        FileOutputStream fileout=new FileOutputStream("Userinfo.ser");
        ObjectOutputStream out =new ObjectOutputStream(fileout);
        out.writeObject(user);
        out.close();
        fileout.close();
        System.out.println("object info savedd");



        user =null;
        FileInputStream fileIn =new FileInputStream("C:\\Users\\AORUS\\IdeaProjects\\HelloWorld0\\Userinfo.ser");
        ObjectInputStream in =new ObjectInputStream(fileIn);
        user = (User)in.readObject();
        in.close();
        fileIn.close();
        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();
        System.out.println("user readed");
    }
}

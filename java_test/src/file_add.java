import java.io.*;
public class file_add {
    public static void main(String[] args) throws Exception{
        try{
            BufferedWriter out = new BufferedWriter(new FileWriter("filename"));
            out.write("aString1\n");
            out.close();
            out = new BufferedWriter(new FileWriter("filename",true));
            out.write("aSrting2");
            out.close();
            BufferedReader in = new BufferedReader(new FileReader("filename"));
            String str;
            while ((str = in.readLine())!=null){
                System.out.println(str);
            }
            in.close();
        }
        catch (IOException e){
            System.out.println("Execption occoured" + e);
        }
    }
}

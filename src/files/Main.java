package files;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try{
            File f=new File("input.txt");
            FileWriter fr=new FileWriter(f);
            fr.write("Hello world");
            fr.write("\n heelo world");
            fr.close();
            FileReader bfw=new FileReader("input.txt");
            BufferedReader fw=new BufferedReader(bfw);
            String con=null;
            while((con= fw.readLine())!=null){
                System.out.println(con);
            }
            fw.close();
            System.out.println();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

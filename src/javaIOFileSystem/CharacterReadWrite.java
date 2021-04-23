package javaIOFileSystem;

import java.io.*;

public class CharacterReadWrite {
    public static void main(String[] args) {
        try(Reader in = new FileReader("src/javaIOFileSystem/res/otherthing.txt");
            Writer out = new FileWriter("src/javaIOFileSystem/res/everything.txt")){
            char[] buffer = new char[1024];
            int len = 0;
            while((len = in.read(buffer)) != -1) {
                out.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("otherthing.txt file data read and written in everything.txt file");
        }

        System.out.println("2nd Method");

        try(BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(("src/javaIOFileSystem/res/everything.txt"))));
            PrintWriter out = new PrintWriter(new OutputStreamWriter(new FileOutputStream("src/javaIOFileSystem/res/nothing.txt")))){
            String line = null;
            while((line = in.readLine()) != null) {
                out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("everything.txt file data read and written in nothing.txt file");
        }

    }
}

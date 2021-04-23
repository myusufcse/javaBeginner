package javaIOFileSystem;

import java.io.*;

public class BinaryReadWrite {
    public static void main(String[] args) {
        try(InputStream in = new FileInputStream("src/javaIOFileSystem/res/something.txt");
            OutputStream out = new FileOutputStream("src/javaIOFileSystem/res/otherthing.txt")){
            byte[] buffer = new byte[1024];
            int len = 0;
            while((len = in.read(buffer)) != -1) {
                out.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("something.txt file data read and written in otherthing.txt file");
        }
    }
}

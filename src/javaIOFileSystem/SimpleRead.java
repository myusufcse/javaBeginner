package javaIOFileSystem;

import java.io.*;

public class SimpleRead {
    public static void main(String[] args) {
       File file = new File("src/javaIOFileSystem/res/everything.txt");
       System.out.println(file.exists());
       if(file.exists()) {
           try {
               FileInputStream fis = new FileInputStream(file);
               InputStreamReader isr = new InputStreamReader(fis);
               BufferedReader br = new BufferedReader(isr);
               String line = null;
               while((line = br.readLine()) != null) {
                   System.out.println(line);
               }
               br.close();
               isr.close();
               fis.close();
           } catch (IOException e) {
               e.printStackTrace();
           }
       }
    }
}

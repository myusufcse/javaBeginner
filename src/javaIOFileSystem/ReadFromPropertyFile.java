package javaIOFileSystem;

import collection.Users;

import java.io.FileReader;
import java.util.Properties;

public class ReadFromPropertyFile {
    public static void main(String[] args)throws Exception{
        FileReader reader=new FileReader("src/javaIOFileSystem/res/db.properties");

        Properties p=new Properties();
        p.load(reader);

        System.out.println(p.getProperty("tags"));
        System.out.println(p.getProperty("browser"));
        Users user = null;
        switch (p.getProperty("user")) {
            case "QA":
                user = Users.QA;
                break;
            case "TEST":
                user = Users.TEST;
                break;
            case "PROD":
                user = Users.PROD;
                break;
            default:
                user = Users.PROD;
                break;
        }
        System.out.println(user.getPhoneNo());
    }
}

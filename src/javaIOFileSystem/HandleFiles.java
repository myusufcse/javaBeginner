package javaIOFileSystem;

import java.nio.file.*;
import java.util.Arrays;

public class HandleFiles {
    @SamplePolicy(name = "Default Value")
    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();
        fs.getFileStores().forEach(s -> System.out.println(s.name() + " " +s.name()));
        System.out.println("-----------------");
        fs.getRootDirectories().forEach(System.out::println);
        Path p = Paths.get(".");
        System.out.println("-----> " + p);

        System.out.println(Arrays.toString(SamplePolicy.class.getAnnotations()));
    }
}

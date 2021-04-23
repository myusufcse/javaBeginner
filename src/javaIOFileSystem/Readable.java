package javaIOFileSystem;

@FunctionalInterface
public interface Readable {
    boolean isReadable();
    // String readedLine(); //above annotation throw below error
    // Multiple non-overriding abstract methods found in interface javaIOFileSystem.Readable
}

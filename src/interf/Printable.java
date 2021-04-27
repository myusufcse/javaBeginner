package interf;

public interface Printable {
    float PI = 3.24f; // compiler add public static final
    void printFiveTimes();  // compiler add public abstract
    void printThreeTimes(String... a);  // compiler add public abstract
}

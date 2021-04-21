package collection;

public class Product {
    private static int maxId =0;
    private final int id;
    private final String name;
    private Condition condition;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    {
        id = ++maxId;
    }

    public Product(String name) {
        this.name = name;
        this.condition = Condition.NOT_AVAILABLE;
    }

    public Product(String name, Condition condition) {
        this(name);
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "id = "+id +"\nname = "+name;
    }

    public Condition getCondition() {
        return condition;
    }
}

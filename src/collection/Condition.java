package collection;

public enum Condition {
    HOT("Warning Super Hot!"),
    COLD("Warning Freezing Cold!"),
    WARM("Just Right!"),
    NOT_AVAILABLE("Not Available");

    public String getCaution() {
        return caution;
    }

    private final String caution;

    private Condition(String caution) {
        this.caution = caution;
    }
}

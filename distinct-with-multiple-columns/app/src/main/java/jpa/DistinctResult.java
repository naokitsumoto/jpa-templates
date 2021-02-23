package jpa;

public class DistinctResult {
    private final String column1;
    private final String column2;

    public DistinctResult(String column1, String column2) {
        this.column1 = column1;
        this.column2 = column2;
    }

    @Override
    public String toString() {
        return String.format("column1: %s, column2: %s", column1, column2);
    }
}

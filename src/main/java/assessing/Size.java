package assessing;

public enum Size {
    S("Small"),
    M("Medium"),
    L("Large"),
    X("Omega");

    private final String description;
    Size(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

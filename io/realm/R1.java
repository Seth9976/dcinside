package io.realm;

public enum r1 {
    ASCENDING(true),
    DESCENDING(false);

    private final boolean a;

    private r1(boolean z) {
        this.a = z;
    }

    public boolean a() {
        return this.a;
    }
}


package io.realm;

public enum o {
    SENSITIVE(true),
    INSENSITIVE(false);

    private final boolean a;

    private o(boolean z) {
        this.a = z;
    }

    public boolean a() {
        return this.a;
    }
}


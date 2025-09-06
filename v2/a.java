package V2;

import y4.m;

public enum a {
    COPPA_ENABLED(Boolean.TRUE),
    COPPA_DISABLED(Boolean.FALSE),
    COPPA_NOTSET(null);

    @m
    private final Boolean value;

    private static final a[] $values() [...] // Inlined contents

    private a(Boolean boolean0) {
        this.value = boolean0;
    }

    @m
    public final Boolean getValue() {
        return this.value;
    }
}


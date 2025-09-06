package V2;

import y4.l;

public enum b {
    OPT_IN("opted_in"),
    OPT_OUT("opted_out");

    @l
    private final String value;

    private static final b[] $values() [...] // Inlined contents

    private b(String s1) {
        this.value = s1;
    }

    @l
    public final String getValue() {
        return this.value;
    }
}


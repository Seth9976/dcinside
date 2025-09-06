package kotlinx.serialization.json.internal;

import z3.f;

public enum n0 {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');

    @f
    public final char a;
    @f
    public final char b;

    private n0(char c, char c1) {
        this.a = c;
        this.b = c1;
    }

    private static final n0[] a() [...] // Inlined contents
}


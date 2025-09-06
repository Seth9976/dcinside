package kotlin;

import kotlin.internal.f;
import kotlin.internal.g;

public final class d {
    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final char a(int v) {
        if(v < 0 || v > 0xFFFF) {
            throw new IllegalArgumentException("Invalid Char code: " + v);
        }
        return (char)v;
    }

    private static final int b(char c) {
        return c;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    @g
    public static void c(char c) {
    }
}


package com.facebook.imagepipeline.transcoder;

import java.util.Arrays;
import kotlin.jvm.internal.L;
import y4.l;

public final class b {
    private final int a;

    public b(int v) {
        this.a = v;
    }

    public final int a() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        String s = String.format(null, "Status: %d", Arrays.copyOf(new Object[]{this.a}, 1));
        L.o(s, "format(...)");
        return s;
    }
}


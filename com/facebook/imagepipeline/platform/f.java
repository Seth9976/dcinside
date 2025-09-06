package com.facebook.imagepipeline.platform;

import kotlin.jvm.internal.w;

public final class f {
    private final boolean a;
    private final boolean b;

    public f() {
        this(false, false, 3, null);
    }

    public f(boolean z, boolean z1) {
        this.a = z;
        this.b = z1;
    }

    public f(boolean z, boolean z1, int v, w w0) {
        if((v & 1) != 0) {
            z = false;
        }
        if((v & 2) != 0) {
            z1 = false;
        }
        this(z, z1);
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }
}


package com.vungle.ads.internal.util;

import y4.l;

public final class r {
    @l
    public static final r INSTANCE;

    static {
        r.INSTANCE = new r();
    }

    public final boolean isInRange(float f, float f1, float f2) {
        return f1 <= f && f <= f2;
    }

    public final boolean isInRange(int v, int v1, int v2) {
        return v1 <= v && v <= v2;
    }

    public static boolean isInRange$default(r r0, float f, float f1, float f2, int v, Object object0) {
        if((v & 4) != 0) {
            f2 = 3.402823E+38f;
        }
        return r0.isInRange(f, f1, f2);
    }

    public static boolean isInRange$default(r r0, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 4) != 0) {
            v2 = 0x7FFFFFFF;
        }
        return r0.isInRange(v, v1, v2);
    }
}


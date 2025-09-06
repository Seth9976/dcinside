package com.google.android.gms.internal.clearcut;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzbt {
    private static volatile boolean zzgm = false;
    private static final Class zzgn;
    static final zzbt zzgo;
    private final Map zzgp;

    static {
        zzbt.zzgn = zzbt.zzam();
        zzbt.zzgo = new zzbt(true);
    }

    zzbt() {
        this.zzgp = new HashMap();
    }

    private zzbt(boolean z) {
        this.zzgp = Collections.emptyMap();
    }

    private static Class zzam() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        }
        catch(ClassNotFoundException unused_ex) {
            return null;
        }
    }

    public static zzbt zzan() {
        return zzbs.zzal();
    }
}


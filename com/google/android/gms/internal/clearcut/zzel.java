package com.google.android.gms.internal.clearcut;

import java.util.Iterator;

final class zzel extends zzer {
    private final zzei zzos;

    private zzel(zzei zzei0) {
        this.zzos = zzei0;
        super(zzei0, null);
    }

    zzel(zzei zzei0, zzej zzej0) {
        this(zzei0);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzer
    public final Iterator iterator() {
        return new zzek(this.zzos, null);
    }
}


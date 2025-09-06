package com.google.android.gms.common.internal;

import j..util.DesugarCollections;
import java.util.Set;

public final class zab {
    public final Set zaa;

    public zab(Set set0) {
        Preconditions.checkNotNull(set0);
        this.zaa = DesugarCollections.unmodifiableSet(set0);
    }
}


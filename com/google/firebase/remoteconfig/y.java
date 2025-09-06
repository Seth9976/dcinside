package com.google.firebase.remoteconfig;

import com.google.android.gms.common.util.BiConsumer;
import com.google.firebase.remoteconfig.internal.h;
import com.google.firebase.remoteconfig.internal.z;

public final class y implements BiConsumer {
    public final z a;

    public y(z z0) {
        this.a = z0;
    }

    @Override  // com.google.android.gms.common.util.BiConsumer
    public final void accept(Object object0, Object object1) {
        this.a.a(((String)object0), ((h)object1));
    }
}


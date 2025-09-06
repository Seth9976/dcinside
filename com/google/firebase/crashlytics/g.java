package com.google.firebase.crashlytics;

import com.google.firebase.components.i;
import com.google.firebase.components.l;

public final class g implements l {
    public final CrashlyticsRegistrar a;

    public g(CrashlyticsRegistrar crashlyticsRegistrar0) {
        this.a = crashlyticsRegistrar0;
    }

    @Override  // com.google.firebase.components.l
    public final Object a(i i0) {
        return this.a.b(i0);
    }
}


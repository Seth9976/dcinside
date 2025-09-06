package com.google.firebase.analytics;

import androidx.annotation.Nullable;
import java.util.concurrent.Callable;

final class f implements Callable {
    private final FirebaseAnalytics a;

    f(FirebaseAnalytics firebaseAnalytics0) {
        this.a = firebaseAnalytics0;
        super();
    }

    @Override
    @Nullable
    public final Object call() throws Exception {
        return this.a.a.zzc();
    }
}


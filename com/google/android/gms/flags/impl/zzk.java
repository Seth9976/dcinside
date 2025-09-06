package com.google.android.gms.flags.impl;

import android.content.Context;
import java.util.concurrent.Callable;

final class zzk implements Callable {
    private final Context val$context;

    zzk(Context context0) {
        this.val$context = context0;
        super();
    }

    @Override
    public final Object call() throws Exception {
        return this.val$context.getSharedPreferences("google_sdk_flags", 0);
    }
}


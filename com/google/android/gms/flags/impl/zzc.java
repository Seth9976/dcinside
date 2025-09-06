package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class zzc implements Callable {
    private final SharedPreferences zzo;
    private final String zzp;
    private final Boolean zzq;

    zzc(SharedPreferences sharedPreferences0, String s, Boolean boolean0) {
        this.zzo = sharedPreferences0;
        this.zzp = s;
        this.zzq = boolean0;
        super();
    }

    @Override
    public final Object call() throws Exception {
        return Boolean.valueOf(this.zzo.getBoolean(this.zzp, this.zzq.booleanValue()));
    }
}


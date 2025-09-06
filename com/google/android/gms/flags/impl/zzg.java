package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class zzg implements Callable {
    private final SharedPreferences zzo;
    private final String zzp;
    private final Long zzs;

    zzg(SharedPreferences sharedPreferences0, String s, Long long0) {
        this.zzo = sharedPreferences0;
        this.zzp = s;
        this.zzs = long0;
        super();
    }

    @Override
    public final Object call() throws Exception {
        return this.zzo.getLong(this.zzp, ((long)this.zzs));
    }
}


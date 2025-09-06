package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class zze implements Callable {
    private final SharedPreferences zzo;
    private final String zzp;
    private final Integer zzr;

    zze(SharedPreferences sharedPreferences0, String s, Integer integer0) {
        this.zzo = sharedPreferences0;
        this.zzp = s;
        this.zzr = integer0;
        super();
    }

    @Override
    public final Object call() throws Exception {
        return this.zzo.getInt(this.zzp, ((int)this.zzr));
    }
}


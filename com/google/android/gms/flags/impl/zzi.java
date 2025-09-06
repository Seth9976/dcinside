package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class zzi implements Callable {
    private final SharedPreferences zzo;
    private final String zzp;
    private final String zzt;

    zzi(SharedPreferences sharedPreferences0, String s, String s1) {
        this.zzo = sharedPreferences0;
        this.zzp = s;
        this.zzt = s1;
        super();
    }

    @Override
    public final Object call() throws Exception {
        return this.zzo.getString(this.zzp, this.zzt);
    }
}


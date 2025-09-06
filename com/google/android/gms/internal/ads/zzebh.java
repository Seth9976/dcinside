package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.util.client.zzu;

public final class zzebh implements Runnable {
    public final SQLiteDatabase zza;
    public final String zzb;
    public final zzu zzc;

    public zzebh(SQLiteDatabase sQLiteDatabase0, String s, zzu zzu0) {
        this.zza = sQLiteDatabase0;
        this.zzb = s;
        this.zzc = zzu0;
    }

    @Override
    public final void run() {
        zzebk.zzf(this.zza, this.zzb, this.zzc);
    }
}


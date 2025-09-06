package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.util.client.zzu;

public final class zzebf implements zzffr {
    public final zzebk zza;
    public final zzu zzb;
    public final String zzc;

    public zzebf(zzebk zzebk0, zzu zzu0, String s) {
        this.zza = zzebk0;
        this.zzb = zzu0;
        this.zzc = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzffr
    public final Object zza(Object object0) {
        this.zza.zzg(((SQLiteDatabase)object0), this.zzb, this.zzc);
        return null;
    }
}


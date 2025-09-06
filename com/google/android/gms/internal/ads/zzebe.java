package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

public final class zzebe implements zzffr {
    public final zzebk zza;
    public final zzebm zzb;

    public zzebe(zzebk zzebk0, zzebm zzebm0) {
        this.zza = zzebk0;
        this.zzb = zzebm0;
    }

    @Override  // com.google.android.gms.internal.ads.zzffr
    public final Object zza(Object object0) {
        this.zza.zza(this.zzb, ((SQLiteDatabase)object0));
        return null;
    }
}


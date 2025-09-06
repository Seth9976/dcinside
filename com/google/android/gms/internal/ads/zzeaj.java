package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

public final class zzeaj implements zzffr {
    public final zzeak zza;
    public final long zzb;

    public zzeaj(zzeak zzeak0, long v) {
        this.zza = zzeak0;
        this.zzb = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzffr
    public final Object zza(Object object0) {
        if(!this.zza.zzf()) {
            zzbbq.zzaf.zza.zza zzbbq$zzaf$zza$zza0 = zzbbq.zzaf.zza.zzn();
            zzbbq$zzaf$zza$zza0.zzP(this.zzb);
            byte[] arr_b = ((zzbbq.zzaf.zza)zzbbq$zzaf$zza$zza0.zzbn()).zzaV();
            zzear.zzf(((SQLiteDatabase)object0), false, false);
            zzear.zzc(((SQLiteDatabase)object0), this.zzb, arr_b);
        }
        return null;
    }
}


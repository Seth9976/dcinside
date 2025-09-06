package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

public final class zzeam implements zzffr {
    public final zzean zza;
    public final boolean zzb;
    public final ArrayList zzc;
    public final zzbbq.zzab zzd;
    public final zzbbq.zzaf.zzd zze;

    public zzeam(zzean zzean0, boolean z, ArrayList arrayList0, zzbbq.zzab zzbbq$zzab0, zzbbq.zzaf.zzd zzbbq$zzaf$zzd0) {
        this.zza = zzean0;
        this.zzb = z;
        this.zzc = arrayList0;
        this.zzd = zzbbq$zzab0;
        this.zze = zzbbq$zzaf$zzd0;
    }

    @Override  // com.google.android.gms.internal.ads.zzffr
    public final Object zza(Object object0) {
        zzean zzean0 = this.zza;
        if(!zzean0.zzb.zzf()) {
            byte[] arr_b = zzeao.zze(zzean0.zzb, this.zzb, this.zzc, this.zzd, this.zze);
            zzear.zzf(((SQLiteDatabase)object0), this.zzb, true);
            zzear.zzc(((SQLiteDatabase)object0), zzean0.zzb.zzf.zzd(), arr_b);
        }
        return null;
    }
}


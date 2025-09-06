package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.util.client.zzo;

final class zzebj implements zzgcd {
    final zzffr zza;

    zzebj(zzebk zzebk0, zzffr zzffr0) {
        this.zza = zzffr0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        zzo.zzg(("Failed to get offline buffered ping database: " + throwable0.getMessage()));
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object object0) {
        SQLiteDatabase sQLiteDatabase0 = (SQLiteDatabase)object0;
        try {
            this.zza.zza(sQLiteDatabase0);
        }
        catch(Exception exception0) {
            zzo.zzg(("Error executing function on offline buffered ping database: " + exception0.getMessage()));
        }
    }
}


package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.Future;

public final class zzbbf {
    @Nullable
    private zzbau zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd;

    zzbbf(Context context0) {
        this.zzd = new Object();
        this.zzc = context0;
    }

    final Future zzc(zzbav zzbav0) {
        Future future0 = new zzbaz(this);
        zzbbd zzbbd0 = new zzbbd(this, zzbav0, ((zzcab)future0));
        zzbbe zzbbe0 = new zzbbe(this, ((zzcab)future0));
        synchronized(this.zzd) {
            Looper looper0 = zzv.zzu().zzb();
            zzbau zzbau0 = new zzbau(this.zzc, looper0, zzbbd0, zzbbe0);
            this.zza = zzbau0;
            zzbau0.checkAvailabilityAndConnect();
            return future0;
        }
    }

    static void zzd(zzbbf zzbbf0, boolean z) {
        zzbbf0.zzb = true;
    }

    static void zze(zzbbf zzbbf0) {
        synchronized(zzbbf0.zzd) {
            zzbau zzbau0 = zzbbf0.zza;
            if(zzbau0 == null) {
                return;
            }
            zzbau0.disconnect();
            zzbbf0.zza = null;
            Binder.flushPendingCommands();
        }
    }
}


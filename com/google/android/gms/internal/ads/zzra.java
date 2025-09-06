package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.concurrent.CopyOnWriteArrayList;

public final class zzra {
    public final int zza;
    @Nullable
    public final zzug zzb;
    private final CopyOnWriteArrayList zzc;

    public zzra() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private zzra(CopyOnWriteArrayList copyOnWriteArrayList0, int v, @Nullable zzug zzug0) {
        this.zzc = copyOnWriteArrayList0;
        this.zza = 0;
        this.zzb = zzug0;
    }

    @CheckResult
    public final zzra zza(int v, @Nullable zzug zzug0) {
        return new zzra(this.zzc, 0, zzug0);
    }

    public final void zzb(Handler handler0, zzrb zzrb0) {
        zzqz zzqz0 = new zzqz(handler0, zzrb0);
        this.zzc.add(zzqz0);
    }

    public final void zzc(zzrb zzrb0) {
        for(Object object0: this.zzc) {
            zzqz zzqz0 = (zzqz)object0;
            if(zzqz0.zza == zzrb0) {
                this.zzc.remove(zzqz0);
            }
        }
    }
}


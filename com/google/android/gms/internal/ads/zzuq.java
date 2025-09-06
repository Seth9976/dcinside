package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

public final class zzuq {
    public final int zza;
    @Nullable
    public final zzug zzb;
    private final CopyOnWriteArrayList zzc;

    public zzuq() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private zzuq(CopyOnWriteArrayList copyOnWriteArrayList0, int v, @Nullable zzug zzug0) {
        this.zzc = copyOnWriteArrayList0;
        this.zza = 0;
        this.zzb = zzug0;
    }

    @CheckResult
    public final zzuq zza(int v, @Nullable zzug zzug0) {
        return new zzuq(this.zzc, 0, zzug0);
    }

    public final void zzb(Handler handler0, zzur zzur0) {
        zzup zzup0 = new zzup(handler0, zzur0);
        this.zzc.add(zzup0);
    }

    public final void zzc(zzdb zzdb0) {
        for(Object object0: this.zzc) {
            Handler handler0 = ((zzup)object0).zza;
            zzuo zzuo0 = new zzuo(zzdb0, ((zzup)object0).zzb);
            if(!handler0.getLooper().getThread().isAlive()) {
            }
            else if(handler0.getLooper() == Looper.myLooper()) {
                zzuo0.run();
            }
            else {
                handler0.post(zzuo0);
            }
        }
    }

    public final void zzd(zzuc zzuc0) {
        this.zzc(new zzuj(this, zzuc0));
    }

    public final void zze(zztx zztx0, zzuc zzuc0) {
        this.zzc(new zzun(this, zztx0, zzuc0));
    }

    public final void zzf(zztx zztx0, zzuc zzuc0) {
        this.zzc(new zzul(this, zztx0, zzuc0));
    }

    public final void zzg(zztx zztx0, zzuc zzuc0, IOException iOException0, boolean z) {
        this.zzc(new zzum(this, zztx0, zzuc0, iOException0, z));
    }

    public final void zzh(zztx zztx0, zzuc zzuc0) {
        this.zzc(new zzuk(this, zztx0, zzuc0));
    }

    public final void zzi(zzur zzur0) {
        for(Object object0: this.zzc) {
            zzup zzup0 = (zzup)object0;
            if(zzup0.zzb == zzur0) {
                this.zzc.remove(zzup0);
            }
        }
    }
}


package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.t0;
import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

public final class zzfdi {
    private final Deque zza;
    private final Callable zzb;
    private final zzgcs zzc;

    public zzfdi(Callable callable0, zzgcs zzgcs0) {
        this.zza = new LinkedBlockingDeque();
        this.zzb = callable0;
        this.zzc = zzgcs0;
    }

    @Nullable
    public final t0 zza() {
        synchronized(this) {
            this.zzc(1);
            return (t0)this.zza.poll();
        }
    }

    public final void zzb(t0 t00) {
        synchronized(this) {
            this.zza.addFirst(t00);
        }
    }

    public final void zzc(int v) {
        synchronized(this) {
            int v2 = this.zza.size();
            for(int v3 = 0; v3 < v - v2; ++v3) {
                t0 t00 = this.zzc.zzb(this.zzb);
                this.zza.add(t00);
            }
        }
    }
}


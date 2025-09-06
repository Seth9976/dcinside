package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.t0;
import java.util.ArrayDeque;

public final class zzfes {
    private final zzfdw zza;
    private final zzfeq zzb;
    private final zzfds zzc;
    private final ArrayDeque zzd;
    private zzfey zze;
    private int zzf;

    public zzfes(zzfdw zzfdw0, zzfds zzfds0, zzfeq zzfeq0) {
        this.zzf = 1;
        this.zza = zzfdw0;
        this.zzc = zzfds0;
        this.zzb = zzfeq0;
        this.zzd = new ArrayDeque();
        zzfds0.zzb(new zzfen(this));
    }

    @Nullable
    public final t0 zza(zzfer zzfer0) {
        synchronized(this) {
            this.zzf = 2;
            return this.zzi() ? null : this.zze.zza(zzfer0);
        }
    }

    static void zzc(zzfes zzfes0, zzfey zzfey0) {
        zzfes0.zze = null;
    }

    public final void zze(zzfer zzfer0) {
        synchronized(this) {
            this.zzd.add(zzfer0);
        }
    }

    final void zzf() {
        synchronized(this) {
            this.zzf = 1;
            this.zzh();
        }
    }

    private final void zzh() {
        synchronized(this) {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzge)).booleanValue() && !zzv.zzp().zzi().zzg().zzh()) {
                this.zzd.clear();
                return;
            }
            if(this.zzi()) {
                while(!this.zzd.isEmpty()) {
                    zzfer zzfer0 = (zzfer)this.zzd.pollFirst();
                    if(zzfer0 != null) {
                        if(zzfer0.zza() == null) {
                            continue;
                        }
                        zzfeg zzfeg0 = zzfer0.zza();
                        if(this.zza.zze(zzfeg0)) {
                            goto label_17;
                        }
                        continue;
                    }
                label_17:
                    zzfey zzfey0 = new zzfey(this.zza, this.zzb, zzfer0);
                    this.zze = zzfey0;
                    zzfey0.zzd(new zzfeo(this, zzfer0));
                    return;
                }
            }
        }
    }

    private final boolean zzi() {
        synchronized(this) {
        }
        return this.zze == null;
    }
}


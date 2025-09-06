package com.google.android.gms.internal.ads;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

@RestrictTo({Scope.b})
public final class zzfo {
    private final zzfm zza;
    private final AtomicLong zzb;
    private final ArrayDeque zzc;
    private final PriorityQueue zzd;
    private int zze;

    public zzfo(zzfm zzfm0) {
        this.zzb = new AtomicLong();
        this.zza = zzfm0;
        this.zzc = new ArrayDeque();
        this.zzd = new PriorityQueue();
        this.zze = -1;
    }

    public final int zza() {
        return this.zze;
    }

    public final void zzb(long v, zzdy zzdy0) {
        switch(this.zze) {
            case -1: {
            label_2:
                zzfn zzfn0 = this.zzc.isEmpty() ? new zzfn() : ((zzfn)this.zzc.poll());
                zzfn0.zzc(v, this.zzb.getAndIncrement(), zzdy0);
                this.zzd.add(zzfn0);
                int v1 = this.zze;
                if(v1 != -1) {
                    this.zze(v1);
                }
                return;
            }
            case 0: {
                break;
            }
            default: {
                if(this.zzd.size() < this.zze || v >= ((zzfn)this.zzd.peek()).zzb) {
                    goto label_2;
                }
            }
        }
        this.zza.zza(v, zzdy0);
    }

    public final void zzc() {
        this.zze(0);
    }

    public final void zzd(int v) {
        zzcw.zzf(v >= 0);
        this.zze = v;
        this.zze(v);
    }

    private final void zze(int v) {
        while(this.zzd.size() > v) {
            zzfn zzfn0 = (zzfn)this.zzd.poll();
            long v1 = zzfn0.zzb;
            zzdy zzdy0 = zzfn0.zza;
            this.zza.zza(v1, zzdy0);
            this.zzc.push(zzfn0);
        }
    }
}


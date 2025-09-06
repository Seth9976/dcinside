package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

final class zzed implements zzdh {
    @GuardedBy("messagePool")
    private static final List zza;
    private final Handler zzb;

    static {
        zzed.zza = new ArrayList(50);
    }

    public zzed(Handler handler0) {
        this.zzb = handler0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdh
    public final Looper zza() {
        return this.zzb.getLooper();
    }

    @Override  // com.google.android.gms.internal.ads.zzdh
    public final zzdg zzb(int v) {
        zzdg zzdg0 = zzed.zzm();
        ((zzeb)zzdg0).zzb(this.zzb.obtainMessage(v), this);
        return zzdg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdh
    public final zzdg zzc(int v, @Nullable Object object0) {
        zzdg zzdg0 = zzed.zzm();
        ((zzeb)zzdg0).zzb(this.zzb.obtainMessage(v, object0), this);
        return zzdg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdh
    public final zzdg zzd(int v, int v1, int v2) {
        zzdg zzdg0 = zzed.zzm();
        ((zzeb)zzdg0).zzb(this.zzb.obtainMessage(1, v1, v2), this);
        return zzdg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdh
    public final void zze(@Nullable Object object0) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override  // com.google.android.gms.internal.ads.zzdh
    public final void zzf(int v) {
        this.zzb.removeMessages(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzdh
    public final boolean zzg(int v) {
        return this.zzb.hasMessages(1);
    }

    @Override  // com.google.android.gms.internal.ads.zzdh
    public final boolean zzh(Runnable runnable0) {
        return this.zzb.post(runnable0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdh
    public final boolean zzi(int v) {
        return this.zzb.sendEmptyMessage(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzdh
    public final boolean zzj(int v, long v1) {
        return this.zzb.sendEmptyMessageAtTime(2, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzdh
    public final boolean zzk(zzdg zzdg0) {
        return ((zzeb)zzdg0).zzc(this.zzb);
    }

    static void zzl(zzeb zzeb0) {
        List list0 = zzed.zza;
        synchronized(list0) {
            if(list0.size() < 50) {
                list0.add(zzeb0);
            }
        }
    }

    private static zzeb zzm() {
        synchronized(zzed.zza) {
            return zzed.zza.isEmpty() ? new zzeb(null) : ((zzeb)zzed.zza.remove(zzed.zza.size() - 1));
        }
    }
}


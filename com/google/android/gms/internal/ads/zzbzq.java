package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class zzbzq implements zzazd {
    @VisibleForTesting
    final zzbzn zza;
    @VisibleForTesting
    final HashSet zzb;
    @VisibleForTesting
    final HashSet zzc;
    private final Object zzd;
    private final zzg zze;
    private final zzbzo zzf;
    private boolean zzg;

    public zzbzq(String s, zzg zzg0) {
        this.zzd = new Object();
        this.zzb = new HashSet();
        this.zzc = new HashSet();
        this.zzg = false;
        this.zza = new zzbzn(s, zzg0);
        this.zze = zzg0;
        this.zzf = new zzbzo();
    }

    @Override  // com.google.android.gms.internal.ads.zzazd
    public final void zza(boolean z) {
        long v = zzv.zzC().currentTimeMillis();
        if(z) {
            this.zza.zzd = v - this.zze.zzd() > ((long)(((Long)zzbe.zzc().zza(zzbcl.zzbd)))) ? -1 : this.zze.zzc();
            this.zzg = true;
            return;
        }
        this.zze.zzr(v);
        this.zze.zzG(this.zza.zzd);
    }

    public final int zzb() {
        synchronized(this.zzd) {
        }
        return this.zza.zza();
    }

    // 去混淆评级： 低(20)
    public final zzbzf zzc(Clock clock0, String s) {
        return new zzbzf(clock0, this, "1", s);
    }

    // 去混淆评级： 低(20)
    public final String zzd() {
        return "0";
    }

    public final void zze(zzbzf zzbzf0) {
        synchronized(this.zzd) {
            this.zzb.add(zzbzf0);
        }
    }

    public final void zzf() {
        synchronized(this.zzd) {
            this.zza.zzc();
        }
    }

    public final void zzg() {
        synchronized(this.zzd) {
            this.zza.zzd();
        }
    }

    public final void zzh() {
        synchronized(this.zzd) {
            this.zza.zze();
        }
    }

    public final void zzi() {
        synchronized(this.zzd) {
            this.zza.zzf();
        }
    }

    public final void zzj(zzm zzm0, long v) {
        synchronized(this.zzd) {
            this.zza.zzg(zzm0, v);
        }
    }

    public final void zzk() {
        synchronized(this.zzd) {
            this.zza.zzh();
        }
    }

    public final void zzl(HashSet hashSet0) {
        synchronized(this.zzd) {
            this.zzb.addAll(hashSet0);
        }
    }

    public final boolean zzm() {
        return this.zzg;
    }

    public final Bundle zzn(Context context0, zzfdq zzfdq0) {
        HashSet hashSet0 = new HashSet();
        synchronized(this.zzd) {
            hashSet0.addAll(this.zzb);
            this.zzb.clear();
        }
        Bundle bundle0 = new Bundle();
        bundle0.putBundle("app", this.zza.zzb(context0, "0"));
        Bundle bundle1 = new Bundle();
        Iterator iterator0 = this.zzc.iterator();
        if(!iterator0.hasNext()) {
            bundle0.putBundle("slots", bundle1);
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: hashSet0) {
                arrayList0.add(((zzbzf)object0).zza());
            }
            bundle0.putParcelableArrayList("ads", arrayList0);
            zzfdq0.zzc(hashSet0);
            return bundle0;
        }
        Object object1 = iterator0.next();
        zzbzp zzbzp0 = (zzbzp)object1;
        throw null;
    }
}


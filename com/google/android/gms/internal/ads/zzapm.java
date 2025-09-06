package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Map;

public abstract class zzapm implements Comparable {
    private final zzapx zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    @GuardedBy("mLock")
    @Nullable
    private final zzapq zzf;
    private Integer zzg;
    private zzapp zzh;
    @GuardedBy("mLock")
    private boolean zzi;
    @Nullable
    private zzaov zzj;
    @GuardedBy("mLock")
    private zzapl zzk;
    private final zzapa zzl;

    public zzapm(int v, String s, @Nullable zzapq zzapq0) {
        this.zza = zzapx.zza ? new zzapx() : null;
        this.zze = new Object();
        int v1 = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = v;
        this.zzc = s;
        this.zzf = zzapq0;
        this.zzl = new zzapa();
        if(!TextUtils.isEmpty(s)) {
            Uri uri0 = Uri.parse(s);
            if(uri0 != null) {
                String s1 = uri0.getHost();
                if(s1 != null) {
                    v1 = s1.hashCode();
                }
            }
        }
        this.zzd = v1;
    }

    @Override
    public final int compareTo(Object object0) {
        return ((int)this.zzg) - ((int)((zzapm)object0).zzg);
    }

    @Override
    public final String toString() {
        return "[ ] " + this.zzc + " " + ("0x" + Integer.toHexString(this.zzd)) + " NORMAL " + this.zzg;
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzl.zzb();
    }

    public final int zzc() {
        return this.zzd;
    }

    @Nullable
    public final zzaov zzd() {
        return this.zzj;
    }

    public final zzapm zze(zzaov zzaov0) {
        this.zzj = zzaov0;
        return this;
    }

    public final zzapm zzf(zzapp zzapp0) {
        this.zzh = zzapp0;
        return this;
    }

    public final zzapm zzg(int v) {
        this.zzg = v;
        return this;
    }

    protected abstract zzaps zzh(zzapi arg1);

    // 去混淆评级： 低(30)
    public final String zzj() {
        return this.zzb == 0 ? this.zzc : "1-" + this.zzc;
    }

    public final String zzk() {
        return this.zzc;
    }

    public Map zzl() throws zzaou {
        return Collections.emptyMap();
    }

    public final void zzm(String s) {
        if(zzapx.zza) {
            this.zza.zza(s, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzapv zzapv0) {
        synchronized(this.zze) {
        }
        this.zzf.zza(zzapv0);
    }

    protected abstract void zzo(Object arg1);

    final void zzp(String s) {
        zzapp zzapp0 = this.zzh;
        if(zzapp0 != null) {
            zzapp0.zzb(this);
        }
        if(zzapx.zza) {
            long v = Thread.currentThread().getId();
            if(Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzapk(this, s, v));
                return;
            }
            this.zza.zza(s, v);
            this.zza.zzb(this.toString());
        }
    }

    public final void zzq() {
        synchronized(this.zze) {
            this.zzi = true;
        }
    }

    final void zzr() {
        zzapl zzapl0;
        synchronized(this.zze) {
            zzapl0 = this.zzk;
        }
        if(zzapl0 != null) {
            zzapl0.zza(this);
        }
    }

    final void zzs(zzaps zzaps0) {
        zzapl zzapl0;
        synchronized(this.zze) {
            zzapl0 = this.zzk;
        }
        if(zzapl0 != null) {
            zzapl0.zzb(this, zzaps0);
        }
    }

    final void zzt(int v) {
        zzapp zzapp0 = this.zzh;
        if(zzapp0 != null) {
            zzapp0.zzc(this, v);
        }
    }

    final void zzu(zzapl zzapl0) {
        synchronized(this.zze) {
            this.zzk = zzapl0;
        }
    }

    public final boolean zzv() {
        synchronized(this.zze) {
        }
        return this.zzi;
    }

    public final boolean zzw() {
        synchronized(this.zze) {
        }
        return false;
    }

    public byte[] zzx() throws zzaou {
        return null;
    }

    public final zzapa zzy() {
        return this.zzl;
    }
}


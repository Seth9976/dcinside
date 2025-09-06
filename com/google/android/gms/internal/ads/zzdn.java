package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.Message;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;

public final class zzdn {
    private final zzcx zza;
    private final zzdh zzb;
    private final zzdl zzc;
    private final CopyOnWriteArraySet zzd;
    private final ArrayDeque zze;
    private final ArrayDeque zzf;
    private final Object zzg;
    @GuardedBy("releasedLock")
    private boolean zzh;
    private boolean zzi;

    public zzdn(Looper looper0, zzcx zzcx0, zzdl zzdl0) {
        this(new CopyOnWriteArraySet(), looper0, zzcx0, zzdl0, true);
    }

    private zzdn(CopyOnWriteArraySet copyOnWriteArraySet0, Looper looper0, zzcx zzcx0, zzdl zzdl0, boolean z) {
        this.zza = zzcx0;
        this.zzd = copyOnWriteArraySet0;
        this.zzc = zzdl0;
        this.zzg = new Object();
        this.zze = new ArrayDeque();
        this.zzf = new ArrayDeque();
        this.zzb = zzcx0.zzd(looper0, new zzdi(this));
        this.zzi = z;
    }

    @CheckResult
    public final zzdn zza(Looper looper0, zzdl zzdl0) {
        return new zzdn(this.zzd, looper0, this.zza, zzdl0, this.zzi);
    }

    public final void zzb(Object object0) {
        synchronized(this.zzg) {
            if(this.zzh) {
                return;
            }
            zzdm zzdm0 = new zzdm(object0);
            this.zzd.add(zzdm0);
        }
    }

    public final void zzc() {
        this.zzh();
        if(!this.zzf.isEmpty()) {
            if(!this.zzb.zzg(1)) {
                zzdg zzdg0 = this.zzb.zzb(1);
                this.zzb.zzk(zzdg0);
            }
            this.zze.addAll(this.zzf);
            this.zzf.clear();
            if(this.zze.isEmpty()) {
                while(!this.zze.isEmpty()) {
                    ((Runnable)this.zze.peekFirst()).run();
                    this.zze.removeFirst();
                }
            }
        }
    }

    public final void zzd(int v, zzdk zzdk0) {
        this.zzh();
        zzdj zzdj0 = new zzdj(new CopyOnWriteArraySet(this.zzd), v, zzdk0);
        this.zzf.add(zzdj0);
    }

    public final void zze() {
        this.zzh();
        synchronized(this.zzg) {
            this.zzh = true;
        }
        for(Object object0: this.zzd) {
            ((zzdm)object0).zzc(this.zzc);
        }
        this.zzd.clear();
    }

    public final void zzf(Object object0) {
        this.zzh();
        for(Object object1: this.zzd) {
            zzdm zzdm0 = (zzdm)object1;
            if(zzdm0.zza.equals(object0)) {
                zzdm0.zzc(this.zzc);
                this.zzd.remove(zzdm0);
            }
        }
    }

    public static boolean zzg(zzdn zzdn0, Message message0) {
        for(Object object0: zzdn0.zzd) {
            ((zzdm)object0).zzb(zzdn0.zzc);
            if(zzdn0.zzb.zzg(1)) {
                break;
            }
        }
        return true;
    }

    private final void zzh() {
        if(!this.zzi) {
            return;
        }
        zzcw.zzf(Thread.currentThread() == this.zzb.zza().getThread());
    }
}


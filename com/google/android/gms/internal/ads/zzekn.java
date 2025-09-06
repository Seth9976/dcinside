package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzct;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class zzekn implements AppEventListener, zza, zzcvt, zzcvw, zzcwj, zzcwn, zzcxh, zzcye, zzcyq, zzdds {
    @Nullable
    final zzdrw zza;
    @VisibleForTesting
    final BlockingQueue zzb;
    private final AtomicReference zzc;
    private final AtomicReference zzd;
    private final AtomicReference zze;
    private final AtomicReference zzf;
    private final AtomicReference zzg;
    private final AtomicBoolean zzh;
    private final AtomicBoolean zzi;
    private final AtomicBoolean zzj;

    public zzekn(@Nullable zzdrw zzdrw0) {
        this.zzc = new AtomicReference();
        this.zzd = new AtomicReference();
        this.zze = new AtomicReference();
        this.zzf = new AtomicReference();
        this.zzg = new AtomicReference();
        this.zzh = new AtomicBoolean(true);
        this.zzi = new AtomicBoolean(false);
        this.zzj = new AtomicBoolean(false);
        this.zzb = new ArrayBlockingQueue(((int)(((Integer)zzbe.zzc().zza(zzbcl.zziK)))));
        this.zza = zzdrw0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzkE)).booleanValue()) {
            zzekl zzekl0 = new zzekl();
            zzeyt.zza(this.zzc, zzekl0);
        }
    }

    @Override  // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String s, String s1) {
        synchronized(this) {
            if(this.zzh.get()) {
                Pair pair0 = new Pair(s, s1);
                if(!this.zzb.offer(pair0)) {
                    zzo.zze("The queue for app events is full, dropping the new event.");
                    zzdrw zzdrw0 = this.zza;
                    if(zzdrw0 != null) {
                        zzdrv zzdrv0 = zzdrw0.zza();
                        zzdrv0.zzb("action", "dae_action");
                        zzdrv0.zzb("dae_name", s);
                        zzdrv0.zzb("dae_data", s1);
                        zzdrv0.zzg();
                        return;
                    }
                }
                return;
            }
            zzekf zzekf0 = new zzekf(s, s1);
            zzeyt.zza(this.zzd, zzekf0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zza() {
        zzejv zzejv0 = new zzejv();
        zzeyt.zza(this.zzc, zzejv0);
        zzejw zzejw0 = new zzejw();
        zzeyt.zza(this.zzg, zzejw0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zzb() {
        zzekg zzekg0 = new zzekg();
        zzeyt.zza(this.zzc, zzekg0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zzc() {
        zzeki zzeki0 = new zzeki();
        zzeyt.zza(this.zzc, zzeki0);
        zzekj zzekj0 = new zzekj();
        zzeyt.zza(this.zzg, zzekj0);
        zzekk zzekk0 = new zzekk();
        zzeyt.zza(this.zzg, zzekk0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdds
    public final void zzdd() {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzkE)).booleanValue()) {
            zzekl zzekl0 = new zzekl();
            zzeyt.zza(this.zzc, zzekl0);
        }
        zzejx zzejx0 = new zzejx();
        zzeyt.zza(this.zzg, zzejx0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(zzbvk zzbvk0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(zzfca zzfca0) {
        this.zzh.set(true);
        this.zzj.set(false);
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zzdq(zzbvw zzbvw0, String s, String s1) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcvw
    public final void zzdz(zze zze0) {
        zzejz zzejz0 = new zzejz(zze0);
        zzeyt.zza(this.zzc, zzejz0);
        zzeka zzeka0 = new zzeka(zze0);
        zzeyt.zza(this.zzc, zzeka0);
        zzekb zzekb0 = new zzekb(zze0);
        zzeyt.zza(this.zzf, zzekb0);
        this.zzh.set(false);
        this.zzb.clear();
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zze() {
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zzf() {
    }

    public final zzbl zzg() {
        synchronized(this) {
            return (zzbl)this.zzc.get();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcye
    public final void zzh(@NonNull zzu zzu0) {
        zzekm zzekm0 = new zzekm(zzu0);
        zzeyt.zza(this.zze, zzekm0);
    }

    public final zzcm zzi() {
        synchronized(this) {
            return (zzcm)this.zzd.get();
        }
    }

    public final void zzj(zzbl zzbl0) {
        this.zzc.set(zzbl0);
    }

    public final void zzk(zzbo zzbo0) {
        this.zzf.set(zzbo0);
    }

    public final void zzl(zzdr zzdr0) {
        this.zze.set(zzdr0);
    }

    public final void zzm(zzcm zzcm0) {
        this.zzd.set(zzcm0);
        this.zzi.set(true);
        this.zzo();
    }

    public final void zzn(zzct zzct0) {
        this.zzg.set(zzct0);
    }

    private final void zzo() {
        if(this.zzi.get() && this.zzj.get()) {
            for(Object object0: this.zzb) {
                zzejy zzejy0 = new zzejy(((Pair)object0));
                zzeyt.zza(this.zzd, zzejy0);
            }
            this.zzb.clear();
            this.zzh.set(false);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcwj
    public final void zzq(zze zze0) {
        zzeke zzeke0 = new zzeke(zze0);
        zzeyt.zza(this.zzg, zzeke0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        zzeju zzeju0 = new zzeju();
        zzeyt.zza(this.zzc, zzeju0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcxh
    public final void zzs() {
        synchronized(this) {
            zzekc zzekc0 = new zzekc();
            zzeyt.zza(this.zzc, zzekc0);
            zzekd zzekd0 = new zzekd();
            zzeyt.zza(this.zzf, zzekd0);
            this.zzj.set(true);
            this.zzo();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdds
    public final void zzu() {
        zzekh zzekh0 = new zzekh();
        zzeyt.zza(this.zzc, zzekh0);
    }
}


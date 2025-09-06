package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzr;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

public final class zzdbk {
    private final Set zza;
    private final Set zzb;
    private final Set zzc;
    private final Set zzd;
    private final Set zze;
    private final Set zzf;
    private final Set zzg;
    private final Set zzh;
    private final Set zzi;
    private final Set zzj;
    private final Set zzk;
    private final Set zzl;
    private final Set zzm;
    private final Set zzn;
    private zzezc zzo;

    public zzdbk() {
        this.zza = new HashSet();
        this.zzb = new HashSet();
        this.zzc = new HashSet();
        this.zzd = new HashSet();
        this.zze = new HashSet();
        this.zzf = new HashSet();
        this.zzg = new HashSet();
        this.zzh = new HashSet();
        this.zzi = new HashSet();
        this.zzj = new HashSet();
        this.zzk = new HashSet();
        this.zzl = new HashSet();
        this.zzm = new HashSet();
        this.zzn = new HashSet();
    }

    public final zzdbk zza(zza zza0, Executor executor0) {
        zzddk zzddk0 = new zzddk(zza0, executor0);
        this.zzc.add(zzddk0);
        return this;
    }

    public final zzdbk zzb(zzcvw zzcvw0, Executor executor0) {
        zzddk zzddk0 = new zzddk(zzcvw0, executor0);
        this.zzi.add(zzddk0);
        return this;
    }

    public final zzdbk zzc(zzcwj zzcwj0, Executor executor0) {
        zzddk zzddk0 = new zzddk(zzcwj0, executor0);
        this.zzl.add(zzddk0);
        return this;
    }

    public final zzdbk zzd(zzcwn zzcwn0, Executor executor0) {
        zzddk zzddk0 = new zzddk(zzcwn0, executor0);
        this.zzf.add(zzddk0);
        return this;
    }

    public final zzdbk zze(zzcvt zzcvt0, Executor executor0) {
        zzddk zzddk0 = new zzddk(zzcvt0, executor0);
        this.zze.add(zzddk0);
        return this;
    }

    public final zzdbk zzf(zzcxh zzcxh0, Executor executor0) {
        zzddk zzddk0 = new zzddk(zzcxh0, executor0);
        this.zzh.add(zzddk0);
        return this;
    }

    public final zzdbk zzg(zzcxs zzcxs0, Executor executor0) {
        zzddk zzddk0 = new zzddk(zzcxs0, executor0);
        this.zzg.add(zzddk0);
        return this;
    }

    public final zzdbk zzh(zzr zzr0, Executor executor0) {
        zzddk zzddk0 = new zzddk(zzr0, executor0);
        this.zzn.add(zzddk0);
        return this;
    }

    public final zzdbk zzi(zzcye zzcye0, Executor executor0) {
        zzddk zzddk0 = new zzddk(zzcye0, executor0);
        this.zzm.add(zzddk0);
        return this;
    }

    public final zzdbk zzj(zzcyq zzcyq0, Executor executor0) {
        zzddk zzddk0 = new zzddk(zzcyq0, executor0);
        this.zzb.add(zzddk0);
        return this;
    }

    public final zzdbk zzk(AppEventListener appEventListener0, Executor executor0) {
        zzddk zzddk0 = new zzddk(appEventListener0, executor0);
        this.zzk.add(zzddk0);
        return this;
    }

    public final zzdbk zzl(zzdds zzdds0, Executor executor0) {
        zzddk zzddk0 = new zzddk(zzdds0, executor0);
        this.zzd.add(zzddk0);
        return this;
    }

    public final zzdbk zzm(zzezc zzezc0) {
        this.zzo = zzezc0;
        return this;
    }

    public final zzdbm zzn() {
        return new zzdbm(this, null);
    }
}


package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.overlay.zzr;
import java.util.concurrent.atomic.AtomicReference;

public final class zzexm implements zzr, zzcvw, zzcwj, zzcxs, zzcye, zzdds, zzezc {
    private final zzfds zza;
    private final AtomicReference zzb;
    private final AtomicReference zzc;
    private final AtomicReference zzd;
    private final AtomicReference zze;
    private final AtomicReference zzf;
    private final AtomicReference zzg;
    @Nullable
    private zzexm zzh;

    public zzexm(zzfds zzfds0) {
        this.zzb = new AtomicReference();
        this.zzc = new AtomicReference();
        this.zzd = new AtomicReference();
        this.zze = new AtomicReference();
        this.zzf = new AtomicReference();
        this.zzg = new AtomicReference();
        this.zzh = null;
        this.zza = zzfds0;
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdds
    public final void zzdd() {
        zzexm zzexm0 = this.zzh;
        if(zzexm0 != null) {
            zzexm0.zzdd();
            return;
        }
        zzexd zzexd0 = new zzexd();
        zzeyt.zza(this.zzd, zzexd0);
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        zzexm zzexm0 = this.zzh;
        if(zzexm0 != null) {
            zzexm0.zzdo();
            return;
        }
        zzexa zzexa0 = new zzexa();
        zzeyt.zza(this.zzf, zzexa0);
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        zzexm zzexm0 = this.zzh;
        if(zzexm0 != null) {
            zzexm0.zzdp();
            return;
        }
        zzexl zzexl0 = new zzexl();
        zzeyt.zza(this.zzf, zzexl0);
        zzewy zzewy0 = new zzewy();
        zzeyt.zza(this.zzd, zzewy0);
        zzewz zzewz0 = new zzewz();
        zzeyt.zza(this.zzd, zzewz0);
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
        zzexm zzexm0 = this.zzh;
        if(zzexm0 != null) {
            zzexm0.zzdr();
            return;
        }
        zzexk zzexk0 = new zzexk();
        zzeyt.zza(this.zzf, zzexk0);
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int v) {
        zzexm zzexm0 = this.zzh;
        if(zzexm0 != null) {
            zzexm0.zzds(v);
            return;
        }
        zzexg zzexg0 = new zzexg(v);
        zzeyt.zza(this.zzf, zzexg0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcvw
    public final void zzdz(zze zze0) {
        zzexm zzexm0 = this.zzh;
        if(zzexm0 != null) {
            zzexm0.zzdz(zze0);
            return;
        }
        zzexh zzexh0 = new zzexh(zze0);
        zzeyt.zza(this.zzb, zzexh0);
        zzexi zzexi0 = new zzexi(zze0);
        zzeyt.zza(this.zzb, zzexi0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcxs
    public final void zzg() {
        zzexm zzexm0 = this.zzh;
        if(zzexm0 != null) {
            zzexm0.zzg();
            return;
        }
        zzexj zzexj0 = new zzexj();
        zzeyt.zza(this.zze, zzexj0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcye
    public final void zzh(zzu zzu0) {
        zzexm zzexm0 = this.zzh;
        if(zzexm0 != null) {
            zzexm0.zzh(zzu0);
            return;
        }
        zzewx zzewx0 = new zzewx(zzu0);
        zzeyt.zza(this.zzg, zzewx0);
    }

    public static zzexm zzi(zzexm zzexm0) {
        zzexm zzexm1 = new zzexm(zzexm0.zza);
        zzexm1.zzh = zzexm0;
        return zzexm1;
    }

    public final void zzj() {
        zzexm zzexm0 = this.zzh;
        if(zzexm0 != null) {
            zzexm0.zzj();
            return;
        }
        this.zza.zza();
        zzexe zzexe0 = new zzexe();
        zzeyt.zza(this.zzc, zzexe0);
        zzexf zzexf0 = new zzexf();
        zzeyt.zza(this.zzd, zzexf0);
    }

    public final void zzk(zzbad zzbad0) {
        zzexm zzexm0 = this.zzh;
        if(zzexm0 != null) {
            zzexm0.zzk(zzbad0);
            return;
        }
        zzexc zzexc0 = new zzexc(zzbad0);
        zzeyt.zza(this.zzb, zzexc0);
    }

    @Override  // com.google.android.gms.internal.ads.zzezc
    public final void zzl(zzezc zzezc0) {
        this.zzh = (zzexm)zzezc0;
    }

    public final void zzm(zzr zzr0) {
        this.zzf.set(zzr0);
    }

    public final void zzn(zzdr zzdr0) {
        this.zzg.set(zzdr0);
    }

    public final void zzo(zzbag zzbag0) {
        this.zzb.set(zzbag0);
    }

    public final void zzp(zzbak zzbak0) {
        this.zzd.set(zzbak0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcwj
    public final void zzq(zze zze0) {
        zzexm zzexm0 = this.zzh;
        if(zzexm0 != null) {
            zzexm0.zzq(zze0);
            return;
        }
        zzexb zzexb0 = new zzexb(zze0);
        zzeyt.zza(this.zzd, zzexb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdds
    public final void zzu() {
    }
}


package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.concurrent.atomic.AtomicReference;

public final class zzfar implements OnAdMetadataChangedListener, zzcvt, zzcvw, zzcwj, zzcxh, zzcye, zzdds, zzezc {
    private final zzfds zza;
    private final AtomicReference zzb;
    private final AtomicReference zzc;
    private final AtomicReference zzd;
    private final AtomicReference zze;
    private final AtomicReference zzf;
    private final AtomicReference zzg;
    private final AtomicReference zzh;
    private zzfar zzi;

    public zzfar(zzfds zzfds0) {
        this.zzb = new AtomicReference();
        this.zzc = new AtomicReference();
        this.zzd = new AtomicReference();
        this.zze = new AtomicReference();
        this.zzf = new AtomicReference();
        this.zzg = new AtomicReference();
        this.zzh = new AtomicReference();
        this.zzi = null;
        this.zza = zzfds0;
    }

    @Override  // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzfar zzfar0 = this.zzi;
        if(zzfar0 != null) {
            zzfar0.onAdMetadataChanged();
            return;
        }
        zzfaf zzfaf0 = new zzfaf();
        zzeyt.zza(this.zzb, zzfaf0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zza() {
        zzfar zzfar0 = this.zzi;
        if(zzfar0 != null) {
            zzfar0.zza();
            return;
        }
        this.zza.zza();
        zzfan zzfan0 = new zzfan();
        zzeyt.zza(this.zzd, zzfan0);
        zzfao zzfao0 = new zzfao();
        zzeyt.zza(this.zze, zzfao0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zzb() {
        zzfar zzfar0 = this.zzi;
        if(zzfar0 != null) {
            zzfar0.zzb();
            return;
        }
        zzfap zzfap0 = new zzfap();
        zzeyt.zza(this.zze, zzfap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zzc() {
        zzfar zzfar0 = this.zzi;
        if(zzfar0 != null) {
            zzfar0.zzc();
            return;
        }
        zzezz zzezz0 = new zzezz();
        zzeyt.zza(this.zzd, zzezz0);
        zzfaa zzfaa0 = new zzfaa();
        zzeyt.zza(this.zze, zzfaa0);
        zzfab zzfab0 = new zzfab();
        zzeyt.zza(this.zzd, zzfab0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdds
    public final void zzdd() {
        zzfar zzfar0 = this.zzi;
        if(zzfar0 != null) {
            zzfar0.zzdd();
            return;
        }
        zzfag zzfag0 = new zzfag();
        zzeyt.zza(this.zzd, zzfag0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zzdq(zzbvw zzbvw0, String s, String s1) {
        zzfar zzfar0 = this.zzi;
        if(zzfar0 != null) {
            zzfar0.zzdq(zzbvw0, s, s1);
            return;
        }
        zzfaq zzfaq0 = new zzfaq(zzbvw0);
        zzeyt.zza(this.zzd, zzfaq0);
        zzezw zzezw0 = new zzezw(zzbvw0, s, s1);
        zzeyt.zza(this.zzf, zzezw0);
        zzezx zzezx0 = new zzezx(zzbvw0);
        zzeyt.zza(this.zze, zzezx0);
        zzezy zzezy0 = new zzezy(zzbvw0, s, s1);
        zzeyt.zza(this.zzg, zzezy0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcvw
    public final void zzdz(zze zze0) {
        zzfar zzfar0 = this.zzi;
        if(zzfar0 != null) {
            zzfar0.zzdz(zze0);
            return;
        }
        zzfak zzfak0 = new zzfak(zze0);
        zzeyt.zza(this.zzc, zzfak0);
        zzfal zzfal0 = new zzfal(zze0.zza);
        zzeyt.zza(this.zzc, zzfal0);
        zzfam zzfam0 = new zzfam(zze0.zza);
        zzeyt.zza(this.zze, zzfam0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zze() {
        zzfar zzfar0 = this.zzi;
        if(zzfar0 != null) {
            zzfar0.zze();
            return;
        }
        zzfaj zzfaj0 = new zzfaj();
        zzeyt.zza(this.zze, zzfaj0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zzf() {
        zzfar zzfar0 = this.zzi;
        if(zzfar0 != null) {
            zzfar0.zzf();
            return;
        }
        zzezv zzezv0 = new zzezv();
        zzeyt.zza(this.zze, zzezv0);
    }

    public final void zzg(OnAdMetadataChangedListener onAdMetadataChangedListener0) {
        this.zzb.set(onAdMetadataChangedListener0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcye
    public final void zzh(@NonNull zzu zzu0) {
        zzfar zzfar0 = this.zzi;
        if(zzfar0 != null) {
            zzfar0.zzh(zzu0);
            return;
        }
        zzfac zzfac0 = new zzfac(zzu0);
        zzeyt.zza(this.zzh, zzfac0);
    }

    public final void zzi(zzdr zzdr0) {
        this.zzh.set(zzdr0);
    }

    public final void zzj(zzbws zzbws0) {
        this.zzd.set(zzbws0);
    }

    public final void zzk(zzbww zzbww0) {
        this.zzc.set(zzbww0);
    }

    @Override  // com.google.android.gms.internal.ads.zzezc
    public final void zzl(zzezc zzezc0) {
        this.zzi = (zzfar)zzezc0;
    }

    @Deprecated
    public final void zzm(zzbwc zzbwc0) {
        this.zze.set(zzbwc0);
    }

    @Deprecated
    public final void zzn(zzbvx zzbvx0) {
        this.zzg.set(zzbvx0);
    }

    public final void zzo(zzbwx zzbwx0) {
        this.zzf.set(zzbwx0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcwj
    public final void zzq(zze zze0) {
        zzfar zzfar0 = this.zzi;
        if(zzfar0 != null) {
            zzfar0.zzq(zze0);
            return;
        }
        zzfah zzfah0 = new zzfah(zze0);
        zzeyt.zza(this.zzd, zzfah0);
        zzfai zzfai0 = new zzfai(zze0);
        zzeyt.zza(this.zzd, zzfai0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcxh
    public final void zzs() {
        zzfar zzfar0 = this.zzi;
        if(zzfar0 != null) {
            zzfar0.zzs();
            return;
        }
        zzfad zzfad0 = new zzfad();
        zzeyt.zza(this.zzc, zzfad0);
        zzfae zzfae0 = new zzfae();
        zzeyt.zza(this.zze, zzfae0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdds
    public final void zzu() {
    }
}


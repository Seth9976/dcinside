package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.List;

public final class zzfkt extends zzfkp {
    private final zzfkr zza;
    private final zzflo zzb;
    private zzfnb zzc;
    private zzfma zzd;
    private boolean zze;
    private boolean zzf;
    private final String zzg;

    zzfkt(zzfkq zzfkq0, zzfkr zzfkr0, String s) {
        this.zzb = new zzflo();
        this.zze = false;
        this.zzf = false;
        this.zza = zzfkr0;
        this.zzg = s;
        this.zzk(null);
        this.zzd = zzfkr0.zzd() == zzfks.zza || zzfkr0.zzd() == zzfks.zzc ? new zzfmb(s, zzfkr0.zza()) : new zzfme(s, zzfkr0.zzi(), null);
        this.zzd.zzo();
        zzflk.zza().zzd(this);
        this.zzd.zzf(zzfkq0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfkp
    public final void zzb(View view0, zzfkw zzfkw0, @Nullable String s) {
        if(this.zzf) {
            return;
        }
        this.zzb.zzb(view0, zzfkw0, "Ad overlay");
    }

    @Override  // com.google.android.gms.internal.ads.zzfkp
    public final void zzc() {
        if(this.zzf) {
            return;
        }
        this.zzc.clear();
        if(!this.zzf) {
            this.zzb.zzc();
        }
        this.zzf = true;
        this.zzd.zze();
        zzflk.zza().zze(this);
        this.zzd.zzc();
        this.zzd = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzfkp
    public final void zzd(@Nullable View view0) {
        if(!this.zzf && this.zzf() != view0) {
            this.zzk(view0);
            this.zzd.zzb();
            Collection collection0 = zzflk.zza().zzc();
            if(collection0 != null && !collection0.isEmpty()) {
                for(Object object0: collection0) {
                    zzfkt zzfkt0 = (zzfkt)object0;
                    if(zzfkt0 != this && zzfkt0.zzf() == view0) {
                        zzfkt0.zzc.clear();
                    }
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfkp
    public final void zze() {
        if(!this.zze && this.zzd != null) {
            this.zze = true;
            zzflk.zza().zzf(this);
            float f = zzfls.zzb().zza();
            this.zzd.zzl(f);
            this.zzd.zzg(zzfli.zza().zzb());
            this.zzd.zzi(this, this.zza);
        }
    }

    public final View zzf() {
        return (View)this.zzc.get();
    }

    public final zzfma zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzg;
    }

    public final List zzi() {
        return this.zzb.zza();
    }

    // 去混淆评级： 低(20)
    public final boolean zzj() {
        return this.zze && !this.zzf;
    }

    private final void zzk(@Nullable View view0) {
        this.zzc = new zzfnb(view0);
    }
}


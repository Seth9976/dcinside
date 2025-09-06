package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import java.lang.ref.WeakReference;

public final class zzdoa extends zzcqz {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdgc zze;
    private final zzdcw zzf;
    private final zzcwg zzg;
    private final zzcxn zzh;
    private final zzcru zzi;
    private final zzbwm zzj;
    private final zzfnt zzk;
    private final zzfcc zzl;
    private boolean zzm;

    zzdoa(zzcqy zzcqy0, Context context0, @Nullable zzcex zzcex0, zzdgc zzdgc0, zzdcw zzdcw0, zzcwg zzcwg0, zzcxn zzcxn0, zzcru zzcru0, zzfbo zzfbo0, zzfnt zzfnt0, zzfcc zzfcc0) {
        super(zzcqy0);
        this.zzm = false;
        this.zzc = context0;
        this.zze = zzdgc0;
        this.zzd = new WeakReference(zzcex0);
        this.zzf = zzdcw0;
        this.zzg = zzcwg0;
        this.zzh = zzcxn0;
        this.zzi = zzcru0;
        this.zzk = zzfnt0;
        this.zzj = new zzbxg((zzfbo0.zzl == null ? "" : zzfbo0.zzl.zza), (zzfbo0.zzl == null ? 1 : zzfbo0.zzl.zzb));
        this.zzl = zzfcc0;
    }

    @Override
    public final void finalize() throws Throwable {
        try {
            zzcex zzcex0 = (zzcex)this.zzd.get();
            if(!((Boolean)zzbe.zzc().zza(zzbcl.zzgA)).booleanValue()) {
                if(zzcex0 != null) {
                    zzcex0.destroy();
                }
            }
            else if(!this.zzm && zzcex0 != null) {
                zzdnz zzdnz0 = new zzdnz(zzcex0);
                zzbzw.zzf.execute(zzdnz0);
            }
        }
        finally {
            super.finalize();
        }
    }

    public final Bundle zza() {
        return this.zzh.zzb();
    }

    public final zzbwm zzc() {
        return this.zzj;
    }

    public final zzfcc zzd() {
        return this.zzl;
    }

    public final boolean zze() {
        return this.zzi.zzg();
    }

    public final boolean zzf() {
        return this.zzm;
    }

    public final boolean zzg() {
        zzcex zzcex0 = (zzcex)this.zzd.get();
        return zzcex0 != null && !zzcex0.zzaG();
    }

    public final boolean zzh(boolean z, @Nullable Activity activity0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzaM)).booleanValue() && zzs.zzH(this.zzc)) {
            zzo.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
            this.zzg.zzb();
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzaN)).booleanValue()) {
                this.zzk.zza(this.zza.zzb.zzb.zzb);
            }
            return false;
        }
        if(this.zzm) {
            zzo.zzj("The rewarded ad have been showed.");
            zze zze0 = zzfdk.zzd(10, null, null);
            this.zzg.zza(zze0);
            return false;
        }
        this.zzm = true;
        this.zzf.zzb();
        if(activity0 == null) {
            activity0 = this.zzc;
        }
        try {
            this.zze.zza(z, activity0, this.zzg);
            this.zzf.zza();
            return true;
        }
        catch(zzdgb zzdgb0) {
            this.zzg.zzc(zzdgb0);
            return false;
        }
    }
}


package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import java.lang.ref.WeakReference;
import o3.h;

public final class zzdeq extends zzcqz {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdcw zze;
    private final zzdgc zzf;
    private final zzcru zzg;
    private final zzfnt zzh;
    private final zzcwg zzi;
    private final zzbzq zzj;
    private boolean zzk;

    zzdeq(zzcqy zzcqy0, Context context0, @h zzcex zzcex0, zzdcw zzdcw0, zzdgc zzdgc0, zzcru zzcru0, zzfnt zzfnt0, zzcwg zzcwg0, zzbzq zzbzq0) {
        super(zzcqy0);
        this.zzk = false;
        this.zzc = context0;
        this.zzd = new WeakReference(zzcex0);
        this.zze = zzdcw0;
        this.zzf = zzdgc0;
        this.zzg = zzcru0;
        this.zzh = zzfnt0;
        this.zzi = zzcwg0;
        this.zzj = zzbzq0;
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
            else if(!this.zzk && zzcex0 != null) {
                zzdep zzdep0 = new zzdep(zzcex0);
                zzbzw.zzf.execute(zzdep0);
            }
        }
        finally {
            super.finalize();
        }
    }

    public final boolean zza() {
        return this.zzg.zzg();
    }

    public final boolean zzc(boolean z, @h Activity activity0) {
        this.zze.zzb();
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzaM)).booleanValue() || !zzs.zzH(this.zzc)) {
            zzcex zzcex0 = (zzcex)this.zzd.get();
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzlL)).booleanValue() && zzcex0 != null) {
                zzfbo zzfbo0 = zzcex0.zzD();
                if(zzfbo0 != null && zzfbo0.zzar) {
                    int v = this.zzj.zzb();
                    if(zzfbo0.zzas != v) {
                        zzo.zzj("The interstitial consent form has been shown.");
                        zze zze0 = zzfdk.zzd(12, "The consent form has already been shown.", null);
                        this.zzi.zza(zze0);
                        return false;
                    }
                }
            }
            if(this.zzk) {
                zzo.zzj("The interstitial ad has been shown.");
                zze zze1 = zzfdk.zzd(10, null, null);
                this.zzi.zza(zze1);
            }
            if(!this.zzk) {
                if(activity0 == null) {
                    activity0 = this.zzc;
                }
                try {
                    this.zzf.zza(z, activity0, this.zzi);
                    this.zze.zza();
                    this.zzk = true;
                    return true;
                }
                catch(zzdgb zzdgb0) {
                    this.zzi.zzc(zzdgb0);
                }
            }
        }
        else {
            zzo.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
            this.zzi.zzb();
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzaN)).booleanValue()) {
                this.zzh.zza(this.zza.zzb.zzb.zzb);
                return false;
            }
        }
        return false;
    }
}


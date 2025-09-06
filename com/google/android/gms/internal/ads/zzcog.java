package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;

public final class zzcog extends zzcqz {
    @Nullable
    private final zzcex zzc;
    private final int zzd;
    private final Context zze;
    private final zzcnu zzf;
    private final zzdgc zzg;
    private final zzdcw zzh;
    private final zzcwg zzi;
    private final boolean zzj;
    private final zzbzq zzk;
    private boolean zzl;

    zzcog(zzcqy zzcqy0, Context context0, @Nullable zzcex zzcex0, int v, zzcnu zzcnu0, zzdgc zzdgc0, zzdcw zzdcw0, zzcwg zzcwg0, zzbzq zzbzq0) {
        super(zzcqy0);
        this.zzl = false;
        this.zzc = zzcex0;
        this.zze = context0;
        this.zzd = v;
        this.zzf = zzcnu0;
        this.zzg = zzdgc0;
        this.zzh = zzdcw0;
        this.zzi = zzcwg0;
        this.zzj = ((Boolean)zzbe.zzc().zza(zzbcl.zzfq)).booleanValue();
        this.zzk = zzbzq0;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzcqz
    public final void zzb() {
        super.zzb();
        zzcex zzcex0 = this.zzc;
        if(zzcex0 != null) {
            zzcex0.destroy();
        }
    }

    public final void zzc(zzazx zzazx0) {
        zzcex zzcex0 = this.zzc;
        if(zzcex0 != null) {
            zzcex0.zzak(zzazx0);
        }
    }

    public final void zzd(Activity activity0, zzbak zzbak0, boolean z) throws RemoteException {
        if(activity0 == null) {
            activity0 = this.zze;
        }
        if(this.zzj) {
            this.zzh.zzb();
        }
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzaM)).booleanValue() || !zzs.zzH(activity0)) {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzlL)).booleanValue()) {
                zzcex zzcex0 = this.zzc;
                if(zzcex0 != null) {
                    zzfbo zzfbo0 = zzcex0.zzD();
                    if(zzfbo0 != null && zzfbo0.zzar) {
                        int v = this.zzk.zzb();
                        if(zzfbo0.zzas != v) {
                            zzo.zzj("The app open consent form has been shown.");
                            zze zze0 = zzfdk.zzd(12, "The consent form has already been shown.", null);
                            this.zzi.zza(zze0);
                            return;
                        }
                    }
                }
            }
            if(this.zzl) {
                zzo.zzj("App open interstitial ad is already visible.");
                zze zze1 = zzfdk.zzd(10, null, null);
                this.zzi.zza(zze1);
            }
            if(!this.zzl) {
                try {
                    this.zzg.zza(z, activity0, this.zzi);
                    if(this.zzj) {
                        this.zzh.zza();
                    }
                    this.zzl = true;
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
                new zzfnt(activity0.getApplicationContext(), zzv.zzu().zzb()).zza(this.zza.zzb.zzb.zzb);
            }
        }
    }

    public final void zze(long v, int v1) {
        this.zzf.zza(v, v1);
    }
}


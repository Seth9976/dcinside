package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzo;
import o3.j;

public final class zzdgh implements zzcvt, zzdcx {
    private final zzbye zza;
    private final Context zzb;
    private final zzbyi zzc;
    @Nullable
    private final View zzd;
    private String zze;
    private final zzbbq.zza.zza zzf;

    public zzdgh(zzbye zzbye0, Context context0, zzbyi zzbyi0, @Nullable View view0, zzbbq.zza.zza zzbbq$zza$zza0) {
        this.zza = zzbye0;
        this.zzb = context0;
        this.zzc = zzbyi0;
        this.zzd = view0;
        this.zzf = zzbbq$zza$zza0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zza() {
        this.zza.zzb(false);
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zzb() {
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zzc() {
        View view0 = this.zzd;
        if(view0 != null && this.zze != null) {
            Context context0 = view0.getContext();
            this.zzc.zzo(context0, this.zze);
        }
        this.zza.zzb(true);
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    @j
    public final void zzdq(zzbvw zzbvw0, String s, String s1) {
        if(this.zzc.zzp(this.zzb)) {
            try {
                String s2 = this.zzc.zza(this.zzb);
                String s3 = zzbvw0.zzc();
                int v = zzbvw0.zzb();
                this.zzc.zzl(this.zzb, s2, this.zza.zza(), s3, v);
            }
            catch(RemoteException remoteException0) {
                zzo.zzk("Remote Exception to get reward item.", remoteException0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zze() {
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zzf() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdcx
    public final void zzk() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdcx
    public final void zzl() {
        if(this.zzf == zzbbq.zza.zza.zzk) {
            return;
        }
        this.zze = this.zzc.zzc(this.zzb) + (this.zzf == zzbbq.zza.zza.zzh ? "/Rewarded" : "/Interstitial");
    }
}


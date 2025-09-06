package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.zzc;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.t0;
import j..util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public final class zzeeb implements zzedc {
    private final Context zza;
    private final zzcpq zzb;
    private final Executor zzc;

    public zzeeb(Context context0, zzcpq zzcpq0, Executor executor0) {
        this.zza = context0;
        this.zzb = zzcpq0;
        this.zzc = executor0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedc
    public final Object zza(zzfca zzfca0, zzfbo zzfbo0, zzecz zzecz0) throws zzfcq, zzegu {
        View view0;
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzhJ)).booleanValue() || !zzfbo0.zzag) {
            view0 = ((zzfdh)zzecz0.zzb).zza();
        }
        else {
            zzbpn zzbpn0 = ((zzfdh)zzecz0.zzb).zzc();
            if(zzbpn0 == null) {
                zzo.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfcq(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                view0 = (View)ObjectWrapper.unwrap(zzbpn0.zze());
                boolean z = zzbpn0.zzf();
            }
            catch(RemoteException remoteException0) {
                throw new zzfcq(remoteException0);
            }
            if(view0 == null) {
                throw new zzfcq(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
            }
            if(z) {
                t0 t00 = zzgch.zzn(zzgch.zzh(null), (Object object0) -> zzgch.zzh(zzcql.zza(this.zza, view0, zzfbo0)), zzbzw.zzf);
                try {
                    view0 = (View)t00.get();
                    goto label_19;
                }
                catch(InterruptedException | ExecutionException interruptedException0) {
                    throw new zzfcq(interruptedException0);
                }
                throw new zzfcq(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
            }
        }
    label_19:
        zzcrp zzcrp0 = new zzcrp(zzfca0, zzfbo0, zzecz0.zza);
        Objects.requireNonNull(((zzfdh)zzecz0.zzb));
        zzcot zzcot0 = new zzcot(view0, null, new zzeea(((zzfdh)zzecz0.zzb)), ((zzfbp)zzfbo0.zzu.get(0)));
        zzcon zzcon0 = this.zzb.zza(zzcrp0, zzcot0);
        zzcon0.zzg().zza(view0);
        zzcon0.zzd().zzo(new zzcma(((zzfdh)zzecz0.zzb)), this.zzc);
        zzeik zzeik0 = zzcon0.zzk();
        ((zzees)zzecz0.zzc).zzc(zzeik0);
        return zzcon0.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzedc
    public final void zzb(zzfca zzfca0, zzfbo zzfbo0, zzecz zzecz0) throws zzfcq {
        zzs zzs1;
        zzs zzs0 = zzfca0.zza.zza.zze;
        if(zzs0.zzn) {
            AdSize adSize0 = zzc.zzd(zzs0.zze, zzs0.zzb);
            zzs1 = new zzs(this.zza, adSize0);
        }
        else if(!((Boolean)zzbe.zzc().zza(zzbcl.zzhJ)).booleanValue() || !zzfbo0.zzag) {
            zzs1 = zzfcp.zza(this.zza, zzfbo0.zzu);
        }
        else {
            AdSize adSize1 = zzc.zze(zzs0.zze, zzs0.zzb);
            zzs1 = new zzs(this.zza, adSize1);
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzhJ)).booleanValue() && zzfbo0.zzag) {
            String s = zzbs.zzm(zzfbo0.zzs);
            ((zzfdh)zzecz0.zzb).zzn(this.zza, zzs1, zzfca0.zza.zza.zzd, zzfbo0.zzv.toString(), s, ((zzbpk)zzecz0.zzc));
            return;
        }
        String s1 = zzbs.zzm(zzfbo0.zzs);
        ((zzfdh)zzecz0.zzb).zzm(this.zza, zzs1, zzfca0.zza.zza.zzd, zzfbo0.zzv.toString(), s1, ((zzbpk)zzecz0.zzc));
    }

    // 检测为 Lambda 实现
    final t0 zzc(View view0, zzfbo zzfbo0, Object object0) throws Exception [...]
}


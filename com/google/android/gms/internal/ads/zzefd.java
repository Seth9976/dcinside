package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbs;
import java.util.concurrent.Executor;

public final class zzefd implements zzedc {
    private final Context zza;
    private final zzdfu zzb;
    private final VersionInfoParcel zzc;
    private final Executor zzd;

    public zzefd(Context context0, VersionInfoParcel versionInfoParcel0, zzdfu zzdfu0, Executor executor0) {
        this.zza = context0;
        this.zzc = versionInfoParcel0;
        this.zzb = zzdfu0;
        this.zzd = executor0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedc
    public final Object zza(zzfca zzfca0, zzfbo zzfbo0, zzecz zzecz0) throws zzfcq, zzegu {
        zzcrp zzcrp0 = new zzcrp(zzfca0, zzfbo0, zzecz0.zza);
        zzdeu zzdeu0 = new zzdeu((boolean z, Context context0, zzcwg zzcwg0) -> {
            try {
                ((zzfdh)zzecz0.zzb).zzv(z);
                if(this.zzc.clientJarVersion < ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzaS))))) {
                    ((zzfdh)zzecz0.zzb).zzx();
                    return;
                }
                ((zzfdh)zzecz0.zzb).zzy(context0);
                return;
            }
            catch(zzfcq zzfcq0) {
            }
            zzo.zzi("Cannot show interstitial.");
            throw new zzdgb(zzfcq0.getCause());
        }, null);
        zzder zzder0 = this.zzb.zze(zzcrp0, zzdeu0);
        zzder0.zzd().zzo(new zzcma(((zzfdh)zzecz0.zzb)), this.zzd);
        zzeik zzeik0 = zzder0.zzk();
        ((zzees)zzecz0.zzc).zzc(zzeik0);
        return zzder0.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzedc
    public final void zzb(zzfca zzfca0, zzfbo zzfbo0, zzecz zzecz0) throws zzfcq {
        String s = zzbs.zzm(zzfbo0.zzs);
        ((zzfdh)zzecz0.zzb).zzo(this.zza, zzfca0.zza.zza.zzd, zzfbo0.zzv.toString(), s, ((zzbpk)zzecz0.zzc));
    }

    // 检测为 Lambda 实现
    final void zzc(zzecz zzecz0, boolean z, Context context0, zzcwg zzcwg0) throws zzdgb [...]
}


package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.common.util.concurrent.t0;
import java.util.Iterator;

public final class zzeii implements zzecw {
    private final zzecy zza;
    private final zzedc zzb;
    private final zzfgn zzc;
    private final zzgcs zzd;

    public zzeii(zzfgn zzfgn0, zzgcs zzgcs0, zzecy zzecy0, zzedc zzedc0) {
        this.zzc = zzfgn0;
        this.zzd = zzgcs0;
        this.zzb = zzedc0;
        this.zza = zzecy0;
    }

    @Override  // com.google.android.gms.internal.ads.zzecw
    public final t0 zza(zzfca zzfca0, zzfbo zzfbo0) {
        zzecz zzecz0;
        Iterator iterator0 = zzfbo0.zzt.iterator();
        while(true) {
            zzecz0 = null;
            if(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                String s = (String)object0;
                try {
                    zzecz0 = this.zza.zza(s, zzfbo0.zzv);
                }
                catch(zzfcq unused_ex) {
                    continue;
                }
            }
            break;
        }
        if(zzecz0 == null) {
            return zzgch.zzg(new zzefy("Unable to instantiate mediation adapter class."));
        }
        zzcab zzcab0 = new zzcab();
        zzeih zzeih0 = new zzeih(this, zzecz0, zzcab0);
        zzecz0.zzc.zza(zzeih0);
        if(zzfbo0.zzM) {
            Bundle bundle0 = zzfca0.zza.zza.zzd.zzm;
            Class class0 = AdMobAdapter.class;
            Bundle bundle1 = bundle0.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
            if(bundle1 == null) {
                bundle1 = new Bundle();
                bundle0.putBundle(class0.getName(), bundle1);
            }
            bundle1.putBoolean("render_test_ad_label", true);
        }
        return zzffx.zzd(() -> this.zzb.zzb(zzfca0, zzfbo0, zzecz0), this.zzd, zzfgh.zzq, this.zzc).zzb(zzfgh.zzr).zzd(zzcab0).zzb(zzfgh.zzs).zze((Void void0) -> this.zzb.zza(zzfca0, zzfbo0, zzecz0)).zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzecw
    public final boolean zzb(zzfca zzfca0, zzfbo zzfbo0) {
        return !zzfbo0.zzt.isEmpty();
    }

    // 检测为 Lambda 实现
    final Object zzc(zzfca zzfca0, zzfbo zzfbo0, zzecz zzecz0, Void void0) throws Exception [...]

    // 检测为 Lambda 实现
    final void zzd(zzfca zzfca0, zzfbo zzfbo0, zzecz zzecz0) throws Exception [...]

    @VisibleForTesting
    static final String zze(String s, int v) [...] // Inlined contents
}


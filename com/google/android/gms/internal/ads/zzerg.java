package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.t0;

public final class zzerg implements zzetr {
    private final Context zza;
    private final Intent zzb;

    zzerg(Context context0, Intent intent0) {
        this.zza = context0;
        this.zzb = intent0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 60;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        zze.zza("HsdpMigrationSignal.produce");
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzmG)).booleanValue()) {
            try {
                PackageManager packageManager0 = this.zza.getPackageManager();
                if(this.zzb.resolveActivity(packageManager0) != null) {
                    zze.zza("HSDP intent is supported");
                    return zzgch.zzh(new zzerh(Boolean.TRUE));
                }
            }
            catch(Exception exception0) {
                zzv.zzp().zzw(exception0, "HsdpMigrationSignal.isHsdpMigrationSupported");
                return zzgch.zzh(new zzerh(Boolean.FALSE));
            }
            return zzgch.zzh(new zzerh(Boolean.FALSE));
        }
        return zzgch.zzh(new zzerh(null));
    }
}


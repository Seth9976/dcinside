package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;

public final class zzenm implements zzetq {
    private final Context zza;
    private final Bundle zzb;
    private final String zzc;
    private final String zzd;
    private final zzg zze;
    @Nullable
    private final String zzf;
    private final zzctc zzg;

    public zzenm(Context context0, Bundle bundle0, String s, String s1, zzg zzg0, @Nullable String s2, zzctc zzctc0) {
        this.zza = context0;
        this.zzb = bundle0;
        this.zzc = s;
        this.zzd = s1;
        this.zze = zzg0;
        this.zzf = s2;
        this.zzg = zzctc0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
        ((zzcuv)object0).zzb.putBundle("quality_signals", this.zzb);
        this.zzc(((zzcuv)object0).zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        Bundle bundle0 = ((zzcuv)object0).zza;
        bundle0.putBundle("quality_signals", this.zzb);
        bundle0.putString("seq_num", this.zzc);
        if(!this.zze.zzN()) {
            bundle0.putString("session_id", this.zzd);
        }
        bundle0.putBoolean("client_purpose_one", !this.zze.zzN());
        this.zzc(bundle0);
        if(this.zzf != null) {
            Bundle bundle1 = new Bundle();
            bundle1.putLong("dload", this.zzg.zzb(this.zzf));
            bundle1.putInt("pcc", this.zzg.zza(this.zzf));
            bundle0.putBundle("ad_unit_quality_signals", bundle1);
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzjD)).booleanValue() && zzv.zzp().zza() > 0) {
            bundle0.putInt("nrwv", zzv.zzp().zza());
        }
    }

    private final void zzc(Bundle bundle0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzfA)).booleanValue()) {
            try {
                bundle0.putString("_app_id", zzs.zzq(this.zza));
            }
            catch(RuntimeException | RemoteException runtimeException0) {
                zzv.zzp().zzw(runtimeException0, "AppStatsSignal_AppId");
            }
        }
    }
}


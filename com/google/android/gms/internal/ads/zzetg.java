package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;

public final class zzetg implements zzetq {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    @Nullable
    public final String zzh;

    zzetg(boolean z, boolean z1, String s, boolean z2, int v, int v1, int v2, @Nullable String s1) {
        this.zza = z;
        this.zzb = z1;
        this.zzc = s;
        this.zzd = z2;
        this.zze = v;
        this.zzf = v1;
        this.zzg = v2;
        this.zzh = s1;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
        ((zzcuv)object0).zzb.putString("js", this.zzc);
        ((zzcuv)object0).zzb.putInt("target_api", this.zze);
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        Bundle bundle0 = ((zzcuv)object0).zza;
        bundle0.putString("js", this.zzc);
        bundle0.putBoolean("is_nonagon", true);
        bundle0.putString("extra_caps", ((String)zzbe.zzc().zza(zzbcl.zzdP)));
        bundle0.putInt("target_api", this.zze);
        bundle0.putInt("dv", this.zzf);
        bundle0.putInt("lv", this.zzg);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzfO)).booleanValue() && !TextUtils.isEmpty(this.zzh)) {
            bundle0.putString("ev", this.zzh);
        }
        Bundle bundle1 = zzfcx.zza(bundle0, "sdk_env");
        bundle1.putBoolean("mf", ((Boolean)zzbel.zzc.zze()).booleanValue());
        bundle1.putBoolean("instant_app", this.zza);
        bundle1.putBoolean("lite", this.zzb);
        bundle1.putBoolean("is_privileged_process", this.zzd);
        bundle0.putBundle("sdk_env", bundle1);
        Bundle bundle2 = zzfcx.zza(bundle1, "build_meta");
        bundle2.putString("cl", "697668803");
        bundle2.putString("rapid_rc", "dev");
        bundle2.putString("rapid_rollup", "HEAD");
        bundle1.putBundle("build_meta", bundle2);
    }
}


package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

public final class zzeue implements zzetq {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final boolean zze;
    public final int zzf;

    public zzeue(String s, int v, int v1, int v2, boolean z, int v3) {
        this.zza = s;
        this.zzb = v;
        this.zzc = v1;
        this.zzd = v2;
        this.zze = z;
        this.zzf = v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        Bundle bundle0 = ((zzcuv)object0).zza;
        boolean z = TextUtils.isEmpty(this.zza);
        boolean z1 = true;
        zzfcx.zzf(bundle0, "carrier", this.zza, !z);
        int v = this.zzb;
        if(v == -2) {
            z1 = false;
        }
        zzfcx.zze(bundle0, "cnt", v, z1);
        bundle0.putInt("gnt", this.zzc);
        bundle0.putInt("pt", this.zzd);
        Bundle bundle1 = zzfcx.zza(bundle0, "device");
        bundle0.putBundle("device", bundle1);
        Bundle bundle2 = zzfcx.zza(bundle1, "network");
        bundle1.putBundle("network", bundle2);
        bundle2.putInt("active_network_state", this.zzf);
        bundle2.putBoolean("active_network_metered", this.zze);
    }
}


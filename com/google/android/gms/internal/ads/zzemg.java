package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

public final class zzemg implements zzetq {
    public final zzs zza;
    @Nullable
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    @Nullable
    public final String zzh;
    public final boolean zzi;

    public zzemg(zzs zzs0, @Nullable String s, boolean z, String s1, float f, int v, int v1, @Nullable String s2, boolean z1) {
        Preconditions.checkNotNull(zzs0, "the adSize must not be null");
        this.zza = zzs0;
        this.zzb = s;
        this.zzc = z;
        this.zzd = s1;
        this.zze = f;
        this.zzf = v;
        this.zzg = v1;
        this.zzh = s2;
        this.zzi = z1;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
        this.zzc(((zzcuv)object0).zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        this.zzc(((zzcuv)object0).zza);
    }

    private final void zzc(Bundle bundle0) {
        zzfcx.zzf(bundle0, "smart_w", "full", this.zza.zze == -1);
        zzfcx.zzf(bundle0, "smart_h", "auto", this.zza.zzb == -2);
        zzfcx.zzg(bundle0, "ene", true, this.zza.zzj);
        zzfcx.zzf(bundle0, "rafmt", "102", this.zza.zzm);
        zzfcx.zzf(bundle0, "rafmt", "103", this.zza.zzn);
        zzfcx.zzf(bundle0, "rafmt", "105", this.zza.zzo);
        zzfcx.zzg(bundle0, "inline_adaptive_slot", true, this.zzi);
        zzfcx.zzg(bundle0, "interscroller_slot", true, this.zza.zzo);
        zzfcx.zzc(bundle0, "format", this.zzb);
        zzfcx.zzf(bundle0, "fluid", "height", this.zzc);
        boolean z = TextUtils.isEmpty(this.zzd);
        zzfcx.zzf(bundle0, "sz", this.zzd, !z);
        bundle0.putFloat("u_sd", this.zze);
        bundle0.putInt("sw", this.zzf);
        bundle0.putInt("sh", this.zzg);
        boolean z1 = TextUtils.isEmpty(this.zzh);
        zzfcx.zzf(bundle0, "sc", this.zzh, !z1);
        ArrayList arrayList0 = new ArrayList();
        zzs[] arr_zzs = this.zza.zzg;
        if(arr_zzs == null) {
            Bundle bundle1 = new Bundle();
            bundle1.putInt("height", this.zza.zzb);
            bundle1.putInt("width", this.zza.zze);
            bundle1.putBoolean("is_fluid_height", this.zza.zzi);
            arrayList0.add(bundle1);
        }
        else {
            for(int v = 0; v < arr_zzs.length; ++v) {
                zzs zzs0 = arr_zzs[v];
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("is_fluid_height", zzs0.zzi);
                bundle2.putInt("height", zzs0.zzb);
                bundle2.putInt("width", zzs0.zze);
                arrayList0.add(bundle2);
            }
        }
        bundle0.putParcelableArrayList("valid_ad_sizes", arrayList0);
    }
}


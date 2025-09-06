package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.ArrayList;
import o3.h;
import o3.j;

@j
public final class zzeua implements zzetq {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final boolean zze;
    public final boolean zzf;
    public final String zzg;
    public final ArrayList zzh;
    @h
    public final String zzi;
    @h
    public final String zzj;
    public final String zzk;
    public final boolean zzl;
    public final String zzm;
    public final long zzn;
    public final boolean zzo;
    @h
    public final String zzp;
    public final int zzq;

    public zzeua(boolean z, boolean z1, String s, boolean z2, boolean z3, boolean z4, String s1, ArrayList arrayList0, @h String s2, @h String s3, String s4, boolean z5, String s5, long v, boolean z6, @h String s6, int v1) {
        this.zza = z;
        this.zzb = z1;
        this.zzc = s;
        this.zzd = z2;
        this.zze = z3;
        this.zzf = z4;
        this.zzg = s1;
        this.zzh = arrayList0;
        this.zzi = s2;
        this.zzj = s3;
        this.zzk = s4;
        this.zzl = z5;
        this.zzm = s5;
        this.zzn = v;
        this.zzo = z6;
        this.zzp = s6;
        this.zzq = v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
        Bundle bundle0 = ((zzcuv)object0).zzb;
        bundle0.putBoolean("simulator", this.zzd);
        bundle0.putInt("build_api_level", this.zzq);
        if(!this.zzh.isEmpty()) {
            bundle0.putStringArrayList("hl_list", this.zzh);
        }
        bundle0.putString("submodel", this.zzm);
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        Bundle bundle0 = ((zzcuv)object0).zza;
        bundle0.putBoolean("cog", this.zza);
        bundle0.putBoolean("coh", this.zzb);
        bundle0.putString("gl", this.zzc);
        bundle0.putBoolean("simulator", this.zzd);
        bundle0.putBoolean("is_latchsky", this.zze);
        bundle0.putInt("build_api_level", this.zzq);
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzkT)).booleanValue()) {
            bundle0.putBoolean("is_sidewinder", this.zzf);
        }
        bundle0.putString("hl", this.zzg);
        if(!this.zzh.isEmpty()) {
            bundle0.putStringArrayList("hl_list", this.zzh);
        }
        bundle0.putString("mv", this.zzi);
        bundle0.putString("submodel", this.zzm);
        Bundle bundle1 = zzfcx.zza(bundle0, "device");
        bundle0.putBundle("device", bundle1);
        bundle1.putString("build", this.zzk);
        bundle1.putLong("remaining_data_partition_space", this.zzn);
        Bundle bundle2 = zzfcx.zza(bundle1, "browser");
        bundle1.putBundle("browser", bundle2);
        bundle2.putBoolean("is_browser_custom_tabs_capable", this.zzl);
        if(!TextUtils.isEmpty(this.zzj)) {
            Bundle bundle3 = zzfcx.zza(bundle1, "play_store");
            bundle1.putBundle("play_store", bundle3);
            bundle3.putString("package_version", this.zzj);
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzlj)).booleanValue()) {
            bundle0.putBoolean("is_bstar", this.zzo);
        }
        if(!TextUtils.isEmpty(this.zzp)) {
            bundle0.putString("v_unity", this.zzp);
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzld)).booleanValue()) {
            zzfcx.zzg(bundle0, "gotmt_l", true, ((Boolean)zzbe.zzc().zza(zzbcl.zzla)).booleanValue());
            zzfcx.zzg(bundle0, "gotmt_i", true, ((Boolean)zzbe.zzc().zza(zzbcl.zzkZ)).booleanValue());
        }
    }
}


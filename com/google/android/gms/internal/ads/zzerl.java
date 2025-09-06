package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;

public final class zzerl implements zzetq {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;

    public zzerl(String s, boolean z, boolean z1, boolean z2, boolean z3) {
        this.zza = s;
        this.zzb = z;
        this.zzc = z1;
        this.zzd = z2;
        this.zze = z3;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
        Bundle bundle0 = ((zzcuv)object0).zzb;
        if(!this.zza.isEmpty()) {
            bundle0.putString("inspector_extras", this.zza);
        }
        bundle0.putInt("test_mode", ((int)this.zzb));
        bundle0.putInt("linked_device", ((int)this.zzc));
        if((this.zzb || this.zzc) && ((Boolean)zzbe.zzc().zza(zzbcl.zzjh)).booleanValue()) {
            bundle0.putBoolean("collect_response_logs", this.zze);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        Bundle bundle0 = ((zzcuv)object0).zza;
        if(!this.zza.isEmpty()) {
            bundle0.putString("inspector_extras", this.zza);
        }
        bundle0.putInt("test_mode", ((int)this.zzb));
        bundle0.putInt("linked_device", ((int)this.zzc));
        if(this.zzb || this.zzc) {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzjd)).booleanValue()) {
                bundle0.putInt("risd", !this.zzd);
            }
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzjh)).booleanValue()) {
                bundle0.putBoolean("collect_response_logs", this.zze);
            }
        }
    }
}


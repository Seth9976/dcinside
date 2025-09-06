package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;

public final class zzesm implements zzetq {
    private zzfra zza;
    private zzfra zzb;
    private boolean zzc;
    private boolean zzd;
    private final boolean zze;
    private final boolean zzf;

    public zzesm(zzfra zzfra0, zzfra zzfra1, boolean z, boolean z1, boolean z2) {
        this.zza = zzfra0;
        this.zzb = zzfra1;
        this.zzc = z;
        this.zzd = z1;
        this.zze = false;
        this.zzf = z2;
    }

    public zzesm(boolean z) {
        this.zze = true;
        this.zzf = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        Bundle bundle0 = ((zzcuv)object0).zza;
        if(!this.zze) {
            Bundle bundle1 = zzfcx.zza(bundle0, "pii");
            if((!this.zzf && ((Boolean)zzbe.zzc().zza(zzbcl.zzde)).booleanValue() || this.zzf && ((Boolean)zzbe.zzc().zza(zzbcl.zzdg)).booleanValue()) && this.zza.zzc()) {
                bundle1.putString("paidv1_id_android", this.zza.zzb());
                bundle1.putLong("paidv1_creation_time_android", this.zza.zza());
            }
            if(!this.zzf && ((Boolean)zzbe.zzc().zza(zzbcl.zzdf)).booleanValue() || this.zzf && ((Boolean)zzbe.zzc().zza(zzbcl.zzdh)).booleanValue()) {
                if(this.zzb.zzc()) {
                    bundle1.putString("paidv2_id_android", this.zzb.zzb());
                    bundle1.putLong("paidv2_creation_time_android", this.zzb.zza());
                }
                bundle1.putBoolean("paidv2_pub_option_android", this.zzc);
                bundle1.putBoolean("paidv2_user_option_android", this.zzd);
            }
            if(!bundle1.isEmpty()) {
                bundle0.putBundle("pii", bundle1);
            }
        }
    }
}


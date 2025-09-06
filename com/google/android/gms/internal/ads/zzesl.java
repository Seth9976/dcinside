package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.t0;
import java.io.IOException;

public final class zzesl implements zzetr {
    private final Context zza;
    private final zzgcs zzb;
    private final zzfcj zzc;
    private final VersionInfoParcel zzd;

    zzesl(Context context0, zzgcs zzgcs0, zzfcj zzfcj0, VersionInfoParcel versionInfoParcel0) {
        this.zza = context0;
        this.zzb = zzgcs0;
        this.zzc = zzfcj0;
        this.zzd = versionInfoParcel0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 53;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        zzesk zzesk0 = () -> {
            boolean z3;
            zzfra zzfra2;
            boolean z2;
            try {
                Context context0 = this.zza;
                boolean z = this.zzc.zzb();
                zzfra zzfra0 = new zzfra();
                zzfra zzfra1 = new zzfra();
                boolean z1 = true;
                if(z && !((Boolean)zzbe.zzc().zza(zzbcl.zzdi)).booleanValue()) {
                    return new zzesm(true);
                }
                if(!z && ((Boolean)zzbe.zzc().zza(zzbcl.zzde)).booleanValue() || z && ((Boolean)zzbe.zzc().zza(zzbcl.zzdg)).booleanValue()) {
                    zzfra0 = zzfre.zzj(context0).zzh(((long)(((Long)zzbe.zzc().zza(zzbcl.zzdp)))), zzv.zzp().zzi().zzN());
                }
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzdm)).booleanValue() && this.zzd.clientJarVersion < ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzdl))))) {
                    zzfrf.zzi(context0).zzj();
                }
                if((z || !((Boolean)zzbe.zzc().zza(zzbcl.zzdf)).booleanValue()) && (!z || !((Boolean)zzbe.zzc().zza(zzbcl.zzdh)).booleanValue())) {
                    zzfra2 = zzfra1;
                    z3 = true;
                    z2 = true;
                }
                else {
                    zzfrf zzfrf0 = zzfrf.zzi(context0);
                    zzfrb zzfrb0 = zzfrb.zza(context0);
                    if(this.zzd.clientJarVersion >= ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzdl))))) {
                        zzfra1 = zzfrf0.zzh(((long)(((Long)zzbe.zzc().zza(zzbcl.zzdq)))), zzv.zzp().zzi().zzN());
                        z1 = zzfrb0.zzd();
                    }
                    z2 = zzfrb0.zze();
                    zzfra2 = zzfra1;
                    z3 = z1;
                }
                return new zzesm(zzfra0, zzfra2, z3, z2, z);
            }
            catch(IOException iOException0) {
            }
            zzv.zzp().zzw(iOException0, "PerAppIdSignal");
            return new zzesm(this.zzc.zzb());
        };
        return this.zzb.zzb(zzesk0);
    }

    // 检测为 Lambda 实现
    final zzesm zzc() throws Exception [...]
}


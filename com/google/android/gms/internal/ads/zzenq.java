package com.google.android.gms.internal.ads;

import android.os.Build.VERSION;
import android.os.ext.SdkExtensions;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import o3.h;

public final class zzenq implements zzetq {
    @h
    private final Integer zza;

    private zzenq(@h Integer integer0) {
        this.zza = integer0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        Integer integer0 = this.zza;
        if(integer0 != null) {
            ((zzcuv)object0).zza.putInt("aos", ((int)integer0));
        }
    }

    static zzenq zzc(VersionInfoParcel versionInfoParcel0) {
        int v;
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzjT)).booleanValue()) {
            try {
                v = 0;
                int v1 = Build.VERSION.SDK_INT;
                if(v1 >= 30 && SdkExtensions.getExtensionVersion(30) > 3) {
                    v = SdkExtensions.getExtensionVersion(1000000);
                    return new zzenq(v);
                }
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzjW)).booleanValue() && versionInfoParcel0.clientJarVersion >= ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzjV)))) && v1 >= 0x1F && SdkExtensions.getExtensionVersion(0x1F) >= 9) {
                    v = SdkExtensions.getExtensionVersion(0x1F);
                    return new zzenq(v);
                }
            }
            catch(Exception exception0) {
                zzv.zzp().zzw(exception0, "AdUtil.getAdServicesExtensionVersion");
                return new zzenq(v);
            }
            return new zzenq(0);
        }
        return new zzenq(null);
    }
}


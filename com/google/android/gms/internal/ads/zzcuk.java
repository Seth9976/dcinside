package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzau;

public final class zzcuk implements zzfuc {
    public final Context zza;
    public final VersionInfoParcel zzb;
    public final zzfcj zzc;

    public zzcuk(Context context0, VersionInfoParcel versionInfoParcel0, zzfcj zzfcj0) {
        this.zza = context0;
        this.zzb = versionInfoParcel0;
        this.zzc = zzfcj0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuc
    public final Object apply(Object object0) {
        zzau zzau0 = new zzau(this.zza);
        zzau0.zzp(((zzfbo)object0).zzB);
        zzau0.zzq(((zzfbo)object0).zzC.toString());
        zzau0.zzo(this.zzb.afmaVersion);
        zzau0.zzn(this.zzc.zzf);
        return zzau0;
    }
}


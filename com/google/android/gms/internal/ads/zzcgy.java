package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;

public final class zzcgy {
    private VersionInfoParcel zza;
    private Context zzb;
    private long zzc;
    private WeakReference zzd;

    public final zzcgy zzd(long v) {
        this.zzc = v;
        return this;
    }

    public final zzcgy zze(Context context0) {
        this.zzd = new WeakReference(context0);
        if(context0.getApplicationContext() != null) {
            context0 = context0.getApplicationContext();
        }
        this.zzb = context0;
        return this;
    }

    public final zzcgy zzf(VersionInfoParcel versionInfoParcel0) {
        this.zza = versionInfoParcel0;
        return this;
    }
}


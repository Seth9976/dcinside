package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbd;
import o3.h;
import o3.j;

@j
public final class zzbog {
    @VisibleForTesting
    static final zzbd zza;
    @VisibleForTesting
    static final zzbd zzb;
    private final zzbns zzc;

    static {
        zzbog.zza = new zzboe();
        zzbog.zzb = new zzbof();
    }

    public zzbog(Context context0, VersionInfoParcel versionInfoParcel0, String s, @h zzfhk zzfhk0) {
        this.zzc = new zzbns(context0, versionInfoParcel0, s, zzbog.zza, zzbog.zzb, zzfhk0);
    }

    public final zzbnw zza(String s, zzbnz zzbnz0, zzbny zzbny0) {
        return new zzbok(this.zzc, s, zzbnz0, zzbny0);
    }

    public final zzbop zzb() {
        return new zzbop(this.zzc);
    }
}


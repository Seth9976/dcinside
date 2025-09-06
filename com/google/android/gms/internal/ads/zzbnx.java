package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import o3.j;

@j
public final class zzbnx {
    private final Object zza;
    private final Object zzb;
    private zzbog zzc;
    private zzbog zzd;

    public zzbnx() {
        this.zza = new Object();
        this.zzb = new Object();
    }

    public final zzbog zza(Context context0, VersionInfoParcel versionInfoParcel0, @Nullable zzfhk zzfhk0) {
        synchronized(this.zza) {
            if(this.zzc == null) {
                this.zzc = new zzbog(zzbnx.zzc(context0), versionInfoParcel0, ((String)zzbe.zzc().zza(zzbcl.zza)), zzfhk0);
            }
            return this.zzc;
        }
    }

    public final zzbog zzb(Context context0, VersionInfoParcel versionInfoParcel0, zzfhk zzfhk0) {
        synchronized(this.zzb) {
            if(this.zzd == null) {
                this.zzd = new zzbog(zzbnx.zzc(context0), versionInfoParcel0, "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40-loader.html", zzfhk0);
            }
            return this.zzd;
        }
    }

    private static final Context zzc(Context context0) {
        Context context1 = context0.getApplicationContext();
        return context1 == null ? context0 : context1;
    }
}


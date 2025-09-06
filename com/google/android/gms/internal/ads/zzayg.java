package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

public final class zzayg {
    private final String zza;
    @Nullable
    private final JSONObject zzb;
    private final String zzc;
    private final String zzd;
    private final boolean zze;

    public zzayg(String s, VersionInfoParcel versionInfoParcel0, String s1, @Nullable JSONObject jSONObject0, boolean z, boolean z1) {
        this.zzd = versionInfoParcel0.afmaVersion;
        this.zzb = jSONObject0;
        this.zzc = s;
        this.zza = s1;
        this.zze = z1;
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzc;
    }

    @Nullable
    public final JSONObject zzd() {
        return this.zzb;
    }

    public final boolean zze() {
        return this.zze;
    }
}


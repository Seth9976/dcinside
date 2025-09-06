package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class zzfkq {
    private final zzflb zza;
    private final zzflb zzb;
    private final boolean zzc;
    private final zzfku zzd;
    private final zzfkx zze;

    private zzfkq(zzfku zzfku0, zzfkx zzfkx0, zzflb zzflb0, zzflb zzflb1, boolean z) {
        this.zzd = zzfku0;
        this.zze = zzfkx0;
        this.zza = zzflb0;
        this.zzb = zzflb1 == null ? zzflb.zzc : zzflb1;
        this.zzc = z;
    }

    public static zzfkq zza(zzfku zzfku0, zzfkx zzfkx0, zzflb zzflb0, zzflb zzflb1, boolean z) {
        zzfmk.zzc(zzfku0, "CreativeType is null");
        zzfmk.zzc(zzfkx0, "ImpressionType is null");
        zzfmk.zzc(zzflb0, "Impression owner is null");
        if(zzflb0 == zzflb.zzc) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if(zzfku0 == zzfku.zza && zzflb0 == zzflb.zza) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if(zzfkx0 == zzfkx.zza && zzflb0 == zzflb.zza) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new zzfkq(zzfku0, zzfkx0, zzflb0, zzflb1, z);
    }

    public final JSONObject zzb() {
        JSONObject jSONObject0 = new JSONObject();
        zzfmg.zze(jSONObject0, "impressionOwner", this.zza);
        zzfmg.zze(jSONObject0, "mediaEventsOwner", this.zzb);
        zzfmg.zze(jSONObject0, "creativeType", this.zzd);
        zzfmg.zze(jSONObject0, "impressionType", this.zze);
        zzfmg.zze(jSONObject0, "isolateVerificationScripts", Boolean.valueOf(this.zzc));
        return jSONObject0;
    }
}


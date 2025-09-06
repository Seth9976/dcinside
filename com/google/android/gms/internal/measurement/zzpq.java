package com.google.android.gms.internal.measurement;

public final class zzpq implements zzpr {
    private static final zzhj zza;

    static {
        zzhr zzhr0 = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzhr0.zza("measurement.collection.enable_session_stitching_token.client.dev", true);
        zzhr0.zza("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        zzpq.zza = zzhr0.zza("measurement.session_stitching_token_enabled", false);
        zzhr0.zza("measurement.link_sst_to_sid", true);
    }

    @Override  // com.google.android.gms.internal.measurement.zzpr
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzpr
    public final boolean zzb() {
        return ((Boolean)zzpq.zza.zza()).booleanValue();
    }
}


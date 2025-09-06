package com.google.android.gms.internal.measurement;

public final class zzpv implements zzps {
    private static final zzhj zza;
    private static final zzhj zzb;

    static {
        zzhr zzhr0 = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzhr0.zza("measurement.client.sessions.background_sessions_enabled", true);
        zzpv.zza = zzhr0.zza("measurement.client.sessions.enable_fix_background_engagement", false);
        zzhr0.zza("measurement.client.sessions.immediate_start_enabled_foreground", true);
        zzpv.zzb = zzhr0.zza("measurement.client.sessions.enable_pause_engagement_in_background", true);
        zzhr0.zza("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        zzhr0.zza("measurement.client.sessions.session_id_enabled", true);
        zzhr0.zza("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override  // com.google.android.gms.internal.measurement.zzps
    public final boolean zza() {
        return ((Boolean)zzpv.zza.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzps
    public final boolean zzb() {
        return ((Boolean)zzpv.zzb.zza()).booleanValue();
    }
}


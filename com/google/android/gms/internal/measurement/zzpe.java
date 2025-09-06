package com.google.android.gms.internal.measurement;

public final class zzpe implements zzpf {
    private static final zzhj zza;

    static {
        zzhr zzhr0 = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzhr0.zza("measurement.sdk.collection.enable_extend_user_property_size", true);
        zzhr0.zza("measurement.sdk.collection.last_deep_link_referrer2", true);
        zzpe.zza = zzhr0.zza("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        zzhr0.zza("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override  // com.google.android.gms.internal.measurement.zzpf
    public final boolean zza() {
        return ((Boolean)zzpe.zza.zza()).booleanValue();
    }
}


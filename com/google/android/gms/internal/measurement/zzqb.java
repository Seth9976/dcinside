package com.google.android.gms.internal.measurement;

public final class zzqb implements zzpy {
    private static final zzhj zza;

    static {
        zzqb.zza = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zzb().zza().zza("measurement.integration.disable_firebase_instance_id", false);
    }

    @Override  // com.google.android.gms.internal.measurement.zzpy
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzpy
    public final boolean zzb() {
        return ((Boolean)zzqb.zza.zza()).booleanValue();
    }
}


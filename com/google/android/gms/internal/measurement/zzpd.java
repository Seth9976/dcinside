package com.google.android.gms.internal.measurement;

public final class zzpd implements zzpa {
    private static final zzhj zza;

    static {
        zzhr zzhr0 = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzpd.zza = zzhr0.zza("measurement.gmscore_network_migration", false);
        zzhr0.zza("measurement.id.gmscore_network_migration", 0L);
    }

    @Override  // com.google.android.gms.internal.measurement.zzpa
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzpa
    public final boolean zzb() {
        return ((Boolean)zzpd.zza.zza()).booleanValue();
    }
}


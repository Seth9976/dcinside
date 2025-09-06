package com.google.android.gms.internal.measurement;

public final class zzqg implements zzqe {
    private static final zzhj zza;

    static {
        zzhr zzhr0 = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzqg.zza = zzhr0.zza("measurement.currency.escape_underscore_fix", true);
        zzhr0.zza("measurement.validation.value_and_currency_params", true);
    }

    @Override  // com.google.android.gms.internal.measurement.zzqe
    public final boolean zza() {
        return ((Boolean)zzqg.zza.zza()).booleanValue();
    }
}


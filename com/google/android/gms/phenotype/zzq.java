package com.google.android.gms.phenotype;

final class zzq implements zza {
    private final String zzav;
    private final boolean zzaw;

    zzq(String s, boolean z) {
        this.zzav = s;
        this.zzaw = false;
    }

    @Override  // com.google.android.gms.phenotype.PhenotypeFlag$zza
    public final Object zzh() {
        return PhenotypeFlag.zzb(this.zzav, this.zzaw);
    }
}


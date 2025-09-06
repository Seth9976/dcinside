package com.google.android.gms.internal.measurement;

final class zzkr implements zzkz {
    private zzkz[] zza;

    zzkr(zzkz[] arr_zzkz) {
        this.zza = arr_zzkz;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkz
    public final zzla zza(Class class0) {
        zzkz[] arr_zzkz = this.zza;
        for(int v = 0; v < arr_zzkz.length; ++v) {
            zzkz zzkz0 = arr_zzkz[v];
            if(zzkz0.zzb(class0)) {
                return zzkz0.zza(class0);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + class0.getName());
    }

    @Override  // com.google.android.gms.internal.measurement.zzkz
    public final boolean zzb(Class class0) {
        zzkz[] arr_zzkz = this.zza;
        for(int v = 0; v < arr_zzkz.length; ++v) {
            if(arr_zzkz[v].zzb(class0)) {
                return true;
            }
        }
        return false;
    }
}


package com.google.android.gms.internal.vision;

final class zzkd implements zzkl {
    private zzkl[] zza;

    zzkd(zzkl[] arr_zzkl) {
        this.zza = arr_zzkl;
    }

    @Override  // com.google.android.gms.internal.vision.zzkl
    public final boolean zza(Class class0) {
        zzkl[] arr_zzkl = this.zza;
        for(int v = 0; v < arr_zzkl.length; ++v) {
            if(arr_zzkl[v].zza(class0)) {
                return true;
            }
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.vision.zzkl
    public final zzki zzb(Class class0) {
        zzkl[] arr_zzkl = this.zza;
        for(int v = 0; v < arr_zzkl.length; ++v) {
            zzkl zzkl0 = arr_zzkl[v];
            if(zzkl0.zza(class0)) {
                return zzkl0.zzb(class0);
            }
        }
        String s = class0.getName();
        throw new UnsupportedOperationException((s.length() == 0 ? new String("No factory is available for message type: ") : "No factory is available for message type: " + s));
    }
}


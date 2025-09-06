package com.google.android.gms.internal.clearcut;

final class zzdf implements zzdn {
    private zzdn[] zzma;

    zzdf(zzdn[] arr_zzdn) {
        this.zzma = arr_zzdn;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzdn
    public final boolean zza(Class class0) {
        zzdn[] arr_zzdn = this.zzma;
        for(int v = 0; v < arr_zzdn.length; ++v) {
            if(arr_zzdn[v].zza(class0)) {
                return true;
            }
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzdn
    public final zzdm zzb(Class class0) {
        zzdn[] arr_zzdn = this.zzma;
        for(int v = 0; v < arr_zzdn.length; ++v) {
            zzdn zzdn0 = arr_zzdn[v];
            if(zzdn0.zza(class0)) {
                return zzdn0.zzb(class0);
            }
        }
        String s = class0.getName();
        throw new UnsupportedOperationException((s.length() == 0 ? new String("No factory is available for message type: ") : "No factory is available for message type: " + s));
    }
}


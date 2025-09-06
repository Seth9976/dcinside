package com.google.android.gms.internal.ads;

final class zzgyt implements zzgza {
    private final zzgza[] zza;

    zzgyt(zzgza[] arr_zzgza) {
        this.zza = arr_zzgza;
    }

    @Override  // com.google.android.gms.internal.ads.zzgza
    public final zzgyz zzb(Class class0) {
        for(int v = 0; v < 2; ++v) {
            zzgza zzgza0 = this.zza[v];
            if(zzgza0.zzc(class0)) {
                return zzgza0.zzb(class0);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + class0.getName());
    }

    @Override  // com.google.android.gms.internal.ads.zzgza
    public final boolean zzc(Class class0) {
        for(int v = 0; v < 2; ++v) {
            if(this.zza[v].zzc(class0)) {
                return true;
            }
        }
        return false;
    }
}


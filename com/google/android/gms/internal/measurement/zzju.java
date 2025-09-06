package com.google.android.gms.internal.measurement;

final class zzju implements zzkz {
    private static final zzju zza;

    static {
        zzju.zza = new zzju();
    }

    public static zzju zza() {
        return zzju.zza;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkz
    public final zzla zza(Class class0) {
        Class class1 = zzjt.class;
        if(class1.isAssignableFrom(class0)) {
            try {
                return (zzla)zzjt.zza(class0.asSubclass(class1)).zza(zze.zzc, null, null);
            }
            catch(Exception exception0) {
                throw new RuntimeException("Unable to get message info for " + class0.getName(), exception0);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + class0.getName());
    }

    @Override  // com.google.android.gms.internal.measurement.zzkz
    public final boolean zzb(Class class0) {
        return zzjt.class.isAssignableFrom(class0);
    }
}


package com.google.android.gms.internal.ads;

final class zzgxk implements zzgza {
    private static final zzgxk zza;

    static {
        zzgxk.zza = new zzgxk();
    }

    public static zzgxk zza() {
        return zzgxk.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzgza
    public final zzgyz zzb(Class class0) {
        Class class1 = zzgxr.class;
        if(class1.isAssignableFrom(class0)) {
            try {
                return (zzgyz)zzgxr.zzbh(class0.asSubclass(class1)).zzbO();
            }
            catch(Exception exception0) {
                throw new RuntimeException("Unable to get message info for " + class0.getName(), exception0);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + class0.getName());
    }

    @Override  // com.google.android.gms.internal.ads.zzgza
    public final boolean zzc(Class class0) {
        return zzgxr.class.isAssignableFrom(class0);
    }
}


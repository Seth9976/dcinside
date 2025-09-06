package com.google.android.gms.internal.vision;

final class zzir {
    private static final zziq zza;
    private static final zziq zzb;

    static {
        zzir.zza = new zzip();
        zzir.zzb = zzir.zzc();
    }

    static zziq zza() {
        return zzir.zza;
    }

    static zziq zzb() {
        zziq zziq0 = zzir.zzb;
        if(zziq0 == null) {
            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
        }
        return zziq0;
    }

    private static zziq zzc() {
        try {
            return (zziq)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }
}


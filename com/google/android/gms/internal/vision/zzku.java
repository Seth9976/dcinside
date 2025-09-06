package com.google.android.gms.internal.vision;

final class zzku {
    private static final zzks zza;
    private static final zzks zzb;

    static {
        zzku.zza = zzku.zzc();
        zzku.zzb = new zzkv();
    }

    static zzks zza() {
        return zzku.zza;
    }

    static zzks zzb() {
        return zzku.zzb;
    }

    private static zzks zzc() {
        try {
            return (zzks)Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }
}


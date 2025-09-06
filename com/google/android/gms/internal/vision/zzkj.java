package com.google.android.gms.internal.vision;

final class zzkj {
    private static final zzkh zza;
    private static final zzkh zzb;

    static {
        zzkj.zza = zzkj.zzc();
        zzkj.zzb = new zzkg();
    }

    static zzkh zza() {
        return zzkj.zza;
    }

    static zzkh zzb() {
        return zzkj.zzb;
    }

    private static zzkh zzc() {
        try {
            return (zzkh)Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }
}


package com.google.android.gms.internal.clearcut;

final class zzbx {
    private static final zzbu zzgr;
    private static final zzbu zzgs;

    static {
        zzbx.zzgr = new zzbv();
        zzbx.zzgs = zzbx.zzao();
    }

    private static zzbu zzao() {
        try {
            return (zzbu)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    static zzbu zzap() {
        return zzbx.zzgr;
    }

    static zzbu zzaq() {
        zzbu zzbu0 = zzbx.zzgs;
        if(zzbu0 == null) {
            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
        }
        return zzbu0;
    }
}


package com.google.android.gms.internal.clearcut;

public abstract class zzbk {
    private int zzfq;
    private int zzfr;
    private boolean zzfs;
    private static volatile boolean zzft = true;

    static {
    }

    private zzbk() {
        this.zzfq = 100;
        this.zzfr = 0x7FFFFFFF;
        this.zzfs = false;
    }

    zzbk(zzbl zzbl0) {
    }

    public static long zza(long v) [...] // Inlined contents

    static zzbk zza(byte[] arr_b, int v, int v1, boolean z) {
        zzbk zzbk0 = new zzbm(arr_b, 0, v1, false, null);
        try {
            zzbk0.zzl(v1);
            return zzbk0;
        }
        catch(zzco zzco0) {
            throw new IllegalArgumentException(zzco0);
        }
    }

    public abstract int zzaf();

    public abstract int zzl(int arg1) throws zzco;

    public static int zzm(int v) [...] // Inlined contents
}


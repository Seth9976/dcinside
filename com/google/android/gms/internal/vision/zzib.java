package com.google.android.gms.internal.vision;

final class zzib {
    private final zzii zza;
    private final byte[] zzb;

    private zzib(int v) {
        byte[] arr_b = new byte[v];
        this.zzb = arr_b;
        this.zza = zzii.zza(arr_b);
    }

    zzib(int v, zzhs zzhs0) {
        this(v);
    }

    public final zzht zza() {
        this.zza.zzb();
        return new zzid(this.zzb);
    }

    public final zzii zzb() {
        return this.zza;
    }
}


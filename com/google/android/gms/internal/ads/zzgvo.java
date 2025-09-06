package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzgvo {
    private final byte[] zza;

    private zzgvo(byte[] arr_b, int v, int v1) {
        byte[] arr_b1 = new byte[v1];
        this.zza = arr_b1;
        System.arraycopy(arr_b, 0, arr_b1, 0, v1);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzgvo ? Arrays.equals(((zzgvo)object0).zza, this.zza) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    @Override
    public final String toString() {
        byte[] arr_b = this.zza;
        StringBuilder stringBuilder0 = new StringBuilder(arr_b.length + arr_b.length);
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            stringBuilder0.append("0123456789abcdef".charAt((v1 & 0xFF) >> 4));
            stringBuilder0.append("0123456789abcdef".charAt(v1 & 15));
        }
        return "Bytes(" + stringBuilder0.toString() + ")";
    }

    public final int zza() {
        return this.zza.length;
    }

    public static zzgvo zzb(byte[] arr_b) {
        if(arr_b == null) {
            throw new NullPointerException("data must be non-null");
        }
        return new zzgvo(arr_b, 0, arr_b.length);
    }

    public final byte[] zzc() {
        byte[] arr_b = new byte[this.zza.length];
        System.arraycopy(this.zza, 0, arr_b, 0, this.zza.length);
        return arr_b;
    }
}


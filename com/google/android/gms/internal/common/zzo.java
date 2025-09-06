package com.google.android.gms.internal.common;

final class zzo extends zzn {
    private final char zza;

    zzo(char c) {
        this.zza = c;
    }

    @Override
    public final String toString() {
        char[] arr_c = {'\\', 'u', '\u0000', '\u0000', '\u0000', '\u0000'};
        int v = this.zza;
        for(int v1 = 0; v1 < 4; ++v1) {
            arr_c[5 - v1] = "0123456789ABCDEF".charAt(v & 15);
            v >>= 4;
        }
        return "CharMatcher.is(\'" + String.copyValueOf(arr_c) + "\')";
    }

    @Override  // com.google.android.gms.internal.common.zzr
    public final boolean zza(char c) {
        return c == this.zza;
    }
}


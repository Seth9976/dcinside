package com.google.android.gms.internal.ads;

import java.io.IOException;

public abstract class zzgaa {
    private static final zzgaa zza;

    static {
        new zzfzx("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", Character.valueOf('='));
        new zzfzx("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", Character.valueOf('='));
        new zzfzz("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", Character.valueOf('='));
        new zzfzz("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", Character.valueOf('='));
        zzgaa.zza = new zzfzw("base16()", "0123456789ABCDEF");
    }

    abstract int zza(byte[] arg1, CharSequence arg2) throws zzfzy;

    abstract void zzc(Appendable arg1, byte[] arg2, int arg3, int arg4) throws IOException;

    abstract int zzd(int arg1);

    abstract int zze(int arg1);

    public abstract zzgaa zzf();

    CharSequence zzg(CharSequence charSequence0) {
        throw null;
    }

    public static zzgaa zzi() {
        return zzgaa.zza;
    }

    public final String zzj(byte[] arr_b, int v, int v1) {
        zzfun.zzk(0, v1, arr_b.length);
        StringBuilder stringBuilder0 = new StringBuilder(this.zze(v1));
        try {
            this.zzc(stringBuilder0, arr_b, 0, v1);
            return stringBuilder0.toString();
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }

    public final byte[] zzk(CharSequence charSequence0) {
        try {
            CharSequence charSequence1 = this.zzg(charSequence0);
            int v = this.zzd(charSequence1.length());
            byte[] arr_b = new byte[v];
            int v1 = this.zza(arr_b, charSequence1);
            if(v1 != v) {
                byte[] arr_b1 = new byte[v1];
                System.arraycopy(arr_b, 0, arr_b1, 0, v1);
                return arr_b1;
            }
            return arr_b;
        }
        catch(zzfzy zzfzy0) {
            throw new IllegalArgumentException(zzfzy0);
        }
    }
}


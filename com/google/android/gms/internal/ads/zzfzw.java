package com.google.android.gms.internal.ads;

import java.io.IOException;
import o3.a;

final class zzfzw extends zzfzz {
    final char[] zza;

    private zzfzw(zzfzv zzfzv0) {
        super(zzfzv0, null);
        this.zza = new char[0x200];
        zzfun.zze(zzfzv0.zzf.length == 16);
        for(int v = 0; v < 0x100; ++v) {
            this.zza[v] = zzfzv0.zza(v >>> 4);
            this.zza[v | 0x100] = zzfzv0.zza(v & 15);
        }
    }

    zzfzw(String s, String s1) {
        this(new zzfzv("base16()", "0123456789ABCDEF".toCharArray()));
    }

    @Override  // com.google.android.gms.internal.ads.zzfzz
    final int zza(byte[] arr_b, CharSequence charSequence0) throws zzfzy {
        if(charSequence0.length() % 2 == 1) {
            throw new zzfzy("Invalid input length " + charSequence0.length());
        }
        int v = 0;
        int v1;
        for(v1 = 0; v < charSequence0.length(); ++v1) {
            int v2 = charSequence0.charAt(v);
            int v3 = this.zzb.zzb(((char)v2));
            int v4 = charSequence0.charAt(v + 1);
            arr_b[v1] = (byte)(v3 << 4 | this.zzb.zzb(((char)v4)));
            v += 2;
        }
        return v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzfzz
    final zzgaa zzb(zzfzv zzfzv0, @a Character character0) {
        return new zzfzw(zzfzv0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfzz
    final void zzc(Appendable appendable0, byte[] arr_b, int v, int v1) throws IOException {
        zzfun.zzk(0, v1, arr_b.length);
        for(int v2 = 0; v2 < v1; ++v2) {
            int v3 = arr_b[v2] & 0xFF;
            appendable0.append(this.zza[v3]);
            appendable0.append(this.zza[v3 | 0x100]);
        }
    }
}


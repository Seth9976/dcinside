package com.google.android.gms.internal.ads;

import java.io.IOException;
import o3.a;

final class zzfzx extends zzfzz {
    private zzfzx(zzfzv zzfzv0, @a Character character0) {
        super(zzfzv0, character0);
        zzfun.zze(zzfzv0.zzf.length == 0x40);
    }

    zzfzx(String s, String s1, @a Character character0) {
        this(new zzfzv(s, s1.toCharArray()), character0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfzz
    final int zza(byte[] arr_b, CharSequence charSequence0) throws zzfzy {
        CharSequence charSequence1 = this.zzg(charSequence0);
        int v = charSequence1.length();
        if(!this.zzb.zzd(v)) {
            throw new zzfzy("Invalid input length " + charSequence1.length());
        }
        int v1 = 0;
        int v2 = 0;
        while(v1 < charSequence1.length()) {
            int v3 = charSequence1.charAt(v1);
            int v4 = this.zzb.zzb(((char)v3));
            int v5 = charSequence1.charAt(v1 + 1);
            int v6 = v4 << 18 | this.zzb.zzb(((char)v5)) << 12;
            arr_b[v2] = (byte)(v6 >>> 16);
            if(v1 + 2 < charSequence1.length()) {
                int v7 = v1 + 3;
                int v8 = charSequence1.charAt(v1 + 2);
                int v9 = v6 | this.zzb.zzb(((char)v8)) << 6;
                int v10 = v2 + 2;
                arr_b[v2 + 1] = (byte)(v9 >>> 8 & 0xFF);
                if(v7 < charSequence1.length()) {
                    v1 += 4;
                    int v11 = charSequence1.charAt(v7);
                    v2 += 3;
                    arr_b[v10] = (byte)((v9 | this.zzb.zzb(((char)v11))) & 0xFF);
                }
                else {
                    v2 = v10;
                    v1 = v7;
                }
            }
            else {
                v1 += 2;
                ++v2;
            }
        }
        return v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzfzz
    final zzgaa zzb(zzfzv zzfzv0, @a Character character0) {
        return new zzfzx(zzfzv0, character0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfzz
    final void zzc(Appendable appendable0, byte[] arr_b, int v, int v1) throws IOException {
        int v2 = 0;
        zzfun.zzk(0, v1, arr_b.length);
        for(int v3 = v1; v3 >= 3; v3 -= 3) {
            int v4 = (arr_b[v2 + 1] & 0xFF) << 8 | (arr_b[v2] & 0xFF) << 16 | arr_b[v2 + 2] & 0xFF;
            appendable0.append(this.zzb.zza(v4 >>> 18));
            appendable0.append(this.zzb.zza(v4 >>> 12 & 0x3F));
            appendable0.append(this.zzb.zza(v4 >>> 6 & 0x3F));
            appendable0.append(this.zzb.zza(v4 & 0x3F));
            v2 += 3;
        }
        if(v2 < v1) {
            this.zzh(appendable0, arr_b, v2, v1 - v2);
        }
    }
}


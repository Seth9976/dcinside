package com.google.android.gms.internal.ads;

import j..util.Objects;
import java.io.IOException;
import java.math.RoundingMode;
import o3.a;

class zzfzz extends zzgaa {
    @a
    private volatile zzgaa zza;
    final zzfzv zzb;
    @a
    final Character zzc;

    zzfzz(zzfzv zzfzv0, @a Character character0) {
        this.zzb = zzfzv0;
        zzfun.zzi(character0 == null || !zzfzv0.zze('='), "Padding character %s was already in alphabet", character0);
        this.zzc = character0;
    }

    zzfzz(String s, String s1, @a Character character0) {
        this(new zzfzv(s, s1.toCharArray()), character0);
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(@a Object object0) {
        return object0 instanceof zzfzz && this.zzb.equals(((zzfzz)object0).zzb) && Objects.equals(this.zzc, ((zzfzz)object0).zzc);
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(this.zzc) ^ this.zzb.hashCode();
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("BaseEncoding.");
        stringBuilder0.append(this.zzb);
        if(8 % this.zzb.zzb != 0) {
            if(this.zzc == null) {
                stringBuilder0.append(".omitPadding()");
                return stringBuilder0.toString();
            }
            stringBuilder0.append(".withPadChar(\'");
            stringBuilder0.append(this.zzc);
            stringBuilder0.append("\')");
        }
        return stringBuilder0.toString();
    }

    @Override  // com.google.android.gms.internal.ads.zzgaa
    int zza(byte[] arr_b, CharSequence charSequence0) throws zzfzy {
        zzfzv zzfzv0;
        CharSequence charSequence1 = this.zzg(charSequence0);
        int v = charSequence1.length();
        if(!this.zzb.zzd(v)) {
            throw new zzfzy("Invalid input length " + charSequence1.length());
        }
        int v2 = 0;
        for(int v1 = 0; v1 < charSequence1.length(); v1 += this.zzb.zzc) {
            long v3 = 0L;
            int v5 = 0;
            for(int v4 = 0; true; ++v4) {
                zzfzv0 = this.zzb;
                if(v4 >= zzfzv0.zzc) {
                    break;
                }
                v3 <<= zzfzv0.zzb;
                if(v1 + v4 < charSequence1.length()) {
                    int v6 = charSequence1.charAt(v5 + v1);
                    v3 |= (long)this.zzb.zzb(((char)v6));
                    ++v5;
                }
            }
            int v7 = zzfzv0.zzd;
            int v8 = v5 * zzfzv0.zzb;
            int v9 = (v7 - 1) * 8;
            while(v9 >= v7 * 8 - v8) {
                arr_b[v2] = (byte)(((int)(v3 >>> v9 & 0xFFL)));
                v9 -= 8;
                ++v2;
            }
        }
        return v2;
    }

    zzgaa zzb(zzfzv zzfzv0, @a Character character0) {
        return new zzfzz(zzfzv0, character0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgaa
    void zzc(Appendable appendable0, byte[] arr_b, int v, int v1) throws IOException {
        zzfun.zzk(0, v1, arr_b.length);
        for(int v2 = 0; v2 < v1; v2 += this.zzb.zzd) {
            this.zzh(appendable0, arr_b, v2, Math.min(this.zzb.zzd, v1 - v2));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgaa
    final int zzd(int v) {
        return (int)((((long)this.zzb.zzb) * ((long)v) + 7L) / 8L);
    }

    @Override  // com.google.android.gms.internal.ads.zzgaa
    final int zze(int v) {
        int v1 = zzgaj.zzb(v, this.zzb.zzd, RoundingMode.CEILING);
        return this.zzb.zzc * v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgaa
    public final zzgaa zzf() {
        zzgaa zzgaa0 = this.zza;
        if(zzgaa0 == null) {
            zzfzv zzfzv0 = this.zzb.zzc();
            zzgaa0 = zzfzv0 == this.zzb ? this : this.zzb(zzfzv0, this.zzc);
            this.zza = zzgaa0;
        }
        return zzgaa0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgaa
    final CharSequence zzg(CharSequence charSequence0) {
        charSequence0.getClass();
        if(this.zzc == null) {
            return charSequence0;
        }
        int v = charSequence0.length();
        do {
            --v;
        }
        while(v >= 0 && charSequence0.charAt(v) == 61);
        return charSequence0.subSequence(0, v + 1);
    }

    final void zzh(Appendable appendable0, byte[] arr_b, int v, int v1) throws IOException {
        zzfun.zzk(v, v + v1, arr_b.length);
        int v2 = 0;
        zzfun.zze(v1 <= this.zzb.zzd);
        long v3 = 0L;
        for(int v4 = 0; v4 < v1; ++v4) {
            v3 = (v3 | ((long)(arr_b[v + v4] & 0xFF))) << 8;
        }
        zzfzv zzfzv0 = this.zzb;
        while(v2 < v1 * 8) {
            appendable0.append(this.zzb.zza(this.zzb.zza & ((int)(v3 >>> (v1 + 1) * 8 - zzfzv0.zzb - v2))));
            v2 += this.zzb.zzb;
        }
        if(this.zzc != null) {
            while(v2 < this.zzb.zzd * 8) {
                this.zzc.charValue();
                appendable0.append('=');
                v2 += this.zzb.zzb;
            }
        }
    }
}


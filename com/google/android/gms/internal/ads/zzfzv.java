package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Arrays;
import o3.a;

final class zzfzv {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;
    private final boolean zzi;

    zzfzv(String s, char[] arr_c) {
        byte[] arr_b = new byte[0x80];
        Arrays.fill(arr_b, -1);
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            boolean z = true;
            zzfun.zzg(v1 < 0x80, "Non-ASCII character: %s", ((char)v1));
            if(arr_b[v1] != -1) {
                z = false;
            }
            zzfun.zzg(z, "Duplicate character: %s", ((char)v1));
            arr_b[v1] = (byte)v;
        }
        this(s, arr_c, arr_b, false);
    }

    private zzfzv(String s, char[] arr_c, byte[] arr_b, boolean z) {
        int v;
        this.zze = s;
        arr_c.getClass();
        this.zzf = arr_c;
        try {
            v = zzgaj.zzc(arr_c.length, RoundingMode.UNNECESSARY);
            this.zzb = v;
        }
        catch(ArithmeticException arithmeticException0) {
            throw new IllegalArgumentException("Illegal alphabet length " + arr_c.length, arithmeticException0);
        }
        int v1 = Integer.numberOfTrailingZeros(v);
        int v2 = 1 << 3 - v1;
        this.zzc = v2;
        this.zzd = v >> v1;
        this.zza = arr_c.length - 1;
        this.zzg = arr_b;
        boolean[] arr_z = new boolean[v2];
        for(int v3 = 0; v3 < this.zzd; ++v3) {
            arr_z[zzgaj.zzb(v3 * 8, this.zzb, RoundingMode.CEILING)] = true;
        }
        this.zzh = arr_z;
        this.zzi = z;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(@a Object object0) {
        return object0 instanceof zzfzv && this.zzi == ((zzfzv)object0).zzi && Arrays.equals(this.zzf, ((zzfzv)object0).zzf);
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.zzf);
        return this.zzi ? v + 0x4CF : v + 0x4D5;
    }

    @Override
    public final String toString() {
        return this.zze;
    }

    final char zza(int v) {
        return this.zzf[v];
    }

    final int zzb(char c) throws zzfzy {
        if(c > 0x7F) {
            throw new zzfzy("Unrecognized character: 0x" + Integer.toHexString(c));
        }
        int v = this.zzg[c];
        if(v == -1) {
            throw c <= 0x20 || c == 0x7F ? new zzfzy("Unrecognized character: 0x" + Integer.toHexString(c)) : new zzfzy("Unrecognized character: " + c);
        }
        return v;
    }

    final zzfzv zzc() {
        int v2;
        for(int v = 0; true; ++v) {
            char[] arr_c = this.zzf;
            if(v >= arr_c.length) {
                break;
            }
            if(zzftt.zze(arr_c[v])) {
                for(int v1 = 0; true; ++v1) {
                    v2 = 0;
                    if(v1 >= arr_c.length) {
                        break;
                    }
                    if(zzftt.zzd(arr_c[v1])) {
                        v2 = 1;
                        break;
                    }
                }
                zzfun.zzm(((boolean)(v2 ^ 1)), "Cannot call lowerCase() on a mixed-case alphabet");
                char[] arr_c1 = new char[this.zzf.length];
                for(int v3 = 0; true; ++v3) {
                    char[] arr_c2 = this.zzf;
                    if(v3 >= arr_c2.length) {
                        break;
                    }
                    int v4 = arr_c2[v3];
                    if(zzftt.zze(((char)v4))) {
                        v4 ^= 0x20;
                    }
                    arr_c1[v3] = (char)v4;
                }
                zzfzv zzfzv0 = new zzfzv(this.zze + ".lowerCase()", arr_c1);
                if(this.zzi && !zzfzv0.zzi) {
                    byte[] arr_b = Arrays.copyOf(zzfzv0.zzg, zzfzv0.zzg.length);
                    for(int v5 = 65; v5 <= 90; ++v5) {
                        byte b = zzfzv0.zzg[v5];
                        byte b1 = zzfzv0.zzg[v5 | 0x20];
                        if(b == -1) {
                            arr_b[v5] = b1;
                        }
                        else {
                            if(b1 != -1) {
                                throw new IllegalStateException(zzfve.zzb("Can\'t ignoreCase() since \'%s\' and \'%s\' encode different values", new Object[]{Character.valueOf(((char)v5)), Character.valueOf(((char)(v5 | 0x20)))}));
                            }
                            arr_b[v5 | 0x20] = b;
                        }
                    }
                    return new zzfzv(zzfzv0.zze + ".ignoreCase()", zzfzv0.zzf, arr_b, true);
                }
                return zzfzv0;
            }
        }
        return this;
    }

    final boolean zzd(int v) {
        return this.zzh[v % this.zzc];
    }

    public final boolean zze(char c) {
        return this.zzg.length > 61 && this.zzg[61] != -1;
    }
}


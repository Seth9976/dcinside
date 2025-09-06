package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import o3.j;

@j
public final class zzazu extends zzazl {
    private MessageDigest zzb;
    private final int zzc;
    private final int zzd;

    public zzazu(int v) {
        this.zzc = (v & 7) <= 0 ? v >> 3 : (v >> 3) + 1;
        this.zzd = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzazl
    public final byte[] zzb(String s) {
        synchronized(this.zza) {
            MessageDigest messageDigest0 = this.zza();
            this.zzb = messageDigest0;
            if(messageDigest0 == null) {
                return new byte[0];
            }
            messageDigest0.reset();
            this.zzb.update(s.getBytes(Charset.forName("UTF-8")));
            byte[] arr_b = this.zzb.digest();
            int v2 = arr_b.length;
            int v3 = this.zzc;
            if(v2 > v3) {
                v2 = v3;
            }
            byte[] arr_b1 = new byte[v2];
            System.arraycopy(arr_b, 0, arr_b1, 0, v2);
            if((this.zzd & 7) > 0) {
                long v4 = 0L;
                for(int v1 = 0; v1 < v2; ++v1) {
                    if(v1 > 0) {
                        v4 <<= 8;
                    }
                    v4 += (long)(arr_b1[v1] & 0xFF);
                }
                long v5 = v4 >>> 8 - (this.zzd & 7);
                int v6 = this.zzc;
                while(true) {
                    --v6;
                    if(v6 < 0) {
                        break;
                    }
                    arr_b1[v6] = (byte)(((int)(0xFFL & v5)));
                    v5 >>>= 8;
                }
            }
            return arr_b1;
        }
    }
}


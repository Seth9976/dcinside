package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzahn {
    private final zzdy zza;
    private int zzb;

    public zzahn() {
        this.zza = new zzdy(8);
    }

    public final boolean zza(zzaco zzaco0) throws IOException {
        long v = zzaco0.zzd();
        long v1 = 0x400L;
        int v2 = Long.compare(v, -1L);
        if(v2 != 0 && v <= 0x400L) {
            v1 = v;
        }
        ((zzacc)zzaco0).zzm(this.zza.zzN(), 0, 4, false);
        long v3 = this.zza.zzu();
        this.zzb = 4;
        while(v3 != 0x1A45DFA3L) {
            int v4 = this.zzb + 1;
            this.zzb = v4;
            if(v4 == ((int)v1)) {
                return false;
            }
            ((zzacc)zzaco0).zzm(this.zza.zzN(), 0, 1, false);
            v3 = v3 << 8 & 0xFFFFFFFFFFFFFF00L | ((long)(this.zza.zzN()[0] & 0xFF));
        }
        long v5 = this.zzb(zzaco0);
        long v6 = (long)this.zzb;
        if(v5 != 0x8000000000000000L) {
            long v7 = v6 + v5;
            if(v2 == 0 || v7 < v) {
                int v8;
                while((v8 = Long.compare(this.zzb, v7)) < 0) {
                    if(this.zzb(zzaco0) == 0x8000000000000000L) {
                        return false;
                    }
                    long v9 = this.zzb(zzaco0);
                    int v10 = Long.compare(v9, 0L);
                    if(v10 >= 0) {
                        if(v10 == 0) {
                            continue;
                        }
                        ((zzacc)zzaco0).zzl(((int)v9), false);
                        this.zzb += (int)v9;
                        continue;
                    }
                    return false;
                }
                return v8 == 0;
            }
        }
        return false;
    }

    private final long zzb(zzaco zzaco0) throws IOException {
        int v = 0;
        ((zzacc)zzaco0).zzm(this.zza.zzN(), 0, 1, false);
        int v1 = this.zza.zzN()[0] & 0xFF;
        if(v1 != 0) {
            int v2 = 0x80;
            int v3;
            for(v3 = 0; (v1 & v2) == 0; ++v3) {
                v2 >>= 1;
            }
            int v4 = v1 & ~v2;
            ((zzacc)zzaco0).zzm(this.zza.zzN(), 1, v3, false);
            while(v < v3) {
                ++v;
                v4 = (this.zza.zzN()[v] & 0xFF) + (v4 << 8);
            }
            this.zzb += v3 + 1;
            return (long)v4;
        }
        return 0x8000000000000000L;
    }
}


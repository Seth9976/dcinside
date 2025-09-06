package com.google.android.gms.internal.ads;

import o3.a;

abstract class zzfva extends zzfts {
    final CharSequence zzb;
    int zzc;
    int zzd;

    protected zzfva(zzfvc zzfvc0, CharSequence charSequence0) {
        this.zzc = 0;
        this.zzd = 0x7FFFFFFF;
        this.zzb = charSequence0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfts
    @a
    protected final Object zza() {
        int v3;
        int v = this.zzc;
        int v1;
        while((v1 = this.zzc) != -1) {
            int v2 = this.zzd(v1);
            if(v2 == -1) {
                v2 = this.zzb.length();
                this.zzc = -1;
                v3 = -1;
            }
            else {
                v3 = this.zzc(v2);
                this.zzc = v3;
            }
            if(v3 == v) {
                this.zzc = v3 + 1;
                if(v3 + 1 <= this.zzb.length()) {
                    continue;
                }
                this.zzc = -1;
                continue;
            }
            if(v < v2) {
                this.zzb.charAt(v);
            }
            if(v < v2) {
                this.zzb.charAt(v2 - 1);
            }
            int v4 = this.zzd;
            if(v4 == 1) {
                v2 = this.zzb.length();
                this.zzc = -1;
                if(v2 > v) {
                    this.zzb.charAt(v2 - 1);
                    return this.zzb.subSequence(v, v2).toString();
                }
            }
            else {
                this.zzd = v4 - 1;
            }
            return this.zzb.subSequence(v, v2).toString();
        }
        this.zzb();
        return null;
    }

    abstract int zzc(int arg1);

    abstract int zzd(int arg1);
}


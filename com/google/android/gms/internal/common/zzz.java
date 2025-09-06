package com.google.android.gms.internal.common;

import o3.a;

abstract class zzz extends zzm {
    final CharSequence zzb;
    final zzr zzc;
    final boolean zzd;
    int zze;
    int zzf;

    protected zzz(zzaa zzaa0, CharSequence charSequence0) {
        this.zze = 0;
        this.zzc = zzaa0.zza;
        this.zzd = zzaa0.zzb;
        this.zzf = 0x7FFFFFFF;
        this.zzb = charSequence0;
    }

    @Override  // com.google.android.gms.internal.common.zzm
    @a
    protected final Object zza() {
        int v3;
        int v = this.zze;
        int v1;
        while((v1 = this.zze) != -1) {
            int v2 = this.zzd(v1);
            if(v2 == -1) {
                v2 = this.zzb.length();
                this.zze = -1;
                v3 = -1;
            }
            else {
                v3 = this.zzc(v2);
                this.zze = v3;
            }
            if(v3 == v) {
                this.zze = v3 + 1;
                if(v3 + 1 <= this.zzb.length()) {
                    continue;
                }
                this.zze = -1;
                continue;
            }
            if(v < v2) {
                this.zzb.charAt(v);
            }
            if(v < v2) {
                this.zzb.charAt(v2 - 1);
            }
            if(this.zzd && v == v2) {
                v = this.zze;
                continue;
            }
            int v4 = this.zzf;
            if(v4 == 1) {
                v2 = this.zzb.length();
                this.zze = -1;
                if(v2 > v) {
                    this.zzb.charAt(v2 - 1);
                    return this.zzb.subSequence(v, v2).toString();
                }
            }
            else {
                this.zzf = v4 - 1;
            }
            return this.zzb.subSequence(v, v2).toString();
        }
        this.zzb();
        return null;
    }

    abstract int zzc(int arg1);

    abstract int zzd(int arg1);
}


package com.google.android.gms.internal.ads;

import android.text.Layout.Alignment;

final class zzalt {
    public long zza;
    public long zzb;
    public CharSequence zzc;
    public int zzd;
    public float zze;
    public int zzf;
    public int zzg;
    public float zzh;
    public int zzi;
    public float zzj;
    public int zzk;

    public zzalt() {
        this.zza = 0L;
        this.zzb = 0L;
        this.zzd = 2;
        this.zze = -3.402823E+38f;
        this.zzf = 1;
        this.zzg = 0;
        this.zzh = -3.402823E+38f;
        this.zzi = 0x80000000;
        this.zzj = 1.0f;
        this.zzk = 0x80000000;
    }

    public final zzcm zza() {
        Layout.Alignment layout$Alignment0;
        float f = this.zzh;
        float f1 = -3.402823E+38f;
        if(f == -3.402823E+38f) {
            switch(this.zzd) {
                case 4: {
                    f = 0.0f;
                    break;
                }
                case 5: {
                    f = 1.0f;
                    break;
                }
                default: {
                    f = 0.5f;
                }
            }
        }
        int v = this.zzi;
        if(v == 0x80000000) {
            switch(this.zzd) {
                case 1: 
                case 4: {
                    v = 0;
                    break;
                }
                case 3: 
                case 5: {
                    v = 2;
                    break;
                }
                default: {
                    v = 1;
                }
            }
        }
        zzcm zzcm0 = new zzcm();
        int v1 = this.zzd;
        switch(v1) {
            case 2: {
                layout$Alignment0 = Layout.Alignment.ALIGN_CENTER;
                break;
            }
            case 1: 
            case 4: {
                layout$Alignment0 = Layout.Alignment.ALIGN_NORMAL;
                break;
            }
            case 3: 
            case 5: {
                layout$Alignment0 = Layout.Alignment.ALIGN_OPPOSITE;
                break;
            }
            default: {
                zzdo.zzf("WebvttCueParser", "Unknown textAlignment: " + v1);
                layout$Alignment0 = null;
            }
        }
        zzcm0.zzm(layout$Alignment0);
        float f2 = this.zze;
        int v2 = this.zzf;
        int v3 = Float.compare(f2, -3.402823E+38f);
        if(v3 != 0 && v2 == 0 && (f2 < 0.0f || f2 > 1.0f)) {
            f1 = 1.0f;
        }
        else if(v3 != 0) {
            f1 = f2;
        }
        else if(v2 == 0) {
            f1 = 1.0f;
        }
        zzcm0.zze(f1, v2);
        zzcm0.zzf(this.zzg);
        zzcm0.zzh(f);
        zzcm0.zzi(v);
        float f3 = this.zzj;
        switch(v) {
            case 0: {
                f = 1.0f - f;
                break;
            }
            case 1: {
                f = f <= 0.5f ? f + f : 1.0f - f + (1.0f - f);
                break;
            }
            case 2: {
                break;
            }
            default: {
                throw new IllegalStateException(String.valueOf(v));
            }
        }
        zzcm0.zzk(Math.min(f3, f));
        zzcm0.zzo(this.zzk);
        CharSequence charSequence0 = this.zzc;
        if(charSequence0 != null) {
            zzcm0.zzl(charSequence0);
        }
        return zzcm0;
    }
}


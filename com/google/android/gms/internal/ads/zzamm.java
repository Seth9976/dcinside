package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class zzamm {
    public int zza;
    public int zzb;
    public byte[] zzc;
    private static final byte[] zzd;
    private boolean zze;
    private int zzf;

    static {
        zzamm.zzd = new byte[]{0, 0, 1};
    }

    public zzamm(int v) {
        this.zzc = new byte[0x80];
    }

    public final void zza(byte[] arr_b, int v, int v1) {
        if(!this.zze) {
            return;
        }
        int v2 = v1 - v;
        byte[] arr_b1 = this.zzc;
        int v3 = this.zza + v2;
        if(arr_b1.length < v3) {
            this.zzc = Arrays.copyOf(arr_b1, v3 + v3);
        }
        System.arraycopy(arr_b, v, this.zzc, this.zza, v2);
        this.zza += v2;
    }

    public final void zzb() {
        this.zze = false;
        this.zza = 0;
        this.zzf = 0;
    }

    public final boolean zzc(int v, int v1) {
        int v2 = this.zzf;
        if(v2 != 0) {
            switch(v2) {
                case 1: {
                    if(v == 0xB5) {
                        this.zzf = 2;
                    }
                    else {
                        zzdo.zzf("H263Reader", "Unexpected start code value");
                        this.zzb();
                    }
                    break;
                }
                case 2: {
                    if(v > 0x1F) {
                        zzdo.zzf("H263Reader", "Unexpected start code value");
                        this.zzb();
                    }
                    else {
                        this.zzf = 3;
                    }
                    break;
                }
                case 3: {
                    if((v & 0xF0) == 0x20) {
                        this.zzb = this.zza;
                        this.zzf = 4;
                    }
                    else {
                        zzdo.zzf("H263Reader", "Unexpected start code value");
                        this.zzb();
                    }
                    break;
                }
                default: {
                    if(v == 0xB3 || v == 0xB5) {
                        this.zza -= v1;
                        this.zze = false;
                        return true;
                    }
                }
            }
        }
        else if(v == 0xB0) {
            this.zzf = 1;
            this.zze = true;
        }
        this.zza(zzamm.zzd, 0, 3);
        return false;
    }
}


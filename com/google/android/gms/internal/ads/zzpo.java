package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import androidx.annotation.Nullable;

final class zzpo {
    @Nullable
    private final zzpn zza;
    private int zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;

    public zzpo(AudioTrack audioTrack0) {
        this.zza = new zzpn(audioTrack0);
        this.zzh(0);
    }

    public final long zza() {
        return this.zza.zza();
    }

    public final long zzb() {
        return this.zza.zzb();
    }

    public final void zzc() {
        if(this.zzb == 4) {
            this.zzh(0);
        }
    }

    public final void zzd() {
        this.zzh(4);
    }

    public final void zze() {
        this.zzh(0);
    }

    public final boolean zzf() {
        return this.zzb == 2;
    }

    public final boolean zzg(long v) {
        if(v - this.zze < this.zzd) {
            return false;
        }
        this.zze = v;
        boolean z = this.zza.zzc();
        int v1 = this.zzb;
        if(v1 != 0) {
            switch(v1) {
                case 1: {
                    if(z) {
                        if(this.zza.zza() <= this.zzf) {
                            return true;
                        }
                        this.zzh(2);
                        return true;
                    }
                    this.zzh(0);
                    return false;
                }
                case 2: {
                    if(z) {
                        return true;
                    }
                    this.zzh(0);
                    return false;
                }
                case 3: {
                    if(!z) {
                        return false;
                    }
                    this.zzh(0);
                    return true;
                }
                default: {
                    return z;
                }
            }
        }
        if(z) {
            if(this.zza.zzb() < this.zzc) {
                return false;
            }
            this.zzf = this.zza.zza();
            this.zzh(1);
            return true;
        }
        if(v - this.zzc <= 500000L) {
            return false;
        }
        this.zzh(3);
        return false;
    }

    private final void zzh(int v) {
        this.zzb = v;
        long v1 = 10000L;
        switch(v) {
            case 0: {
                this.zze = 0L;
                this.zzf = -1L;
                this.zzc = System.nanoTime() / 1000L;
                break;
            }
            case 1: {
                this.zzd = 10000L;
                return;
            }
            case 2: 
            case 3: {
                v1 = 10000000L;
                break;
            }
            default: {
                v1 = 500000L;
                break;
            }
        }
        this.zzd = v1;
    }
}


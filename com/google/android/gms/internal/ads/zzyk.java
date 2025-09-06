package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

public final class zzyk {
    private int zza;
    private int zzb;
    private int zzc;
    private zzyd[] zzd;

    public zzyk(boolean z, int v) {
        this.zzc = 0;
        this.zzd = new zzyd[100];
    }

    public final int zza() {
        synchronized(this) {
        }
        return this.zzb * 0x10000;
    }

    public final zzyd zzb() {
        zzyd zzyd0;
        synchronized(this) {
            ++this.zzb;
            int v1 = this.zzc;
            if(v1 > 0) {
                zzyd[] arr_zzyd = this.zzd;
                this.zzc = v1 - 1;
                zzyd0 = arr_zzyd[v1 - 1];
                if(zzyd0 == null) {
                    throw null;
                }
                arr_zzyd[v1 - 1] = null;
                return zzyd0;
            }
            zzyd0 = new zzyd(new byte[0x10000], 0);
            zzyd[] arr_zzyd1 = this.zzd;
            if(this.zzb <= arr_zzyd1.length) {
                return zzyd0;
            }
            this.zzd = (zzyd[])Arrays.copyOf(arr_zzyd1, arr_zzyd1.length + arr_zzyd1.length);
            return zzyd0;
        }
    }

    public final void zzc(zzyd zzyd0) {
        synchronized(this) {
            int v1 = this.zzc;
            this.zzc = v1 + 1;
            this.zzd[v1] = zzyd0;
            --this.zzb;
            this.notifyAll();
        }
    }

    public final void zzd(@Nullable zzye zzye0) {
        synchronized(this) {
            while(zzye0 != null) {
                zzyd[] arr_zzyd = this.zzd;
                int v1 = this.zzc;
                this.zzc = v1 + 1;
                arr_zzyd[v1] = zzye0.zzc();
                --this.zzb;
                zzye0 = zzye0.zzd();
            }
            this.notifyAll();
        }
    }

    public final void zze() {
        synchronized(this) {
            this.zzf(0);
        }
    }

    public final void zzf(int v) {
        synchronized(this) {
            int v2 = this.zza;
            this.zza = v;
            if(v < v2) {
                this.zzg();
            }
        }
    }

    public final void zzg() {
        synchronized(this) {
            int v1 = Math.max(0, (this.zza + 0xFFFF) / 0x10000 - this.zzb);
            int v2 = this.zzc;
            if(v1 >= v2) {
                return;
            }
            Arrays.fill(this.zzd, v1, v2, null);
            this.zzc = v1;
        }
    }
}


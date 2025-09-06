package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class zzaqd {
    protected static final Comparator zza;
    private final List zzb;
    private final List zzc;
    private int zzd;

    static {
        zzaqd.zza = new zzaqc();
    }

    public zzaqd(int v) {
        this.zzb = new ArrayList();
        this.zzc = new ArrayList(0x40);
        this.zzd = 0;
    }

    public final void zza(byte[] arr_b) {
        synchronized(this) {
            if(arr_b != null && arr_b.length <= 0x1000) {
                this.zzb.add(arr_b);
                int v1 = Collections.binarySearch(this.zzc, arr_b, zzaqd.zza);
                if(v1 < 0) {
                    v1 = -v1 - 1;
                }
                this.zzc.add(v1, arr_b);
                this.zzd += arr_b.length;
                this.zzc();
            }
        }
    }

    public final byte[] zzb(int v) {
        synchronized(this) {
            for(int v2 = 0; v2 < this.zzc.size(); ++v2) {
                byte[] arr_b = (byte[])this.zzc.get(v2);
                int v3 = arr_b.length;
                if(v3 >= v) {
                    this.zzd -= v3;
                    this.zzc.remove(v2);
                    this.zzb.remove(arr_b);
                    return arr_b;
                }
            }
        }
        return new byte[v];
    }

    private final void zzc() {
        synchronized(this) {
            while(this.zzd > 0x1000) {
                byte[] arr_b = (byte[])this.zzb.remove(0);
                this.zzc.remove(arr_b);
                this.zzd -= arr_b.length;
            }
        }
    }
}


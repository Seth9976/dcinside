package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class zzaws extends zzaxr {
    public zzaws(zzawd zzawd0, String s, String s1, zzasc zzasc0, int v, int v1) {
        super(zzawd0, "BI30n3J1CRcYA+VG0+4MYT6iqJe6ygS/jaP36BUmRAco9FZAzOIaWUnrLPPOeEgd", "opDPFauVb4cwnfQzDqDp9yn5NlOrrzIvgPDGrYZmcXE=", zzasc0, v, 5);
    }

    @Override  // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzm(-1L);
        this.zzd.zzl(-1L);
        int[] arr_v = (int[])this.zze.invoke(null, this.zza.zzb());
        synchronized(this.zzd) {
            this.zzd.zzm(((long)arr_v[0]));
            this.zzd.zzl(((long)arr_v[1]));
            int v1 = arr_v[2];
            if(v1 != 0x80000000) {
                this.zzd.zzk(((long)v1));
            }
        }
    }
}


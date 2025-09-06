package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

final class zzlh extends zzhi {
    public static final int zzb;
    private final int zzc;
    private final int zzd;
    private final int[] zze;
    private final int[] zzf;
    private final zzbq[] zzg;
    private final Object[] zzh;
    private final HashMap zzi;

    public zzlh(Collection collection0, zzwb zzwb0) {
        zzbq[] arr_zzbq = new zzbq[collection0.size()];
        int v = 0;
        int v1 = 0;
        for(Object object0: collection0) {
            arr_zzbq[v1] = ((zzkp)object0).zza();
            ++v1;
        }
        Object[] arr_object = new Object[collection0.size()];
        for(Object object1: collection0) {
            arr_object[v] = ((zzkp)object1).zzb();
            ++v;
        }
        this(arr_zzbq, arr_object, zzwb0);
    }

    private zzlh(zzbq[] arr_zzbq, Object[] arr_object, zzwb zzwb0) {
        int v = 0;
        super(false, zzwb0);
        this.zzg = arr_zzbq;
        this.zze = new int[arr_zzbq.length];
        this.zzf = new int[arr_zzbq.length];
        this.zzh = arr_object;
        this.zzi = new HashMap();
        int v1 = 0;
        int v2 = 0;
        for(int v3 = 0; v < arr_zzbq.length; ++v3) {
            zzbq zzbq0 = arr_zzbq[v];
            this.zzg[v3] = zzbq0;
            this.zzf[v3] = v1;
            this.zze[v3] = v2;
            v1 += zzbq0.zzc();
            v2 += this.zzg[v3].zzb();
            this.zzi.put(arr_object[v3], v3);
            ++v;
        }
        this.zzc = v1;
        this.zzd = v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzbq
    public final int zzb() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzbq
    public final int zzc() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzhi
    protected final int zzp(Object object0) {
        Integer integer0 = (Integer)this.zzi.get(object0);
        return integer0 == null ? -1 : ((int)integer0);
    }

    @Override  // com.google.android.gms.internal.ads.zzhi
    protected final int zzq(int v) {
        return zzei.zzc(this.zze, v + 1, false, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzhi
    protected final int zzr(int v) {
        return zzei.zzc(this.zzf, v + 1, false, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzhi
    protected final int zzs(int v) {
        return this.zze[v];
    }

    @Override  // com.google.android.gms.internal.ads.zzhi
    protected final int zzt(int v) {
        return this.zzf[v];
    }

    @Override  // com.google.android.gms.internal.ads.zzhi
    protected final zzbq zzu(int v) {
        return this.zzg[v];
    }

    @Override  // com.google.android.gms.internal.ads.zzhi
    protected final Object zzv(int v) {
        return this.zzh[v];
    }

    final List zzw() {
        return Arrays.asList(this.zzg);
    }

    public final zzlh zzx(zzwb zzwb0) {
        zzbq[] arr_zzbq = new zzbq[this.zzg.length];
        for(int v = 0; true; ++v) {
            zzbq[] arr_zzbq1 = this.zzg;
            if(v >= arr_zzbq1.length) {
                break;
            }
            arr_zzbq[v] = new zzlg(this, arr_zzbq1[v]);
        }
        return new zzlh(arr_zzbq, this.zzh, zzwb0);
    }
}


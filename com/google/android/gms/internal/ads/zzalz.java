package com.google.android.gms.internal.ads;

import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class zzalz implements zzaka {
    private final List zza;
    private final long[] zzb;
    private final long[] zzc;

    public zzalz(List list0) {
        this.zza = DesugarCollections.unmodifiableList(new ArrayList(list0));
        int v = list0.size();
        this.zzb = new long[v + v];
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            zzalo zzalo0 = (zzalo)list0.get(v1);
            int v2 = v1 + v1;
            this.zzb[v2] = zzalo0.zzb;
            this.zzb[v2 + 1] = zzalo0.zzc;
        }
        long[] arr_v = Arrays.copyOf(this.zzb, this.zzb.length);
        this.zzc = arr_v;
        Arrays.sort(arr_v);
    }

    @Override  // com.google.android.gms.internal.ads.zzaka
    public final int zza() {
        return this.zzc.length;
    }

    @Override  // com.google.android.gms.internal.ads.zzaka
    public final long zzb(int v) {
        boolean z = false;
        zzcw.zzd(v >= 0);
        if(v < this.zzc.length) {
            z = true;
        }
        zzcw.zzd(z);
        return this.zzc[v];
    }

    @Override  // com.google.android.gms.internal.ads.zzaka
    public final List zzc(long v) {
        List list0 = new ArrayList();
        ArrayList arrayList0 = new ArrayList();
        for(int v2 = 0; v2 < this.zza.size(); ++v2) {
            if(this.zzb[v2 + v2] <= v && v < this.zzb[v2 * 2 + 1]) {
                zzalo zzalo0 = (zzalo)this.zza.get(v2);
                zzco zzco0 = zzalo0.zza;
                if(zzco0.zze == -3.402823E+38f) {
                    arrayList0.add(zzalo0);
                }
                else {
                    list0.add(zzco0);
                }
            }
        }
        Collections.sort(arrayList0, new zzaly());
        for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
            zzcm zzcm0 = ((zzalo)arrayList0.get(v1)).zza.zzb();
            zzcm0.zze(((float)(-1 - v1)), 1);
            list0.add(zzcm0.zzp());
        }
        return list0;
    }
}


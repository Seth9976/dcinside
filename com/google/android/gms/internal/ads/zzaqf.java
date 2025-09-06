package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

@VisibleForTesting
final class zzaqf {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    zzaqf(String s, zzaov zzaov0) {
        String s1 = zzaov0.zzb;
        long v = zzaov0.zzc;
        long v1 = zzaov0.zzd;
        long v2 = zzaov0.zze;
        long v3 = zzaov0.zzf;
        List list0 = zzaov0.zzh;
        if(list0 == null) {
            Map map0 = zzaov0.zzg;
            list0 = new ArrayList(map0.size());
            for(Object object0: map0.entrySet()) {
                list0.add(new zzape(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue())));
            }
        }
        this(s, s1, v, v1, v2, v3, list0);
    }

    private zzaqf(String s, String s1, long v, long v1, long v2, long v3, List list0) {
        this.zzb = s;
        if("".equals(s1)) {
            s1 = null;
        }
        this.zzc = s1;
        this.zzd = v;
        this.zze = v1;
        this.zzf = v2;
        this.zzg = v3;
        this.zzh = list0;
    }

    static zzaqf zza(zzaqg zzaqg0) throws IOException {
        if(zzaqi.zze(zzaqg0) != 0x20150306) {
            throw new IOException();
        }
        String s = zzaqi.zzh(zzaqg0);
        String s1 = zzaqi.zzh(zzaqg0);
        long v = zzaqi.zzf(zzaqg0);
        long v1 = zzaqi.zzf(zzaqg0);
        long v2 = zzaqi.zzf(zzaqg0);
        long v3 = zzaqi.zzf(zzaqg0);
        int v4 = zzaqi.zze(zzaqg0);
        if(v4 < 0) {
            throw new IOException("readHeaderList size=" + v4);
        }
        List list0 = v4 == 0 ? Collections.emptyList() : new ArrayList();
        for(int v5 = 0; v5 < v4; ++v5) {
            list0.add(new zzape(zzaqi.zzh(zzaqg0).intern(), zzaqi.zzh(zzaqg0).intern()));
        }
        return new zzaqf(s, s1, v, v1, v2, v3, list0);
    }
}


package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

final class zzbp implements zzfr {
    private final zzbn zzfo;

    private zzbp(zzbn zzbn0) {
        zzbn zzbn1 = (zzbn)zzci.zza(zzbn0, "output");
        this.zzfo = zzbn1;
        zzbn1.zzfz = this;
    }

    public static zzbp zza(zzbn zzbn0) {
        zzbp zzbp0 = zzbn0.zzfz;
        return zzbp0 == null ? new zzbp(zzbn0) : zzbp0;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int v, double f) throws IOException {
        this.zzfo.zza(v, f);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int v, float f) throws IOException {
        this.zzfo.zza(v, f);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int v, long v1) throws IOException {
        this.zzfo.zza(v, v1);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int v, zzbb zzbb0) throws IOException {
        this.zzfo.zza(v, zzbb0);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int v, zzdh zzdh0, Map map0) throws IOException {
        for(Object object0: map0.entrySet()) {
            this.zzfo.zzb(v, 2);
            int v1 = zzdg.zza(zzdh0, ((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
            this.zzfo.zzo(v1);
            Object object1 = ((Map.Entry)object0).getKey();
            Object object2 = ((Map.Entry)object0).getValue();
            zzdg.zza(this.zzfo, zzdh0, object1, object2);
        }
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int v, Object object0) throws IOException {
        if(object0 instanceof zzbb) {
            this.zzfo.zzb(v, ((zzbb)object0));
            return;
        }
        this.zzfo.zzb(v, ((zzdo)object0));
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int v, Object object0, zzef zzef0) throws IOException {
        this.zzfo.zza(v, ((zzdo)object0), zzef0);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int v, String s) throws IOException {
        this.zzfo.zza(v, s);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int v, List list0) throws IOException {
        int v1 = 0;
        if(list0 instanceof zzcx) {
            while(v1 < list0.size()) {
                Object object0 = ((zzcx)list0).getRaw(v1);
                if(object0 instanceof String) {
                    this.zzfo.zza(v, ((String)object0));
                }
                else {
                    this.zzfo.zza(v, ((zzbb)object0));
                }
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            String s = (String)list0.get(v1);
            this.zzfo.zza(v, s);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int v, List list0, zzef zzef0) throws IOException {
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            this.zza(v, list0.get(v1), zzef0);
        }
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.zzfo.zzb(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzbn.zzs(((int)(((Integer)list0.get(v2)))));
            }
            this.zzfo.zzo(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.zzfo.zzn(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.zzfo.zzc(v, v5);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zzaa(int v) throws IOException {
        this.zzfo.zzb(v, 3);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zzab(int v) throws IOException {
        this.zzfo.zzb(v, 4);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final int zzaj() {
        return zzg.zzko;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zzb(int v, long v1) throws IOException {
        this.zzfo.zzb(v, v1);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zzb(int v, Object object0, zzef zzef0) throws IOException {
        this.zzfo.zzb(v, 3);
        zzef0.zza(((zzdo)object0), this.zzfo.zzfz);
        this.zzfo.zzb(v, 4);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zzb(int v, List list0) throws IOException {
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            zzbb zzbb0 = (zzbb)list0.get(v1);
            this.zzfo.zza(v, zzbb0);
        }
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zzb(int v, List list0, zzef zzef0) throws IOException {
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            this.zzb(v, list0.get(v1), zzef0);
        }
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zzb(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.zzfo.zzb(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzbn.zzv(((int)(((Integer)list0.get(v2)))));
            }
            this.zzfo.zzo(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.zzfo.zzq(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.zzfo.zzf(v, v5);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zzb(int v, boolean z) throws IOException {
        this.zzfo.zzb(v, z);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zzc(int v, int v1) throws IOException {
        this.zzfo.zzc(v, v1);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zzc(int v, long v1) throws IOException {
        this.zzfo.zzc(v, v1);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zzc(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.zzfo.zzb(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzbn.zze(((long)(((Long)list0.get(v2)))));
            }
            this.zzfo.zzo(v3);
            while(v1 < list0.size()) {
                long v4 = (long)(((Long)list0.get(v1)));
                this.zzfo.zzb(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v5 = (long)(((Long)list0.get(v1)));
            this.zzfo.zza(v, v5);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zzd(int v, int v1) throws IOException {
        this.zzfo.zzd(v, v1);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zzd(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.zzfo.zzb(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzbn.zzf(((long)(((Long)list0.get(v2)))));
            }
            this.zzfo.zzo(v3);
            while(v1 < list0.size()) {
                long v4 = (long)(((Long)list0.get(v1)));
                this.zzfo.zzb(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v5 = (long)(((Long)list0.get(v1)));
            this.zzfo.zza(v, v5);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zze(int v, int v1) throws IOException {
        this.zzfo.zze(v, v1);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zze(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.zzfo.zzb(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzbn.zzh(((long)(((Long)list0.get(v2)))));
            }
            this.zzfo.zzo(v3);
            while(v1 < list0.size()) {
                long v4 = (long)(((Long)list0.get(v1)));
                this.zzfo.zzd(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v5 = (long)(((Long)list0.get(v1)));
            this.zzfo.zzc(v, v5);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zzf(int v, int v1) throws IOException {
        this.zzfo.zzf(v, v1);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zzf(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.zzfo.zzb(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzbn.zzb(((float)(((Float)list0.get(v2)))));
            }
            this.zzfo.zzo(v3);
            while(v1 < list0.size()) {
                float f = (float)(((Float)list0.get(v1)));
                this.zzfo.zza(f);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            float f1 = (float)(((Float)list0.get(v1)));
            this.zzfo.zza(v, f1);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zzg(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.zzfo.zzb(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzbn.zzb(((double)(((Double)list0.get(v2)))));
            }
            this.zzfo.zzo(v3);
            while(v1 < list0.size()) {
                double f = (double)(((Double)list0.get(v1)));
                this.zzfo.zza(f);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            double f1 = (double)(((Double)list0.get(v1)));
            this.zzfo.zza(v, f1);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zzh(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.zzfo.zzb(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzbn.zzx(((int)(((Integer)list0.get(v2)))));
            }
            this.zzfo.zzo(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.zzfo.zzn(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.zzfo.zzc(v, v5);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zzi(int v, long v1) throws IOException {
        this.zzfo.zza(v, v1);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zzi(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.zzfo.zzb(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzbn.zzb(((Boolean)list0.get(v2)).booleanValue());
            }
            this.zzfo.zzo(v3);
            while(v1 < list0.size()) {
                boolean z1 = ((Boolean)list0.get(v1)).booleanValue();
                this.zzfo.zza(z1);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            boolean z2 = ((Boolean)list0.get(v1)).booleanValue();
            this.zzfo.zzb(v, z2);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zzj(int v, long v1) throws IOException {
        this.zzfo.zzc(v, v1);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zzj(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.zzfo.zzb(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzbn.zzt(((int)(((Integer)list0.get(v2)))));
            }
            this.zzfo.zzo(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.zzfo.zzo(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.zzfo.zzd(v, v5);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zzk(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.zzfo.zzb(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzbn.zzw(((int)(((Integer)list0.get(v2)))));
            }
            this.zzfo.zzo(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.zzfo.zzq(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.zzfo.zzf(v, v5);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zzl(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.zzfo.zzb(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzbn.zzi(((long)(((Long)list0.get(v2)))));
            }
            this.zzfo.zzo(v3);
            while(v1 < list0.size()) {
                long v4 = (long)(((Long)list0.get(v1)));
                this.zzfo.zzd(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v5 = (long)(((Long)list0.get(v1)));
            this.zzfo.zzc(v, v5);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zzm(int v, int v1) throws IOException {
        this.zzfo.zzf(v, v1);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zzm(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.zzfo.zzb(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzbn.zzu(((int)(((Integer)list0.get(v2)))));
            }
            this.zzfo.zzo(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.zzfo.zzp(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.zzfo.zze(v, v5);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zzn(int v, int v1) throws IOException {
        this.zzfo.zzc(v, v1);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfr
    public final void zzn(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.zzfo.zzb(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzbn.zzg(((long)(((Long)list0.get(v2)))));
            }
            this.zzfo.zzo(v3);
            while(v1 < list0.size()) {
                long v4 = (long)(((Long)list0.get(v1)));
                this.zzfo.zzc(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v5 = (long)(((Long)list0.get(v1)));
            this.zzfo.zzb(v, v5);
            ++v1;
        }
    }
}


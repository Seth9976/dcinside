package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

final class zzil implements zzmr {
    private final zzii zza;

    private zzil(zzii zzii0) {
        zzii zzii1 = (zzii)zzjf.zza(zzii0, "output");
        this.zza = zzii1;
        zzii1.zza = this;
    }

    public static zzil zza(zzii zzii0) {
        zzil zzil0 = zzii0.zza;
        return zzil0 == null ? new zzil(zzii0) : zzil0;
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final int zza() {
        return zzmq.zza;
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zza(int v) throws IOException {
        this.zza.zza(v, 3);
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zza(int v, double f) throws IOException {
        this.zza.zza(v, f);
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zza(int v, float f) throws IOException {
        this.zza.zza(v, f);
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zza(int v, int v1) throws IOException {
        this.zza.zze(v, v1);
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zza(int v, long v1) throws IOException {
        this.zza.zza(v, v1);
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zza(int v, zzht zzht0) throws IOException {
        this.zza.zza(v, zzht0);
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zza(int v, zzkf zzkf0, Map map0) throws IOException {
        for(Object object0: map0.entrySet()) {
            this.zza.zza(v, 2);
            int v1 = zzkc.zza(zzkf0, ((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
            this.zza.zzb(v1);
            Object object1 = ((Map.Entry)object0).getKey();
            Object object2 = ((Map.Entry)object0).getValue();
            zzkc.zza(this.zza, zzkf0, object1, object2);
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zza(int v, Object object0) throws IOException {
        if(object0 instanceof zzht) {
            this.zza.zzb(v, ((zzht)object0));
            return;
        }
        this.zza.zza(v, ((zzkk)object0));
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zza(int v, Object object0, zzlc zzlc0) throws IOException {
        this.zza.zza(v, ((zzkk)object0), zzlc0);
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zza(int v, String s) throws IOException {
        this.zza.zza(v, s);
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zza(int v, List list0) throws IOException {
        int v1 = 0;
        if(list0 instanceof zzjv) {
            while(v1 < list0.size()) {
                Object object0 = ((zzjv)list0).zzb(v1);
                if(object0 instanceof String) {
                    this.zza.zza(v, ((String)object0));
                }
                else {
                    this.zza.zza(v, ((zzht)object0));
                }
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            String s = (String)list0.get(v1);
            this.zza.zza(v, s);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zza(int v, List list0, zzlc zzlc0) throws IOException {
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            this.zza(v, list0.get(v1), zzlc0);
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zza(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.zza.zza(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzii.zzf(((int)(((Integer)list0.get(v2)))));
            }
            this.zza.zzb(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.zza.zza(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.zza.zzb(v, v5);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zza(int v, boolean z) throws IOException {
        this.zza.zza(v, z);
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zzb(int v) throws IOException {
        this.zza.zza(v, 4);
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zzb(int v, int v1) throws IOException {
        this.zza.zzb(v, v1);
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zzb(int v, long v1) throws IOException {
        this.zza.zzc(v, v1);
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zzb(int v, Object object0, zzlc zzlc0) throws IOException {
        this.zza.zza(v, 3);
        zzlc0.zza(((zzkk)object0), this.zza.zza);
        this.zza.zza(v, 4);
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zzb(int v, List list0) throws IOException {
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            zzht zzht0 = (zzht)list0.get(v1);
            this.zza.zza(v, zzht0);
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zzb(int v, List list0, zzlc zzlc0) throws IOException {
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            this.zzb(v, list0.get(v1), zzlc0);
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zzb(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.zza.zza(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzii.zzi(((int)(((Integer)list0.get(v2)))));
            }
            this.zza.zzb(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.zza.zzd(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.zza.zze(v, v5);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zzc(int v, int v1) throws IOException {
        this.zza.zzb(v, v1);
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zzc(int v, long v1) throws IOException {
        this.zza.zza(v, v1);
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zzc(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.zza.zza(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzii.zzd(((long)(((Long)list0.get(v2)))));
            }
            this.zza.zzb(v3);
            while(v1 < list0.size()) {
                long v4 = (long)(((Long)list0.get(v1)));
                this.zza.zza(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v5 = (long)(((Long)list0.get(v1)));
            this.zza.zza(v, v5);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zzd(int v, int v1) throws IOException {
        this.zza.zze(v, v1);
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zzd(int v, long v1) throws IOException {
        this.zza.zzc(v, v1);
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zzd(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.zza.zza(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzii.zze(((long)(((Long)list0.get(v2)))));
            }
            this.zza.zzb(v3);
            while(v1 < list0.size()) {
                long v4 = (long)(((Long)list0.get(v1)));
                this.zza.zza(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v5 = (long)(((Long)list0.get(v1)));
            this.zza.zza(v, v5);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zze(int v, int v1) throws IOException {
        this.zza.zzc(v, v1);
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zze(int v, long v1) throws IOException {
        this.zza.zzb(v, v1);
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zze(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.zza.zza(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzii.zzg(((long)(((Long)list0.get(v2)))));
            }
            this.zza.zzb(v3);
            while(v1 < list0.size()) {
                long v4 = (long)(((Long)list0.get(v1)));
                this.zza.zzc(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v5 = (long)(((Long)list0.get(v1)));
            this.zza.zzc(v, v5);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zzf(int v, int v1) throws IOException {
        this.zza.zzd(v, v1);
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zzf(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.zza.zza(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzii.zzb(((float)(((Float)list0.get(v2)))));
            }
            this.zza.zzb(v3);
            while(v1 < list0.size()) {
                float f = (float)(((Float)list0.get(v1)));
                this.zza.zza(f);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            float f1 = (float)(((Float)list0.get(v1)));
            this.zza.zza(v, f1);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zzg(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.zza.zza(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzii.zzb(((double)(((Double)list0.get(v2)))));
            }
            this.zza.zzb(v3);
            while(v1 < list0.size()) {
                double f = (double)(((Double)list0.get(v1)));
                this.zza.zza(f);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            double f1 = (double)(((Double)list0.get(v1)));
            this.zza.zza(v, f1);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zzh(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.zza.zza(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzii.zzk(((int)(((Integer)list0.get(v2)))));
            }
            this.zza.zzb(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.zza.zza(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.zza.zzb(v, v5);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zzi(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.zza.zza(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzii.zzb(((Boolean)list0.get(v2)).booleanValue());
            }
            this.zza.zzb(v3);
            while(v1 < list0.size()) {
                boolean z1 = ((Boolean)list0.get(v1)).booleanValue();
                this.zza.zza(z1);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            boolean z2 = ((Boolean)list0.get(v1)).booleanValue();
            this.zza.zza(v, z2);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zzj(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.zza.zza(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzii.zzg(((int)(((Integer)list0.get(v2)))));
            }
            this.zza.zzb(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.zza.zzb(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.zza.zzc(v, v5);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zzk(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.zza.zza(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzii.zzj(((int)(((Integer)list0.get(v2)))));
            }
            this.zza.zzb(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.zza.zzd(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.zza.zze(v, v5);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zzl(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.zza.zza(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzii.zzh(((long)(((Long)list0.get(v2)))));
            }
            this.zza.zzb(v3);
            while(v1 < list0.size()) {
                long v4 = (long)(((Long)list0.get(v1)));
                this.zza.zzc(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v5 = (long)(((Long)list0.get(v1)));
            this.zza.zzc(v, v5);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zzm(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.zza.zza(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzii.zzh(((int)(((Integer)list0.get(v2)))));
            }
            this.zza.zzb(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.zza.zzc(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.zza.zzd(v, v5);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzmr
    public final void zzn(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.zza.zza(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzii.zzf(((long)(((Long)list0.get(v2)))));
            }
            this.zza.zzb(v3);
            while(v1 < list0.size()) {
                long v4 = (long)(((Long)list0.get(v1)));
                this.zza.zzb(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v5 = (long)(((Long)list0.get(v1)));
            this.zza.zzb(v, v5);
            ++v1;
        }
    }
}


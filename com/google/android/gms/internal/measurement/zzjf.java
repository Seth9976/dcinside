package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

final class zzjf implements zznb {
    private final zzjc zza;

    private zzjf(zzjc zzjc0) {
        zzjc zzjc1 = (zzjc)zzjv.zza(zzjc0, "output");
        this.zza = zzjc1;
        zzjc1.zza = this;
    }

    public static zzjf zza(zzjc zzjc0) {
        zzjf zzjf0 = zzjc0.zza;
        return zzjf0 == null ? new zzjf(zzjc0) : zzjf0;
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final int zza() {
        return 1;
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    @Deprecated
    public final void zza(int v) throws IOException {
        this.zza.zzc(v, 4);
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zza(int v, double f) throws IOException {
        this.zza.zzb(v, f);
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zza(int v, float f) throws IOException {
        this.zza.zzb(v, f);
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zza(int v, int v1) throws IOException {
        this.zza.zzb(v, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zza(int v, long v1) throws IOException {
        this.zza.zza(v, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zza(int v, zzik zzik0) throws IOException {
        this.zza.zza(v, zzik0);
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zza(int v, zzkt zzkt0, Map map0) throws IOException {
        for(Object object0: map0.entrySet()) {
            this.zza.zzc(v, 2);
            int v1 = zzku.zza(zzkt0, ((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
            this.zza.zzc(v1);
            Object object1 = ((Map.Entry)object0).getKey();
            Object object2 = ((Map.Entry)object0).getValue();
            zzku.zza(this.zza, zzkt0, object1, object2);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zza(int v, Object object0) throws IOException {
        if(object0 instanceof zzik) {
            this.zza.zzb(v, ((zzik)object0));
            return;
        }
        this.zza.zza(v, ((zzlc)object0));
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zza(int v, Object object0, zzlu zzlu0) throws IOException {
        this.zza.zzc(v, 3);
        zzlu0.zza(((zzlc)object0), this.zza.zza);
        this.zza.zzc(v, 4);
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zza(int v, String s) throws IOException {
        this.zza.zza(v, s);
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zza(int v, List list0) throws IOException {
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            zzik zzik0 = (zzik)list0.get(v1);
            this.zza.zza(v, zzik0);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zza(int v, List list0, zzlu zzlu0) throws IOException {
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            this.zza(v, list0.get(v1), zzlu0);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zza(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(list0 instanceof zzii) {
            if(z) {
                this.zza.zzc(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < ((zzii)list0).size(); ++v2) {
                    v3 += zzjc.zza(((zzii)list0).zzb(v2));
                }
                this.zza.zzc(v3);
                while(v1 < ((zzii)list0).size()) {
                    boolean z1 = ((zzii)list0).zzb(v1);
                    this.zza.zzb(z1);
                    ++v1;
                }
                return;
            }
            while(v1 < ((zzii)list0).size()) {
                boolean z2 = ((zzii)list0).zzb(v1);
                this.zza.zza(v, z2);
                ++v1;
            }
            return;
        }
        if(z) {
            this.zza.zzc(v, 2);
            int v5 = 0;
            for(int v4 = 0; v4 < list0.size(); ++v4) {
                v5 += zzjc.zza(((Boolean)list0.get(v4)).booleanValue());
            }
            this.zza.zzc(v5);
            while(v1 < list0.size()) {
                boolean z3 = ((Boolean)list0.get(v1)).booleanValue();
                this.zza.zzb(z3);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            boolean z4 = ((Boolean)list0.get(v1)).booleanValue();
            this.zza.zza(v, z4);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zza(int v, boolean z) throws IOException {
        this.zza.zza(v, z);
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    @Deprecated
    public final void zzb(int v) throws IOException {
        this.zza.zzc(v, 3);
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int v, int v1) throws IOException {
        this.zza.zza(v, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int v, long v1) throws IOException {
        this.zza.zzb(v, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int v, Object object0, zzlu zzlu0) throws IOException {
        this.zza.zza(v, ((zzlc)object0), zzlu0);
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int v, List list0) throws IOException {
        int v1 = 0;
        if(list0 instanceof zzkj) {
            while(v1 < list0.size()) {
                Object object0 = ((zzkj)list0).zza(v1);
                if(object0 instanceof String) {
                    this.zza.zza(v, ((String)object0));
                }
                else {
                    this.zza.zza(v, ((zzik)object0));
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

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int v, List list0, zzlu zzlu0) throws IOException {
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            this.zzb(v, list0.get(v1), zzlu0);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(list0 instanceof zzje) {
            if(z) {
                this.zza.zzc(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < ((zzje)list0).size(); ++v2) {
                    v3 += zzjc.zza(((zzje)list0).zzb(v2));
                }
                this.zza.zzc(v3);
                while(v1 < ((zzje)list0).size()) {
                    double f = ((zzje)list0).zzb(v1);
                    this.zza.zzb(f);
                    ++v1;
                }
                return;
            }
            while(v1 < ((zzje)list0).size()) {
                double f1 = ((zzje)list0).zzb(v1);
                this.zza.zzb(v, f1);
                ++v1;
            }
            return;
        }
        if(z) {
            this.zza.zzc(v, 2);
            int v5 = 0;
            for(int v4 = 0; v4 < list0.size(); ++v4) {
                v5 += zzjc.zza(((double)(((Double)list0.get(v4)))));
            }
            this.zza.zzc(v5);
            while(v1 < list0.size()) {
                double f2 = (double)(((Double)list0.get(v1)));
                this.zza.zzb(f2);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            double f3 = (double)(((Double)list0.get(v1)));
            this.zza.zzb(v, f3);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zzc(int v, int v1) throws IOException {
        this.zza.zzb(v, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zzc(int v, long v1) throws IOException {
        this.zza.zza(v, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zzc(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(list0 instanceof zzjw) {
            if(z) {
                this.zza.zzc(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < ((zzjw)list0).size(); ++v2) {
                    v3 += zzjc.zzd(((zzjw)list0).zzb(v2));
                }
                this.zza.zzc(v3);
                while(v1 < ((zzjw)list0).size()) {
                    int v4 = ((zzjw)list0).zzb(v1);
                    this.zza.zzb(v4);
                    ++v1;
                }
                return;
            }
            while(v1 < ((zzjw)list0).size()) {
                int v5 = ((zzjw)list0).zzb(v1);
                this.zza.zzb(v, v5);
                ++v1;
            }
            return;
        }
        if(z) {
            this.zza.zzc(v, 2);
            int v7 = 0;
            for(int v6 = 0; v6 < list0.size(); ++v6) {
                v7 += zzjc.zzd(((int)(((Integer)list0.get(v6)))));
            }
            this.zza.zzc(v7);
            while(v1 < list0.size()) {
                int v8 = (int)(((Integer)list0.get(v1)));
                this.zza.zzb(v8);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v9 = (int)(((Integer)list0.get(v1)));
            this.zza.zzb(v, v9);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zzd(int v, int v1) throws IOException {
        this.zza.zza(v, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zzd(int v, long v1) throws IOException {
        this.zza.zzh(v, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zzd(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(list0 instanceof zzjw) {
            if(z) {
                this.zza.zzc(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < ((zzjw)list0).size(); ++v2) {
                    v3 += zzjc.zze(((zzjw)list0).zzb(v2));
                }
                this.zza.zzc(v3);
                while(v1 < ((zzjw)list0).size()) {
                    int v4 = ((zzjw)list0).zzb(v1);
                    this.zza.zza(v4);
                    ++v1;
                }
                return;
            }
            while(v1 < ((zzjw)list0).size()) {
                int v5 = ((zzjw)list0).zzb(v1);
                this.zza.zza(v, v5);
                ++v1;
            }
            return;
        }
        if(z) {
            this.zza.zzc(v, 2);
            int v7 = 0;
            for(int v6 = 0; v6 < list0.size(); ++v6) {
                v7 += zzjc.zze(((int)(((Integer)list0.get(v6)))));
            }
            this.zza.zzc(v7);
            while(v1 < list0.size()) {
                int v8 = (int)(((Integer)list0.get(v1)));
                this.zza.zza(v8);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v9 = (int)(((Integer)list0.get(v1)));
            this.zza.zza(v, v9);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zze(int v, int v1) throws IOException {
        this.zza.zzk(v, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zze(int v, long v1) throws IOException {
        this.zza.zzb(v, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zze(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(list0 instanceof zzkn) {
            if(z) {
                this.zza.zzc(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < ((zzkn)list0).size(); ++v2) {
                    v3 += zzjc.zzc(((zzkn)list0).zzb(v2));
                }
                this.zza.zzc(v3);
                while(v1 < ((zzkn)list0).size()) {
                    long v4 = ((zzkn)list0).zzb(v1);
                    this.zza.zza(v4);
                    ++v1;
                }
                return;
            }
            while(v1 < ((zzkn)list0).size()) {
                long v5 = ((zzkn)list0).zzb(v1);
                this.zza.zza(v, v5);
                ++v1;
            }
            return;
        }
        if(z) {
            this.zza.zzc(v, 2);
            int v7 = 0;
            for(int v6 = 0; v6 < list0.size(); ++v6) {
                v7 += zzjc.zzc(((long)(((Long)list0.get(v6)))));
            }
            this.zza.zzc(v7);
            while(v1 < list0.size()) {
                long v8 = (long)(((Long)list0.get(v1)));
                this.zza.zza(v8);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v9 = (long)(((Long)list0.get(v1)));
            this.zza.zza(v, v9);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zzf(int v, int v1) throws IOException {
        this.zza.zzd(v, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zzf(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(list0 instanceof zzjs) {
            if(z) {
                this.zza.zzc(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < ((zzjs)list0).size(); ++v2) {
                    v3 += zzjc.zza(((zzjs)list0).zzb(v2));
                }
                this.zza.zzc(v3);
                while(v1 < ((zzjs)list0).size()) {
                    float f = ((zzjs)list0).zzb(v1);
                    this.zza.zzb(f);
                    ++v1;
                }
                return;
            }
            while(v1 < ((zzjs)list0).size()) {
                float f1 = ((zzjs)list0).zzb(v1);
                this.zza.zzb(v, f1);
                ++v1;
            }
            return;
        }
        if(z) {
            this.zza.zzc(v, 2);
            int v5 = 0;
            for(int v4 = 0; v4 < list0.size(); ++v4) {
                v5 += zzjc.zza(((float)(((Float)list0.get(v4)))));
            }
            this.zza.zzc(v5);
            while(v1 < list0.size()) {
                float f2 = (float)(((Float)list0.get(v1)));
                this.zza.zzb(f2);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            float f3 = (float)(((Float)list0.get(v1)));
            this.zza.zzb(v, f3);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zzg(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(list0 instanceof zzjw) {
            if(z) {
                this.zza.zzc(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < ((zzjw)list0).size(); ++v2) {
                    v3 += zzjc.zzf(((zzjw)list0).zzb(v2));
                }
                this.zza.zzc(v3);
                while(v1 < ((zzjw)list0).size()) {
                    int v4 = ((zzjw)list0).zzb(v1);
                    this.zza.zzb(v4);
                    ++v1;
                }
                return;
            }
            while(v1 < ((zzjw)list0).size()) {
                int v5 = ((zzjw)list0).zzb(v1);
                this.zza.zzb(v, v5);
                ++v1;
            }
            return;
        }
        if(z) {
            this.zza.zzc(v, 2);
            int v7 = 0;
            for(int v6 = 0; v6 < list0.size(); ++v6) {
                v7 += zzjc.zzf(((int)(((Integer)list0.get(v6)))));
            }
            this.zza.zzc(v7);
            while(v1 < list0.size()) {
                int v8 = (int)(((Integer)list0.get(v1)));
                this.zza.zzb(v8);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v9 = (int)(((Integer)list0.get(v1)));
            this.zza.zzb(v, v9);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zzh(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(list0 instanceof zzkn) {
            if(z) {
                this.zza.zzc(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < ((zzkn)list0).size(); ++v2) {
                    v3 += zzjc.zzd(((zzkn)list0).zzb(v2));
                }
                this.zza.zzc(v3);
                while(v1 < ((zzkn)list0).size()) {
                    long v4 = ((zzkn)list0).zzb(v1);
                    this.zza.zzb(v4);
                    ++v1;
                }
                return;
            }
            while(v1 < ((zzkn)list0).size()) {
                long v5 = ((zzkn)list0).zzb(v1);
                this.zza.zzb(v, v5);
                ++v1;
            }
            return;
        }
        if(z) {
            this.zza.zzc(v, 2);
            int v7 = 0;
            for(int v6 = 0; v6 < list0.size(); ++v6) {
                v7 += zzjc.zzd(((long)(((Long)list0.get(v6)))));
            }
            this.zza.zzc(v7);
            while(v1 < list0.size()) {
                long v8 = (long)(((Long)list0.get(v1)));
                this.zza.zzb(v8);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v9 = (long)(((Long)list0.get(v1)));
            this.zza.zzb(v, v9);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zzi(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(list0 instanceof zzjw) {
            if(z) {
                this.zza.zzc(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < ((zzjw)list0).size(); ++v2) {
                    v3 += zzjc.zzg(((zzjw)list0).zzb(v2));
                }
                this.zza.zzc(v3);
                while(v1 < ((zzjw)list0).size()) {
                    int v4 = ((zzjw)list0).zzb(v1);
                    this.zza.zza(v4);
                    ++v1;
                }
                return;
            }
            while(v1 < ((zzjw)list0).size()) {
                int v5 = ((zzjw)list0).zzb(v1);
                this.zza.zza(v, v5);
                ++v1;
            }
            return;
        }
        if(z) {
            this.zza.zzc(v, 2);
            int v7 = 0;
            for(int v6 = 0; v6 < list0.size(); ++v6) {
                v7 += zzjc.zzg(((int)(((Integer)list0.get(v6)))));
            }
            this.zza.zzc(v7);
            while(v1 < list0.size()) {
                int v8 = (int)(((Integer)list0.get(v1)));
                this.zza.zza(v8);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v9 = (int)(((Integer)list0.get(v1)));
            this.zza.zza(v, v9);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zzj(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(list0 instanceof zzkn) {
            if(z) {
                this.zza.zzc(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < ((zzkn)list0).size(); ++v2) {
                    v3 += zzjc.zze(((zzkn)list0).zzb(v2));
                }
                this.zza.zzc(v3);
                while(v1 < ((zzkn)list0).size()) {
                    long v4 = ((zzkn)list0).zzb(v1);
                    this.zza.zza(v4);
                    ++v1;
                }
                return;
            }
            while(v1 < ((zzkn)list0).size()) {
                long v5 = ((zzkn)list0).zzb(v1);
                this.zza.zza(v, v5);
                ++v1;
            }
            return;
        }
        if(z) {
            this.zza.zzc(v, 2);
            int v7 = 0;
            for(int v6 = 0; v6 < list0.size(); ++v6) {
                v7 += zzjc.zze(((long)(((Long)list0.get(v6)))));
            }
            this.zza.zzc(v7);
            while(v1 < list0.size()) {
                long v8 = (long)(((Long)list0.get(v1)));
                this.zza.zza(v8);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v9 = (long)(((Long)list0.get(v1)));
            this.zza.zza(v, v9);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zzk(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(list0 instanceof zzjw) {
            if(z) {
                this.zza.zzc(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < ((zzjw)list0).size(); ++v2) {
                    v3 += zzjc.zzh(((zzjw)list0).zzb(v2));
                }
                this.zza.zzc(v3);
                while(v1 < ((zzjw)list0).size()) {
                    int v4 = ((zzjw)list0).zzb(v1);
                    this.zza.zzk(v4);
                    ++v1;
                }
                return;
            }
            while(v1 < ((zzjw)list0).size()) {
                int v5 = ((zzjw)list0).zzb(v1);
                this.zza.zzk(v, v5);
                ++v1;
            }
            return;
        }
        if(z) {
            this.zza.zzc(v, 2);
            int v7 = 0;
            for(int v6 = 0; v6 < list0.size(); ++v6) {
                v7 += zzjc.zzh(((int)(((Integer)list0.get(v6)))));
            }
            this.zza.zzc(v7);
            while(v1 < list0.size()) {
                int v8 = (int)(((Integer)list0.get(v1)));
                this.zza.zzk(v8);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v9 = (int)(((Integer)list0.get(v1)));
            this.zza.zzk(v, v9);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zzl(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(list0 instanceof zzkn) {
            if(z) {
                this.zza.zzc(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < ((zzkn)list0).size(); ++v2) {
                    v3 += zzjc.zzf(((zzkn)list0).zzb(v2));
                }
                this.zza.zzc(v3);
                while(v1 < ((zzkn)list0).size()) {
                    long v4 = ((zzkn)list0).zzb(v1);
                    this.zza.zzh(v4);
                    ++v1;
                }
                return;
            }
            while(v1 < ((zzkn)list0).size()) {
                long v5 = ((zzkn)list0).zzb(v1);
                this.zza.zzh(v, v5);
                ++v1;
            }
            return;
        }
        if(z) {
            this.zza.zzc(v, 2);
            int v7 = 0;
            for(int v6 = 0; v6 < list0.size(); ++v6) {
                v7 += zzjc.zzf(((long)(((Long)list0.get(v6)))));
            }
            this.zza.zzc(v7);
            while(v1 < list0.size()) {
                long v8 = (long)(((Long)list0.get(v1)));
                this.zza.zzh(v8);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v9 = (long)(((Long)list0.get(v1)));
            this.zza.zzh(v, v9);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zzm(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(list0 instanceof zzjw) {
            if(z) {
                this.zza.zzc(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < ((zzjw)list0).size(); ++v2) {
                    v3 += zzjc.zzj(((zzjw)list0).zzb(v2));
                }
                this.zza.zzc(v3);
                while(v1 < ((zzjw)list0).size()) {
                    int v4 = ((zzjw)list0).zzb(v1);
                    this.zza.zzc(v4);
                    ++v1;
                }
                return;
            }
            while(v1 < ((zzjw)list0).size()) {
                int v5 = ((zzjw)list0).zzb(v1);
                this.zza.zzd(v, v5);
                ++v1;
            }
            return;
        }
        if(z) {
            this.zza.zzc(v, 2);
            int v7 = 0;
            for(int v6 = 0; v6 < list0.size(); ++v6) {
                v7 += zzjc.zzj(((int)(((Integer)list0.get(v6)))));
            }
            this.zza.zzc(v7);
            while(v1 < list0.size()) {
                int v8 = (int)(((Integer)list0.get(v1)));
                this.zza.zzc(v8);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v9 = (int)(((Integer)list0.get(v1)));
            this.zza.zzd(v, v9);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zznb
    public final void zzn(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(list0 instanceof zzkn) {
            if(z) {
                this.zza.zzc(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < ((zzkn)list0).size(); ++v2) {
                    v3 += zzjc.zzg(((zzkn)list0).zzb(v2));
                }
                this.zza.zzc(v3);
                while(v1 < ((zzkn)list0).size()) {
                    long v4 = ((zzkn)list0).zzb(v1);
                    this.zza.zzb(v4);
                    ++v1;
                }
                return;
            }
            while(v1 < ((zzkn)list0).size()) {
                long v5 = ((zzkn)list0).zzb(v1);
                this.zza.zzb(v, v5);
                ++v1;
            }
            return;
        }
        if(z) {
            this.zza.zzc(v, 2);
            int v7 = 0;
            for(int v6 = 0; v6 < list0.size(); ++v6) {
                v7 += zzjc.zzg(((long)(((Long)list0.get(v6)))));
            }
            this.zza.zzc(v7);
            while(v1 < list0.size()) {
                long v8 = (long)(((Long)list0.get(v1)));
                this.zza.zzb(v8);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v9 = (long)(((Long)list0.get(v1)));
            this.zza.zzb(v, v9);
            ++v1;
        }
    }
}


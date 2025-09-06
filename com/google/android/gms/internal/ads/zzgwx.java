package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

final class zzgwx implements zzhaw {
    private final zzgww zza;

    private zzgwx(zzgww zzgww0) {
        zzgye.zzc(zzgww0, "output");
        this.zza = zzgww0;
        zzgww0.zze = this;
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzA(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(list0 instanceof zzgyr) {
            if(z) {
                this.zza.zzs(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < ((zzgyr)list0).size(); ++v2) {
                    ((zzgyr)list0).zza(v2);
                    v3 += 8;
                }
                this.zza.zzu(v3);
                while(v1 < ((zzgyr)list0).size()) {
                    long v4 = ((zzgyr)list0).zza(v1);
                    this.zza.zzk(v4);
                    ++v1;
                }
                return;
            }
            while(v1 < ((zzgyr)list0).size()) {
                long v5 = ((zzgyr)list0).zza(v1);
                this.zza.zzj(v, v5);
                ++v1;
            }
            return;
        }
        if(z) {
            this.zza.zzs(v, 2);
            int v7 = 0;
            for(int v6 = 0; v6 < list0.size(); ++v6) {
                ((Long)list0.get(v6)).longValue();
                v7 += 8;
            }
            this.zza.zzu(v7);
            while(v1 < list0.size()) {
                long v8 = (long)(((Long)list0.get(v1)));
                this.zza.zzk(v8);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v9 = (long)(((Long)list0.get(v1)));
            this.zza.zzj(v, v9);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzB(int v, int v1) throws IOException {
        this.zza.zzt(v, v1 >> 0x1F ^ v1 + v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzC(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(list0 instanceof zzgxs) {
            if(z) {
                this.zza.zzs(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < ((zzgxs)list0).size(); ++v2) {
                    int v4 = ((zzgxs)list0).zzd(v2);
                    v3 += zzgww.zzD(v4 >> 0x1F ^ v4 + v4);
                }
                this.zza.zzu(v3);
                while(v1 < ((zzgxs)list0).size()) {
                    int v5 = ((zzgxs)list0).zzd(v1);
                    this.zza.zzu(v5 >> 0x1F ^ v5 + v5);
                    ++v1;
                }
                return;
            }
            while(v1 < ((zzgxs)list0).size()) {
                int v6 = ((zzgxs)list0).zzd(v1);
                this.zza.zzt(v, v6 >> 0x1F ^ v6 + v6);
                ++v1;
            }
            return;
        }
        if(z) {
            this.zza.zzs(v, 2);
            int v8 = 0;
            for(int v7 = 0; v7 < list0.size(); ++v7) {
                int v9 = (int)(((Integer)list0.get(v7)));
                v8 += zzgww.zzD(v9 >> 0x1F ^ v9 + v9);
            }
            this.zza.zzu(v8);
            while(v1 < list0.size()) {
                int v10 = (int)(((Integer)list0.get(v1)));
                this.zza.zzu(v10 >> 0x1F ^ v10 + v10);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v11 = (int)(((Integer)list0.get(v1)));
            this.zza.zzt(v, v11 >> 0x1F ^ v11 + v11);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzD(int v, long v1) throws IOException {
        this.zza.zzv(v, v1 >> 0x3F ^ v1 + v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzE(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(list0 instanceof zzgyr) {
            if(z) {
                this.zza.zzs(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < ((zzgyr)list0).size(); ++v2) {
                    long v4 = ((zzgyr)list0).zza(v2);
                    v3 += zzgww.zzE(v4 >> 0x3F ^ v4 + v4);
                }
                this.zza.zzu(v3);
                while(v1 < ((zzgyr)list0).size()) {
                    long v5 = ((zzgyr)list0).zza(v1);
                    this.zza.zzw(v5 >> 0x3F ^ v5 + v5);
                    ++v1;
                }
                return;
            }
            while(v1 < ((zzgyr)list0).size()) {
                long v6 = ((zzgyr)list0).zza(v1);
                this.zza.zzv(v, v6 >> 0x3F ^ v6 + v6);
                ++v1;
            }
            return;
        }
        if(z) {
            this.zza.zzs(v, 2);
            int v8 = 0;
            for(int v7 = 0; v7 < list0.size(); ++v7) {
                long v9 = (long)(((Long)list0.get(v7)));
                v8 += zzgww.zzE(v9 >> 0x3F ^ v9 + v9);
            }
            this.zza.zzu(v8);
            while(v1 < list0.size()) {
                long v10 = (long)(((Long)list0.get(v1)));
                this.zza.zzw(v10 >> 0x3F ^ v10 + v10);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v11 = (long)(((Long)list0.get(v1)));
            this.zza.zzv(v, v11 >> 0x3F ^ v11 + v11);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    @Deprecated
    public final void zzF(int v) throws IOException {
        this.zza.zzs(v, 3);
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzG(int v, String s) throws IOException {
        this.zza.zzq(v, s);
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzH(int v, List list0) throws IOException {
        int v1 = 0;
        if(list0 instanceof zzgyo) {
            while(v1 < list0.size()) {
                Object object0 = ((zzgyo)list0).zzc();
                if(object0 instanceof String) {
                    this.zza.zzq(v, ((String)object0));
                }
                else {
                    this.zza.zzN(v, ((zzgwj)object0));
                }
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            String s = (String)list0.get(v1);
            this.zza.zzq(v, s);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzI(int v, int v1) throws IOException {
        this.zza.zzt(v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzJ(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(list0 instanceof zzgxs) {
            if(z) {
                this.zza.zzs(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < ((zzgxs)list0).size(); ++v2) {
                    v3 += zzgww.zzD(((zzgxs)list0).zzd(v2));
                }
                this.zza.zzu(v3);
                while(v1 < ((zzgxs)list0).size()) {
                    int v4 = ((zzgxs)list0).zzd(v1);
                    this.zza.zzu(v4);
                    ++v1;
                }
                return;
            }
            while(v1 < ((zzgxs)list0).size()) {
                int v5 = ((zzgxs)list0).zzd(v1);
                this.zza.zzt(v, v5);
                ++v1;
            }
            return;
        }
        if(z) {
            this.zza.zzs(v, 2);
            int v7 = 0;
            for(int v6 = 0; v6 < list0.size(); ++v6) {
                v7 += zzgww.zzD(((int)(((Integer)list0.get(v6)))));
            }
            this.zza.zzu(v7);
            while(v1 < list0.size()) {
                int v8 = (int)(((Integer)list0.get(v1)));
                this.zza.zzu(v8);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v9 = (int)(((Integer)list0.get(v1)));
            this.zza.zzt(v, v9);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzK(int v, long v1) throws IOException {
        this.zza.zzv(v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzL(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(list0 instanceof zzgyr) {
            if(z) {
                this.zza.zzs(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < ((zzgyr)list0).size(); ++v2) {
                    v3 += zzgww.zzE(((zzgyr)list0).zza(v2));
                }
                this.zza.zzu(v3);
                while(v1 < ((zzgyr)list0).size()) {
                    long v4 = ((zzgyr)list0).zza(v1);
                    this.zza.zzw(v4);
                    ++v1;
                }
                return;
            }
            while(v1 < ((zzgyr)list0).size()) {
                long v5 = ((zzgyr)list0).zza(v1);
                this.zza.zzv(v, v5);
                ++v1;
            }
            return;
        }
        if(z) {
            this.zza.zzs(v, 2);
            int v7 = 0;
            for(int v6 = 0; v6 < list0.size(); ++v6) {
                v7 += zzgww.zzE(((long)(((Long)list0.get(v6)))));
            }
            this.zza.zzu(v7);
            while(v1 < list0.size()) {
                long v8 = (long)(((Long)list0.get(v1)));
                this.zza.zzw(v8);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v9 = (long)(((Long)list0.get(v1)));
            this.zza.zzv(v, v9);
            ++v1;
        }
    }

    public static zzgwx zza(zzgww zzgww0) {
        zzgwx zzgwx0 = zzgww0.zze;
        return zzgwx0 == null ? new zzgwx(zzgww0) : zzgwx0;
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzb(int v, boolean z) throws IOException {
        this.zza.zzM(v, z);
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzc(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(list0 instanceof zzgvz) {
            if(z) {
                this.zza.zzs(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < ((zzgvz)list0).size(); ++v2) {
                    ((zzgvz)list0).zzh(v2);
                    ++v3;
                }
                this.zza.zzu(v3);
                while(v1 < ((zzgvz)list0).size()) {
                    boolean z1 = ((zzgvz)list0).zzh(v1);
                    this.zza.zzL(((byte)z1));
                    ++v1;
                }
                return;
            }
            while(v1 < ((zzgvz)list0).size()) {
                boolean z2 = ((zzgvz)list0).zzh(v1);
                this.zza.zzM(v, z2);
                ++v1;
            }
            return;
        }
        if(z) {
            this.zza.zzs(v, 2);
            int v5 = 0;
            for(int v4 = 0; v4 < list0.size(); ++v4) {
                ((Boolean)list0.get(v4)).booleanValue();
                ++v5;
            }
            this.zza.zzu(v5);
            while(v1 < list0.size()) {
                boolean z3 = ((Boolean)list0.get(v1)).booleanValue();
                this.zza.zzL(((byte)z3));
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            boolean z4 = ((Boolean)list0.get(v1)).booleanValue();
            this.zza.zzM(v, z4);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzd(int v, zzgwj zzgwj0) throws IOException {
        this.zza.zzN(v, zzgwj0);
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zze(int v, List list0) throws IOException {
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            zzgwj zzgwj0 = (zzgwj)list0.get(v1);
            this.zza.zzN(v, zzgwj0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzf(int v, double f) throws IOException {
        this.zza.zzj(v, Double.doubleToRawLongBits(f));
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzg(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(list0 instanceof zzgwy) {
            if(z) {
                this.zza.zzs(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < ((zzgwy)list0).size(); ++v2) {
                    ((zzgwy)list0).zzd(v2);
                    v3 += 8;
                }
                this.zza.zzu(v3);
                while(v1 < ((zzgwy)list0).size()) {
                    long v4 = Double.doubleToRawLongBits(((zzgwy)list0).zzd(v1));
                    this.zza.zzk(v4);
                    ++v1;
                }
                return;
            }
            while(v1 < ((zzgwy)list0).size()) {
                long v5 = Double.doubleToRawLongBits(((zzgwy)list0).zzd(v1));
                this.zza.zzj(v, v5);
                ++v1;
            }
            return;
        }
        if(z) {
            this.zza.zzs(v, 2);
            int v7 = 0;
            for(int v6 = 0; v6 < list0.size(); ++v6) {
                ((Double)list0.get(v6)).doubleValue();
                v7 += 8;
            }
            this.zza.zzu(v7);
            while(v1 < list0.size()) {
                long v8 = Double.doubleToRawLongBits(((double)(((Double)list0.get(v1)))));
                this.zza.zzk(v8);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v9 = Double.doubleToRawLongBits(((double)(((Double)list0.get(v1)))));
            this.zza.zzj(v, v9);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    @Deprecated
    public final void zzh(int v) throws IOException {
        this.zza.zzs(v, 4);
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzi(int v, int v1) throws IOException {
        this.zza.zzl(v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzj(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(list0 instanceof zzgxs) {
            if(z) {
                this.zza.zzs(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < ((zzgxs)list0).size(); ++v2) {
                    v3 += zzgww.zzE(((zzgxs)list0).zzd(v2));
                }
                this.zza.zzu(v3);
                while(v1 < ((zzgxs)list0).size()) {
                    int v4 = ((zzgxs)list0).zzd(v1);
                    this.zza.zzm(v4);
                    ++v1;
                }
                return;
            }
            while(v1 < ((zzgxs)list0).size()) {
                int v5 = ((zzgxs)list0).zzd(v1);
                this.zza.zzl(v, v5);
                ++v1;
            }
            return;
        }
        if(z) {
            this.zza.zzs(v, 2);
            int v7 = 0;
            for(int v6 = 0; v6 < list0.size(); ++v6) {
                v7 += zzgww.zzE(((int)(((Integer)list0.get(v6)))));
            }
            this.zza.zzu(v7);
            while(v1 < list0.size()) {
                int v8 = (int)(((Integer)list0.get(v1)));
                this.zza.zzm(v8);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v9 = (int)(((Integer)list0.get(v1)));
            this.zza.zzl(v, v9);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzk(int v, int v1) throws IOException {
        this.zza.zzh(v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzl(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(list0 instanceof zzgxs) {
            if(z) {
                this.zza.zzs(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < ((zzgxs)list0).size(); ++v2) {
                    ((zzgxs)list0).zzd(v2);
                    v3 += 4;
                }
                this.zza.zzu(v3);
                while(v1 < ((zzgxs)list0).size()) {
                    int v4 = ((zzgxs)list0).zzd(v1);
                    this.zza.zzi(v4);
                    ++v1;
                }
                return;
            }
            while(v1 < ((zzgxs)list0).size()) {
                int v5 = ((zzgxs)list0).zzd(v1);
                this.zza.zzh(v, v5);
                ++v1;
            }
            return;
        }
        if(z) {
            this.zza.zzs(v, 2);
            int v7 = 0;
            for(int v6 = 0; v6 < list0.size(); ++v6) {
                ((Integer)list0.get(v6)).intValue();
                v7 += 4;
            }
            this.zza.zzu(v7);
            while(v1 < list0.size()) {
                int v8 = (int)(((Integer)list0.get(v1)));
                this.zza.zzi(v8);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v9 = (int)(((Integer)list0.get(v1)));
            this.zza.zzh(v, v9);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzm(int v, long v1) throws IOException {
        this.zza.zzj(v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzn(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(list0 instanceof zzgyr) {
            if(z) {
                this.zza.zzs(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < ((zzgyr)list0).size(); ++v2) {
                    ((zzgyr)list0).zza(v2);
                    v3 += 8;
                }
                this.zza.zzu(v3);
                while(v1 < ((zzgyr)list0).size()) {
                    long v4 = ((zzgyr)list0).zza(v1);
                    this.zza.zzk(v4);
                    ++v1;
                }
                return;
            }
            while(v1 < ((zzgyr)list0).size()) {
                long v5 = ((zzgyr)list0).zza(v1);
                this.zza.zzj(v, v5);
                ++v1;
            }
            return;
        }
        if(z) {
            this.zza.zzs(v, 2);
            int v7 = 0;
            for(int v6 = 0; v6 < list0.size(); ++v6) {
                ((Long)list0.get(v6)).longValue();
                v7 += 8;
            }
            this.zza.zzu(v7);
            while(v1 < list0.size()) {
                long v8 = (long)(((Long)list0.get(v1)));
                this.zza.zzk(v8);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v9 = (long)(((Long)list0.get(v1)));
            this.zza.zzj(v, v9);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzo(int v, float f) throws IOException {
        this.zza.zzh(v, Float.floatToRawIntBits(f));
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzp(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(list0 instanceof zzgxi) {
            if(z) {
                this.zza.zzs(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < ((zzgxi)list0).size(); ++v2) {
                    ((zzgxi)list0).zzd(v2);
                    v3 += 4;
                }
                this.zza.zzu(v3);
                while(v1 < ((zzgxi)list0).size()) {
                    int v4 = Float.floatToRawIntBits(((zzgxi)list0).zzd(v1));
                    this.zza.zzi(v4);
                    ++v1;
                }
                return;
            }
            while(v1 < ((zzgxi)list0).size()) {
                int v5 = Float.floatToRawIntBits(((zzgxi)list0).zzd(v1));
                this.zza.zzh(v, v5);
                ++v1;
            }
            return;
        }
        if(z) {
            this.zza.zzs(v, 2);
            int v7 = 0;
            for(int v6 = 0; v6 < list0.size(); ++v6) {
                ((Float)list0.get(v6)).floatValue();
                v7 += 4;
            }
            this.zza.zzu(v7);
            while(v1 < list0.size()) {
                int v8 = Float.floatToRawIntBits(((float)(((Float)list0.get(v1)))));
                this.zza.zzi(v8);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v9 = Float.floatToRawIntBits(((float)(((Float)list0.get(v1)))));
            this.zza.zzh(v, v9);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzq(int v, Object object0, zzgzv zzgzv0) throws IOException {
        this.zza.zzs(v, 3);
        zzgzv0.zzj(((zzgzc)object0), this.zza.zze);
        this.zza.zzs(v, 4);
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzr(int v, int v1) throws IOException {
        this.zza.zzl(v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzs(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(list0 instanceof zzgxs) {
            if(z) {
                this.zza.zzs(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < ((zzgxs)list0).size(); ++v2) {
                    v3 += zzgww.zzE(((zzgxs)list0).zzd(v2));
                }
                this.zza.zzu(v3);
                while(v1 < ((zzgxs)list0).size()) {
                    int v4 = ((zzgxs)list0).zzd(v1);
                    this.zza.zzm(v4);
                    ++v1;
                }
                return;
            }
            while(v1 < ((zzgxs)list0).size()) {
                int v5 = ((zzgxs)list0).zzd(v1);
                this.zza.zzl(v, v5);
                ++v1;
            }
            return;
        }
        if(z) {
            this.zza.zzs(v, 2);
            int v7 = 0;
            for(int v6 = 0; v6 < list0.size(); ++v6) {
                v7 += zzgww.zzE(((int)(((Integer)list0.get(v6)))));
            }
            this.zza.zzu(v7);
            while(v1 < list0.size()) {
                int v8 = (int)(((Integer)list0.get(v1)));
                this.zza.zzm(v8);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v9 = (int)(((Integer)list0.get(v1)));
            this.zza.zzl(v, v9);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzt(int v, long v1) throws IOException {
        this.zza.zzv(v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzu(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(list0 instanceof zzgyr) {
            if(z) {
                this.zza.zzs(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < ((zzgyr)list0).size(); ++v2) {
                    v3 += zzgww.zzE(((zzgyr)list0).zza(v2));
                }
                this.zza.zzu(v3);
                while(v1 < ((zzgyr)list0).size()) {
                    long v4 = ((zzgyr)list0).zza(v1);
                    this.zza.zzw(v4);
                    ++v1;
                }
                return;
            }
            while(v1 < ((zzgyr)list0).size()) {
                long v5 = ((zzgyr)list0).zza(v1);
                this.zza.zzv(v, v5);
                ++v1;
            }
            return;
        }
        if(z) {
            this.zza.zzs(v, 2);
            int v7 = 0;
            for(int v6 = 0; v6 < list0.size(); ++v6) {
                v7 += zzgww.zzE(((long)(((Long)list0.get(v6)))));
            }
            this.zza.zzu(v7);
            while(v1 < list0.size()) {
                long v8 = (long)(((Long)list0.get(v1)));
                this.zza.zzw(v8);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v9 = (long)(((Long)list0.get(v1)));
            this.zza.zzv(v, v9);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzv(int v, Object object0, zzgzv zzgzv0) throws IOException {
        this.zza.zzn(v, ((zzgzc)object0), zzgzv0);
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzw(int v, Object object0) throws IOException {
        if(object0 instanceof zzgwj) {
            this.zza.zzp(v, ((zzgwj)object0));
            return;
        }
        this.zza.zzo(v, ((zzgzc)object0));
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzx(int v, int v1) throws IOException {
        this.zza.zzh(v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzy(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(list0 instanceof zzgxs) {
            if(z) {
                this.zza.zzs(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < ((zzgxs)list0).size(); ++v2) {
                    ((zzgxs)list0).zzd(v2);
                    v3 += 4;
                }
                this.zza.zzu(v3);
                while(v1 < ((zzgxs)list0).size()) {
                    int v4 = ((zzgxs)list0).zzd(v1);
                    this.zza.zzi(v4);
                    ++v1;
                }
                return;
            }
            while(v1 < ((zzgxs)list0).size()) {
                int v5 = ((zzgxs)list0).zzd(v1);
                this.zza.zzh(v, v5);
                ++v1;
            }
            return;
        }
        if(z) {
            this.zza.zzs(v, 2);
            int v7 = 0;
            for(int v6 = 0; v6 < list0.size(); ++v6) {
                ((Integer)list0.get(v6)).intValue();
                v7 += 4;
            }
            this.zza.zzu(v7);
            while(v1 < list0.size()) {
                int v8 = (int)(((Integer)list0.get(v1)));
                this.zza.zzi(v8);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v9 = (int)(((Integer)list0.get(v1)));
            this.zza.zzh(v, v9);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzhaw
    public final void zzz(int v, long v1) throws IOException {
        this.zza.zzj(v, v1);
    }
}


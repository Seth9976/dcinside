package com.google.android.gms.internal.measurement;

import java.io.IOException;

class zziv extends zzis {
    protected final byte[] zzb;

    zziv(byte[] arr_b) {
        super(null);
        arr_b.getClass();
        this.zzb = arr_b;
    }

    @Override  // com.google.android.gms.internal.measurement.zzik
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof zzik)) {
            return false;
        }
        if(this.zzb() != ((zzik)object0).zzb()) {
            return false;
        }
        if(this.zzb() == 0) {
            return true;
        }
        if(object0 instanceof zziv) {
            int v = this.zza();
            int v1 = ((zziv)object0).zza();
            return v == 0 || v1 == 0 || v == v1 ? this.zza(((zziv)object0), 0, this.zzb()) : false;
        }
        return object0.equals(this);
    }

    @Override  // com.google.android.gms.internal.measurement.zzik
    public byte zza(int v) {
        return this.zzb[v];
    }

    @Override  // com.google.android.gms.internal.measurement.zzik
    public final zzik zza(int v, int v1) {
        int v2 = zzik.zza(0, v1, this.zzb());
        return v2 == 0 ? zzik.zza : new zzio(this.zzb, this.zzc(), v2);
    }

    @Override  // com.google.android.gms.internal.measurement.zzik
    final void zza(zzil zzil0) throws IOException {
        int v = this.zzb();
        zzil0.zza(this.zzb, this.zzc(), v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzis
    final boolean zza(zzik zzik0, int v, int v1) {
        if(v1 > zzik0.zzb()) {
            throw new IllegalArgumentException("Length too large: " + v1 + this.zzb());
        }
        if(v1 > zzik0.zzb()) {
            throw new IllegalArgumentException("Ran off end of other: " + 0 + ", " + v1 + ", " + zzik0.zzb());
        }
        if(zzik0 instanceof zziv) {
            byte[] arr_b = this.zzb;
            byte[] arr_b1 = ((zziv)zzik0).zzb;
            int v2 = this.zzc();
            int v3 = this.zzc();
            for(int v4 = ((zziv)zzik0).zzc(); v3 < v2 + v1; ++v4) {
                if(arr_b[v3] != arr_b1[v4]) {
                    return false;
                }
                ++v3;
            }
            return true;
        }
        return zzik0.zza(0, v1).equals(this.zza(0, v1));
    }

    @Override  // com.google.android.gms.internal.measurement.zzik
    byte zzb(int v) {
        return this.zzb[v];
    }

    @Override  // com.google.android.gms.internal.measurement.zzik
    public int zzb() {
        return this.zzb.length;
    }

    @Override  // com.google.android.gms.internal.measurement.zzik
    protected final int zzb(int v, int v1, int v2) {
        return zzjv.zza(v, this.zzb, this.zzc(), v2);
    }

    protected int zzc() {
        return 0;
    }
}


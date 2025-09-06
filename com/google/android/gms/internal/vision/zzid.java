package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.nio.charset.Charset;

class zzid extends zzia {
    protected final byte[] zzb;

    zzid(byte[] arr_b) {
        arr_b.getClass();
        this.zzb = arr_b;
    }

    @Override  // com.google.android.gms.internal.vision.zzht
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof zzht)) {
            return false;
        }
        if(this.zza() != ((zzht)object0).zza()) {
            return false;
        }
        if(this.zza() == 0) {
            return true;
        }
        if(object0 instanceof zzid) {
            int v = this.zzd();
            int v1 = ((zzid)object0).zzd();
            return v == 0 || v1 == 0 || v == v1 ? this.zza(((zzid)object0), 0, this.zza()) : false;
        }
        return object0.equals(this);
    }

    @Override  // com.google.android.gms.internal.vision.zzht
    public byte zza(int v) {
        return this.zzb[v];
    }

    @Override  // com.google.android.gms.internal.vision.zzht
    public int zza() {
        return this.zzb.length;
    }

    @Override  // com.google.android.gms.internal.vision.zzht
    protected final int zza(int v, int v1, int v2) {
        return zzjf.zza(v, this.zzb, this.zze(), v2);
    }

    @Override  // com.google.android.gms.internal.vision.zzht
    public final zzht zza(int v, int v1) {
        int v2 = zzht.zzb(0, v1, this.zza());
        return v2 == 0 ? zzht.zza : new zzhw(this.zzb, this.zze(), v2);
    }

    @Override  // com.google.android.gms.internal.vision.zzht
    protected final String zza(Charset charset0) {
        int v = this.zza();
        return new String(this.zzb, this.zze(), v, charset0);
    }

    @Override  // com.google.android.gms.internal.vision.zzht
    final void zza(zzhq zzhq0) throws IOException {
        int v = this.zza();
        zzhq0.zza(this.zzb, this.zze(), v);
    }

    @Override  // com.google.android.gms.internal.vision.zzht
    protected void zza(byte[] arr_b, int v, int v1, int v2) {
        System.arraycopy(this.zzb, 0, arr_b, 0, v2);
    }

    @Override  // com.google.android.gms.internal.vision.zzia
    final boolean zza(zzht zzht0, int v, int v1) {
        if(v1 > zzht0.zza()) {
            throw new IllegalArgumentException("Length too large: " + v1 + this.zza());
        }
        if(v1 > zzht0.zza()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + v1 + ", " + zzht0.zza());
        }
        if(zzht0 instanceof zzid) {
            byte[] arr_b = this.zzb;
            byte[] arr_b1 = ((zzid)zzht0).zzb;
            int v2 = this.zze();
            int v3 = this.zze();
            for(int v4 = ((zzid)zzht0).zze(); v3 < v2 + v1; ++v4) {
                if(arr_b[v3] != arr_b1[v4]) {
                    return false;
                }
                ++v3;
            }
            return true;
        }
        return zzht0.zza(0, v1).equals(this.zza(0, v1));
    }

    @Override  // com.google.android.gms.internal.vision.zzht
    byte zzb(int v) {
        return this.zzb[v];
    }

    @Override  // com.google.android.gms.internal.vision.zzht
    public final boolean zzc() {
        int v = this.zze();
        int v1 = this.zza();
        return zzmd.zza(this.zzb, v, v1 + v);
    }

    protected int zze() {
        return 0;
    }
}


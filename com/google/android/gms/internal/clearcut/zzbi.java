package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.nio.charset.Charset;

class zzbi extends zzbh {
    protected final byte[] zzfp;

    zzbi(byte[] arr_b) {
        this.zzfp = arr_b;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzbb
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof zzbb)) {
            return false;
        }
        if(this.size() != ((zzbb)object0).size()) {
            return false;
        }
        if(this.size() == 0) {
            return true;
        }
        if(object0 instanceof zzbi) {
            int v = this.zzab();
            int v1 = ((zzbi)object0).zzab();
            return v == 0 || v1 == 0 || v == v1 ? this.zza(((zzbi)object0), 0, this.size()) : false;
        }
        return object0.equals(this);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzbb
    public int size() {
        return this.zzfp.length;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzbb
    protected final int zza(int v, int v1, int v2) {
        return zzci.zza(v, this.zzfp, this.zzac(), v2);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzbb
    public final zzbb zza(int v, int v1) {
        int v2 = zzbb.zzb(0, v1, this.size());
        return v2 == 0 ? zzbb.zzfi : new zzbe(this.zzfp, this.zzac(), v2);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzbb
    protected final String zza(Charset charset0) {
        return new String(this.zzfp, this.zzac(), this.size(), charset0);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzbb
    final void zza(zzba zzba0) throws IOException {
        zzba0.zza(this.zzfp, this.zzac(), this.size());
    }

    @Override  // com.google.android.gms.internal.clearcut.zzbh
    final boolean zza(zzbb zzbb0, int v, int v1) {
        if(v1 > zzbb0.size()) {
            throw new IllegalArgumentException("Length too large: " + v1 + this.size());
        }
        if(v1 > zzbb0.size()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + v1 + ", " + zzbb0.size());
        }
        if(zzbb0 instanceof zzbi) {
            byte[] arr_b = this.zzfp;
            byte[] arr_b1 = ((zzbi)zzbb0).zzfp;
            int v2 = this.zzac();
            int v3 = this.zzac();
            for(int v4 = ((zzbi)zzbb0).zzac(); v3 < v2 + v1; ++v4) {
                if(arr_b[v3] != arr_b1[v4]) {
                    return false;
                }
                ++v3;
            }
            return true;
        }
        return zzbb0.zza(0, v1).equals(this.zza(0, v1));
    }

    @Override  // com.google.android.gms.internal.clearcut.zzbb
    public final boolean zzaa() {
        int v = this.zzac();
        return zzff.zze(this.zzfp, v, this.size() + v);
    }

    protected int zzac() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzbb
    public byte zzj(int v) {
        return this.zzfp[v];
    }
}

